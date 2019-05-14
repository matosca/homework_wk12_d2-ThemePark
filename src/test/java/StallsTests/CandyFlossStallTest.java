package StallsTests;

import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFloss;

    @Before
    public void before(){
        candyFloss = new CandyFlossStall("Sweet Sweet", "Maria", 1, 5);
    }

    @Test
    public void hasName(){
        assertEquals("Sweet Sweet", candyFloss.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Maria", candyFloss.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(1, candyFloss.getParkingSpot());
    }

    @Test
    public void hasRating(){
        assertEquals(5, candyFloss.getRating());
    }

}
