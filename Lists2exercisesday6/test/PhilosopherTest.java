package Modelling;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.*;

import org.junit.Test;

import Modelling.Philosopher.Era;
import Modelling.Philosopher.Nationality;

public class PhilosopherTest {
        List<Philosopher> philos = new ArrayList<>();

//        public PhilosopherTests() {
//
//        }
        @Before // this
        public void setup() {//test fixture
            //Philosopher e = null;
            this.philos.add(new Philosopher(Nationality.GREEK,"Aristotle",new Era(-420,-360))); // e is generic variable name thatdoesn't have// assignment yet
            philos.add(new Philosopher(Nationality.GREEK,"Socrates",new Era(-470,-399)));
            philos.add(new Philosopher(Nationality.GERMAN,"Hegel",new Era(1770,1851)));
            philos.add(new Philosopher(Nationality.GERMAN,"Nietchze",new Era(1844,1888)));
            philos.add(new Philosopher(Nationality.ENGLISH,"jsm",new Era(1806,1872)));
        }
        @After
        public void clear() {
            this.philos.clear();}
               
        @Test
        public void filter(){
            List<Philosopher> greeks = new ArrayList<>();
            greeks.add(new Philosopher(Nationality.GREEK,"g",new Era(13,2)));//necessary?
            assertEquals("",1,greeks.size());
            //what is the stream doing?
            assertEquals("",1,greeks.stream().filter(p ->p.getName().equals("Aristotle")).count());
            assertEquals("",1,greeks.stream().filter(p ->p.getName().equals("Socrates")).count());
        }
        @Test
        public void foo() {
            List<Philosopher> nonNationals = nonNationals(Nationality.GERMAN);
            assertEquals("",2,nonNationals.size());
//            greeks.add(new Philosopher(Nationality.GREEK,"g",new Era(13,2)));
//            philo.add("socrates");
        }
        @Test
        public void include19th(){
            inclusivePlace(19);
            assertEquals("NIe Mill and Heidigger",3, this.philos.size());
        }
        @Test
        public void exclusionary(){
            exclude4thBCGreeksandEnglish();
            assertEquals("",3, this.philos.size());
        }
        @Test
        public void centuryTests(){
            assertTrue("", new Era(1503, 1587).inCentury(16));
            assertTrue("", new Era(-487,-411).inCentury(-5));
        }
        //@Test//why is this only here? we are just filling out an arrayl for testing elsewhere, we can still add assert statements to be tested here
        List <Philosopher> nationality(Nationality nation)
        {
            List<Philosopher> greeks = new ArrayList<>();
            for (Philosopher philos : this.philos){
                if (nation == philos.getNationality())
                    greeks.add(philos);
            }
            //assertFalse(philos.add(Nationality asdf));
            return greeks;
        }
        List <Philosopher> nonNationals(Nationality nation)
        {
            List<Philosopher> aliens = new ArrayList<>();
            for (Philosopher philos : this.philos){  //for each phil in top array
                if (nation != philos.getNationality())// if has no nationality
                    aliens.add(philos);
            }
            //assertFalse(philos.add(Nationality asdf));
            return aliens;
        }
        void inclusivePlace(int century){
            for (Iterator <Philosopher>iterator = this.philos.iterator(); iterator.hasNext();) {//for each philos
                Philosopher next =  iterator.next();  //assign the philospher into the p
                if (! next.inCentury(century)) //if they aren't in the passed in century, remove them form top array list
                    iterator.remove();
            }
        }
        void exclude4thBCGreeksandEnglish(){
            for (Iterator <Philosopher>iterator = this.philos.iterator(); iterator.hasNext();) {
                Philosopher next =  iterator.next();
                if ((next.getNationality() == Nationality.ENGLISH || next.getNationality() == Nationality.GREEK) && next.inCentury(-4))
                    iterator.remove();
                next.toString();
                System.out.println(next.toString());
            }

        }
}
