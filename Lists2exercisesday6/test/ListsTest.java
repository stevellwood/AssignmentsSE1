package Modelling;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelling.Philosopher.Era;
import Modelling.Philosopher.Nationality;


public class ListsTest {
    List<Philosopher> philos1 = new ArrayList<>();
    List<Philosopher> philos2 = new ArrayList<>();

//  public PhilosopherTests() {
//
//  }
  @Before // this
  public void setup() {//test fixture
      //Philosopher e = null;
      this.philos1.add(new Philosopher(Nationality.GREEK,"Aristotle",new Era(-420,-360))); // e is generic variable name thatdoesn't have// assignment yet
      philos1.add(new Philosopher(Nationality.GREEK,"Socrates",new Era(-470,-399)));
      philos1.add(new Philosopher(Nationality.GERMAN,"Hegel",new Era(1770,1851)));
      philos1.add(new Philosopher(Nationality.GERMAN,"Nietchze",new Era(1844,1888)));
      philos2.add(new Philosopher(Nationality.ENGLISH,"jsm",new Era(1806,1872)));
      philos2.add(new Philosopher(Nationality.GERMAN,"Hegel",new Era(1770,1851)));
      philos2.add(new Philosopher(Nationality.GERMAN,"Nietchze",new Era(1844,1888)));
  }
  
    @After
    public void clear() {
        this.philos1.clear();
        this.philos2.clear();}

@Test

public void tmatch(){
    List<Philosopher> phcombo = new ArrayList<>();
    phcombo.add(new Philosopher(Nationality.GERMAN,"Nietchze",new Era(1844,1888)));
    phcombo.add(new Philosopher(Nationality.GERMAN,"Hegel",new Era(1770,1851)));
    List<Philosopher> matchList = Lists.match(philos1,philos2);
    showme(phcombo);
    showme(matchList);
    assertEquals(matchList,phcombo);
}
private <T> void showme(List<T> list)
{
    System.out.print(list.get(0));
    for (int i = 1; i < list.size(); i++)
    {
        System.out.print(", " + list.get(i));
    }
    System.out.println();
}
}
//public void foo() {
//    List<Philosopher> nonNationals = nonNationals(Nationality.GERMAN);
//    assertEquals("",3,nonNationals.size());
////    greeks.add(new Philosopher(Nationality.GREEK,"g",new Era(13,2)));
////    philo.add("socrates");