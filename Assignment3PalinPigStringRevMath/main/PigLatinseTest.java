package com.tiy.ssa.weekone.asnm3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PigLatinseTest {
    String startsWithVowel = "ellwood";
    String startsWithOneConsonant = "larry";
    String startsWithTwoConsonants = "child";
    //only test 3 fails here
    @Test
    public void test() {
       assertTrue("ealwoodway".compareToIgnoreCase(PigLatinse.translate(startsWithVowel)) == 0);
        assertTrue("arrylay".compareToIgnoreCase(PigLatinse.translate(startsWithOneConsonant)) == 0);
        assertTrue("ildchay".compareToIgnoreCase(PigLatinse.translate(startsWithTwoConsonants)) == 0);
    }


}
