package chess;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tiy.ssa.weekone.asnm3.Mathse;
import com.tiy.ssa.weekone.asnm3.PigLatinse;

public class LocationTest {

    
    @Test
    public void sqrdroot() {
        Location loc       = new Location(1,2);
        Location loc2       = new Location(1,2);
        KnighT kn = new KnightT(new Location(-1,-2));
        assertTrue(loc2.equals(loc1));
        //pali1.toString(); this doees nothing
     
    }
}
