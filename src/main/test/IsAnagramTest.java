package main.test;

import main.java.IsAnagram;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class IsAnagramTest {
    private IsAnagram isAnagram;

    @Before
    public void setUp() {
        isAnagram = new IsAnagram();
    }

    @Test
    public void test1() {
        String s = "anagram";
        String t = "nagaram";

        assertTrue(isAnagram.isAnagram(s, t));
    }

    @Test
    public void test2() {
        String s = "rat";
        String t = "car";

        assertFalse(isAnagram.isAnagram(s, t));
    }

    @Test
    public void test3() {
        String s = "";
        String t = "";

        assertTrue(isAnagram.isAnagram(s,t));
    }

    @Test
    public void test4() {
        String s = "abba";
        String t = "aabb";

        assertTrue(isAnagram.isAnagram(s, t));
    }

    @Test
    public void test5() {
        String s = "abbac";
        String t = "abbaca";

        assertFalse(isAnagram.isAnagram(s, t));
    }

    @Test
    public void test6() {
        String s = "";
        String t = "hello";

        assertFalse(isAnagram.isAnagram(s, t));
    }

}
