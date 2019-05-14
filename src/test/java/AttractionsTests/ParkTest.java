package AttractionsTests;

import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Funland", 7);
    }

    @Test
    public void hasName(){
        assertEquals("Funland", park.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(7, park.getRating());
    }
}
