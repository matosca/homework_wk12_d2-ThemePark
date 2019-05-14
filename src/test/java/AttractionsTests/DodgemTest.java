package AttractionsTests;

import Attractions.Dodgem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgem dodgem;

    @Before
    public void before(){
        dodgem = new Dodgem("Dodgem Crazy", 8);
    }

    @Test
    public void hasName(){
        assertEquals("Dodgem Crazy", dodgem.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(8, dodgem.getRating());
    }
}
