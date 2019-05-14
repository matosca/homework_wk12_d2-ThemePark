package StallsTests;

import Stalls.TobaccoStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Estanco", "Pepe", 2, 4);
        visitor1 = new Visitor(25, 165, 50.0);
        visitor2 = new Visitor(17, 140, 20.7);
    }

    @Test
    public void hasName(){
        assertEquals("Estanco", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Pepe", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(2, tobaccoStall.getParkingSpot());
    }

    @Test
    public void hasRating(){
        assertEquals(4, tobaccoStall.getRating());
    }

    @Test
    public void visitorIsAllowedToGetTobacco(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void visitorIsNotAllowedToGetTobacco(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor2));
    }

}
