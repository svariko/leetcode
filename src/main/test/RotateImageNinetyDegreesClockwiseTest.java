package main.test;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import main.java.RotateImageNinetyDegreesClockwise;
import static org.junit.Assert.*;

public class RotateImageNinetyDegreesClockwiseTest {
    private RotateImageNinetyDegreesClockwise rotateImageNinetyDegreesClockwise;

    @Before
    public void setUp() {
        rotateImageNinetyDegreesClockwise = new RotateImageNinetyDegreesClockwise();
    }

    @Test
    public void test1() {
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] expectedOutput = {{7,4,1},{8,5,2},{9,6,3}};

        rotateImageNinetyDegreesClockwise.rotate(input);

        Assert.assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void test2() {
        int[][] input = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] expectedOutput = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};

        rotateImageNinetyDegreesClockwise.rotate(input);

        Assert.assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void test3() {
        int[][] input = {{1}};
        int[][] expectedOutput = {{1}};

        rotateImageNinetyDegreesClockwise.rotate(input);

        Assert.assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void test4() {
        int[][] input = {{1,2},{3,4}};
        int[][] expectedOutput = {{3,1},{4,2}};

        rotateImageNinetyDegreesClockwise.rotate(input);

        Assert.assertArrayEquals(expectedOutput, input);
    }

}
