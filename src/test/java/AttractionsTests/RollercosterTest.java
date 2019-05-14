package AttractionsTests;

import Attractions.Rollercoster;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercosterTest {

    Rollercoster rollercoster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        rollercoster = new Rollercoster("Scaryboo", 10);
        visitor1 = new Visitor(20, 169, 10.0);
        visitor2 = new Visitor(9, 139, 10.5);
    }

    @Test
    public void hasName(){
        assertEquals("Scaryboo", rollercoster.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(10, rollercoster.getRating());
    }

    @Test
    public void visitorIsAllowedToRideRollercoster(){
        assertEquals(true, rollercoster.isAllowedTo(visitor1));
    }

    @Test
    public void visitorIsNotAllowedToRideRollercoster(){
        assertEquals(false, rollercoster.isAllowedTo(visitor2));
    }


}
