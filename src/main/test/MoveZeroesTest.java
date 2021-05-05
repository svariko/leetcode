package main.test;

import main.java.MoveZeroes;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class MoveZeroesTest {

    private MoveZeroes moveZeroes;

    @Before
    public void setUp() {
        moveZeroes = new MoveZeroes();
    }

    @Test
    public void test1() {
        int[] input = new int[] {0,1,0,3,12};
        int[] expectedOutput = new int[] {1,3,12,0,0};

        moveZeroes.moveZeroes(input);

        assertArrayEquals(expectedOutput, input);

    }

    @Test
    public void test2() {
        int[] input = new int[] {0,0,0,1,1,2,3,0,4,0,5,0,0,6,7,8,9,0};
        int[] expectedOutput = new int[] {1,1,2,3,4,5,6,7,8,9,0,0,0,0,0,0,0,0};

        moveZeroes.moveZeroes(input);

        assertArrayEquals(expectedOutput, input);


    }

    @Test
    public void test3() {
        int[] input = new int[] {1,2,3,0,0,4,5};
        int[] expectedOutput = new int[] {1,2,3,4,5,0,0};

        moveZeroes.moveZeroes(input);

        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void test4() {
        int[] input = new int[] {0,0,0};
        int[] expectedOutput = new int[] {0,0,0};

        moveZeroes.moveZeroes(input);

        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void test5() {
        int[] input = new int[] {1,2,3};
        int[] expectedOutput = new int[] {1,2,3};

        moveZeroes.moveZeroes(input);

        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void test6() {
        int[] input = null;
        int[] expectedOutput = null;

        moveZeroes.moveZeroes(input);

        assertArrayEquals(expectedOutput, input);

    }

    @Test
    public void test7() {
        int[] input = new int[0];
        int[] expectedOutput = new int[0];

        moveZeroes.moveZeroes(input);

        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void test8() {
        int[] input = new int[] {1};
        int[] expectedOutput = new int[] {1};

        moveZeroes.moveZeroes(input);

        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void test9() {
        int[] input = new int[] {0};
        int[] expectedOutput = new int[] {0};

        moveZeroes.moveZeroes(input);

        assertArrayEquals(expectedOutput, input);
    }


}
