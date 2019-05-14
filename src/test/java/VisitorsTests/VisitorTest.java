package VisitorsTests;

import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(18, 172, 35.0);
    }

    @Test
    public void hasAge(){
        assertEquals(18, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(172, visitor.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(35.0, visitor.getMoney(), 0.01);
    }



}
