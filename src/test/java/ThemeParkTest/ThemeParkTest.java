package ThemeParkTest;

import ThemePark.ThemePark;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void before(){
        themePark = new ThemePark();
    }

    @Test
    public void hasAllReviews(){
        themePark.getAllReviews();
        assertEquals(0, themePark.countReviews());
    }
}
