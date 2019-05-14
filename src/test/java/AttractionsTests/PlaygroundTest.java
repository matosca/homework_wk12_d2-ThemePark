package AttractionsTests;

import Attractions.Playground;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        playground = new Playground("Wonderland", 8);
        visitor1 = new Visitor(13, 145, 15.5);
        visitor2 = new Visitor(17, 170, 20.6);
    }

    @Test
    public void hasName(){
        assertEquals("Wonderland", playground.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(8, playground.getRating());
    }

    @Test
    public void checkVisitorAgeAllowed(){
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void checkVisitorAgeNotAllowed(){
        assertEquals(false, playground.isAllowedTo(visitor2));
    }
}
