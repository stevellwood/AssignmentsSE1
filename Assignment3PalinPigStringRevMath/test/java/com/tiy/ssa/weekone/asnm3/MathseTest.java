package com.tiy.ssa.weekone.asnm3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathseTest {

    @Test
    public void sqrdroot() {
 // Why is this broken now?      
        Mathse maths = new Mathse();
        assertEquals("a", "2.0", Mathse.findsquareRoot(4.0));
        //pali1.toString(); this doees nothing
        //System.out.println(maths.toString());
        
        Mathse maths2 = new Mathse();
        assertNotEquals("a", "5", Mathse.findsquareRoot(16));
        //pali1.toString(); this doees nothing
       // System.out.println(line2.toString());
    
    Mathse maths3 = new Mathse();
    assertEquals("a", 3, maths3.findcubeRoot(27),.01);
    //pali1.toString(); this doees nothing
   // System.out.println(line2.toString());
    Mathse maths4 = new Mathse();
    assertNotEquals("a", "5", maths4.findsquareRoot(27));
}
}