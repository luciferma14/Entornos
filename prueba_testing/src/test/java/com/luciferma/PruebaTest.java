package com.luciferma;

import static org.junit.Assert.*;
import org.junit.Test;

public class PruebaTest {
    String str1 = new String("abc");
    String str2 = new String("abc");
    String str3 = null;
    String str4 = "abc";
    String str5 = "abc";
    
    int val1 = 5;
    int val2 = 6;

    String[] expectedArray = {"one", "two", "three"};
    String[] resultArray = {"one", "two", "three"};

    @Test
    public void testTwoObjectsAreEquals(){
        assertEquals(str1,str2);
    }

    @Test
    public void testConditionTrue(){
        assertTrue(val2 > val1);
    }

    @Test
    public void testConditionFalse(){
        assertFalse(val2 < val1);
    }

    @Test
    public void testNotNull(){
        assertNotNull(str1);
    }

    @Test
    public void testNull(){
        assertNull(str3);
    }

    @Test
    public void testIsSame(){
        assertSame(str4, str5);
    }

    @Test
    public void testNotSame(){
        assertNotSame(str1, str3);
    }

    @Test
    public void testSameArray(){
        assertArrayEquals(expectedArray, resultArray);
    }
}
