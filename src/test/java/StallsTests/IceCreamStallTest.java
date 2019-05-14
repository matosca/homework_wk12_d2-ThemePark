package StallsTests;

import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Frosty IceCream", "Someone", 4, 7);
    }

    @Test
    public void hasName(){
        assertEquals("Frosty IceCream", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Someone", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(4, iceCreamStall.getParkingSpot());
    }

    @Test
    public void hasRating(){
        assertEquals(7, iceCreamStall.getRating());
    }
}
