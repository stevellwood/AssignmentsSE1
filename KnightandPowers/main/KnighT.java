package chess;

import static org.junit.Assert.*;

import java.util.ArrayList;
public class KnighT {
    final Location origin;//can't chane
    public Location current;
    public Location previous;
    private int movecount=0;
    ArrayList<Location> path = new ArrayList<Location>();
    public KnighT(){//Why is it forcing me to initialize this
        this.origin = new Location (0,0);
        this.current = origin;
        path.add(origin);
    }
    public KnighT(Location origin){
        this.current = this.origin = origin;
    }
    public String getLocation() {
        String loc = "Location: ("+current.x+","+current.y+")";
        return loc; //current doesn't work??
    }
    public Location move(){
//       if (ishome())
//            this.current = this.origin.offset(1, 2);
//             movecount++;
       switch(movecount){
           case 0:
               current.x=0; current.y=0;
               movecount++;
               path.add(current);
               break;
           case 1:
               current = this.current.offset(1, 2);
               movecount++;
               path.add(current);
               break;
           case 2:
               current = this.current.offset(1, -2);
               movecount++;
               path.add(current);
               break;
           case 3:
               current = this.current.offset(-1, -2);
               movecount++;
               path.add(current);
               break;
           case 4:
               current = this.current.offset(-1, 2);
               movecount++;
               path.add(current);
               break;
//           case 5:
//               current = this.current.offset(1, 2);
//               movecount++;
//               break;
//           case 6:
//               current = this.current.offset(1, 2);
//               movecount++;
//               break;
//           case 7:
//               current = this.current.offset(1, 2);
//               movecount++;
//               break;
           default:System.out.println("PRoblem in moves"); 
   }
        return current;
 }
    private static void verify (KnighT knight){  
       // assertTrue("We presume a knight ishome", knight.ishome());
        Location prior = knight.origin;
        Path firstMove =null;
        int moves = 0;
        
        do{
        Location latter = knight.move();
        //assertTrue("", validMove(prior,latter));
        if (null == firstMove)
            firstMove = new Path(prior,latter);
        else
        //    assertFalse("No backtracking",firstMove.isRetrace(new Path(prior,latter));
        prior = latter;
        }
        while (moves++ < 4 && ! knight.ishome());
        assertEquals("4 -> No more n o less", 4 , moves);
    }    
    
    public boolean ishome(){
        if ((current.x == origin.x)&&(current.y== origin.y))
            return true;
        else return false;
    }
//    public static boolean validMove(Location from, Location to){
//        int yDiff = from.y - to.y;
//        switch (Math.abs(from.x - to.x)){
//        case 1: 
//        case 2: 
//        case 3: 
//        case 4: 
//        case 5: 
//        case 6: 
//    }
    public boolean notReverse()
    {
       if we end up at the startpos of the previous move, we did a reverse
       if current == 
    }
    public boolean shortestPath(){
    
        if(movecount == 4)
                   return true;
        else
            return false;
    } 
    public String getPosition()
    {
        return getLocation();
    }
}
