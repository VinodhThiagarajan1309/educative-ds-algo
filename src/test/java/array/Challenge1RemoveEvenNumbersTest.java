package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Challenge1RemoveEvenNumbersTest {

    @Test
    public void removeEvenIntegersPositiveTestCase() {
        int[] testThis = {1,2,4,5,10,6,3};
        int[] expected = {1,5,3};
        assertArrayEquals(expected, new Challenge1RemoveEvenNumbers().removeEvenIntegers(testThis));
    }

    @Test
    public void removeEvenIntegersWithNoItems() {
        int[] testThis = {};
        assertArrayEquals(null, new Challenge1RemoveEvenNumbers().removeEvenIntegers(testThis));
    }

    @Test
    public void removeEvenIntegersExpectEmptyArray() {
        int[] testThis = {2,4,6,8};
        assertArrayEquals(null, new Challenge1RemoveEvenNumbers().removeEvenIntegers(testThis));
    }
}