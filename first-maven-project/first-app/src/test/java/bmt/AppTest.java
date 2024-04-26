package bmt;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void testAssertEquals() {
        int expected = 5;
        int actual = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void testAssertTrue() {
        assertTrue(true);
    }

    @Test
    public void testAssertFalse() {
        assertFalse(false);
    }

    @Test
    public void testAssertNull() {
        Object obj = null;
        assertNull(obj);
    }

    @Test
    public void testAssertNotNull() {
        Object obj = new Object();
        assertNotNull(obj);
    }
}
