package chess;

import static org.junit.Assert.*;

import org.junit.Test;

public class KnighTTest {
//each move must be valid, backrack no, 4 moves home. knight starts at home
    @Test
    public void movement() {
        KnighT knight = new KnighT(new Location(0,0));
        System.err.println(knight.move());
        knight.move();
        knight.move();
        System.err.println(knight.move());
        assertEquals("",true,knight.ishome());
    }
    
    public void retracing(){
        //Position A > Location B -> Position A not allowed
        Location origin = new Location(-99,56);
        KnighT knight = new KnighT(origin);
        Location first  = knight.move();//move returns ending position
    }
    public void testThatKnightsMove()
    {
        KnighT testKnight = new KnighT();
        String initialLocation = testKnighT.getPosition();
        testKnighT.move();
        System.out.println(testKnight.getPosition());
        System.out.println("");
        String finalLocation = testKnight.getPosition();
        assertNotEquals(initialLocation, finalLocation);
    }
    
    @Test 
    public void testnobacktrackafteronemove()
    {
        KnighT testKnight = new KnighT();
        String initialLocation = testKnight.getPosition();
        testKnight.move();
        System.out.println(testKnight.getPosition());
        testKnight.move();
        System.out.println(testKnight.getPosition());
        String finalLocation = testKnight.getPosition();
        
        assertNotEquals(initialLocation, finalLocation);
    }
    
    
    
    private static void verify (KnighT knight){  
        assertTrue("We presume a knight ishome", knight.ishome());
   //is knight home
        Location prior = knight.origin;
        Path firstMove =null;
        int moves = 0;
        
        do{
        Location latter = knight.move();
        assertTrue("", validMove(prior,latter));//wwas it a valid move? 
        if (null == firstMove)
            firstMove = new Path(prior,latter);//resetting firstmove here
        else
            assertFalse("No backtracking",firstMove.isRetrace(new Path(prior,latter));
        prior = latter;//the latter becomes prior for the next loop
        }
        while (moves++ < 4 && ! knight.home());//if haven't reached the end
        assertEquals("4 -> No more n o less", 4 , moves);//moves goes from 0 to 4. ??wont' this fail first three tries
    }    
    
    public boolean ishome(){
        if ((current.x == origin.x)&&(current.y== origin.y))
            return true;
        else return false;
       
    public static boolean validMove(Location from, Location to){
        int yDiff = from.y - to.y;
        switch (Math.abs(from.x - to.x)){
        case 1: 
    }
}
}
