package chess;
import java.util.*;
import java.util.Random;
public class Knightrandom {
    int ox, oy;
    
    
     public Knightrandom(int x,int y){
        this.ox = x;
        this.oy = y;
    }
//public ai is consructo with a poiition
//move takes no arguments
//move() no paratmer
//return value
//getPosition()//no parameters
//test keeps track of moves
//override tostring
//islegal()
//minimum number of moves = x
//verify knight with x is at home
//Position, Knight, path, last path
//knight only has to respond to a move command and get position
        void moveNortheast() {
            this.oy += 2;
            this.ox += 1;
            }
        void moveNorthwest() {
            this.oy += 2;
            this.ox -= 1;
             }
        void moveEastnorth() {
            this.oy += 1;
            this.ox += 2;
        }
        void moveEastsouth() {
            this.oy -= 1;
            this.ox += 2;
        }
        void moveSoutheast() {
            this.oy -= 2;
            this.ox += 1;
        }
        void moveSouthwest() {
            this.oy -= 2;
            this.ox += 1;
        }
        void moveWestnorth() {
            this.oy += 1;
            this.ox -= 2;
        }
        void moveWestsouth() {
            this.oy -= 1;
            this.ox -= 2;
        }
        void report() {
        System.out.println("Location: " + ox + ", " + oy); 
        }
    public int opposite(int opposite){
        //int opposite=-1;
        switch (opposite) {    
        case 0:
            opposite = 5;
            break;
        case 1:
            opposite = 4;
            break;
        case 2:
            opposite = 7;
            break;
        case 3:
            opposite = 6;
            break;
        case 4:
            opposite = 1;
            break;
        case 5:
            opposite = 0;
            break;
        case 6:
            opposite = 3;
            break;
        case 7:
            opposite = 2;
            break;
        default: System.out.println("!@Problem in opposite method");
        }
        return opposite;
    }
    
        
    

//class KnightDriver {
    
    
    public void moveRand(){
        int direction; 
        int[] dirno = new int[8];
        Random generator = new Random(); 
        for (int i = 0; i < 5; i++) {
//        direction = Math.abs(generator.nextInt()) % 4; 
//        if        (direction == 0) { // N//(dirno[0]!=null)&&
            direction = generator.nextInt(8);
            int lastdir = dirno.length-1;
            if ((opposite(direction) == (dirno[lastdir]+1))){
                System.out.println("retracingbad=dir: "+direction);
                //i--;
                direction = generator.nextInt(8);}
            dirno[i] = direction;
            
            switch (direction) {
                case 0:
                    this.moveNortheast();
                    break;
                case 1:
                    this.moveNorthwest();
                    break;
                case 2:
                    this.moveEastnorth();
                    break;
                case 3:
                    this.moveEastsouth();
                    break;
                case 4:
                    this.moveSoutheast();
                    break;
                case 5:
                    this.moveSouthwest();
                    break;
                case 6:
                    this.moveWestnorth();
                    break;
                case 7:
                    this.moveWestsouth();
                    break;
                default:System.out.println("Impossible!"); 
            }
            System.out.println("After "+i+"tries directions chosen :");
            this.report();
        }  
    }

    public static void main(String[] args) {
        Knightrandom sir = new Knightrandom(0, 0); 
        sir.moveRand();
    }
}

 //http://codereview.stackexchange.com/questions/123085/calculating-all-possible-knight-turns-chess/123669#123669
