package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Challenge4ArrayOfProductsExceptItselfTest {

    @Test
    public void findProductTest1() {
        int[] input = {1,2,3,4};
        int[] expectedResult = {24,12,8,6};
        assertArrayEquals(expectedResult, new Challenge4ArrayOfProductsExceptItself().findProduct(input));
    }

    @Test
    public void findProductTest2() {
        int[] input = {4,2,1,5,0};
        int[] expectedResult = {0,0,0,0,40};
        assertArrayEquals(expectedResult, new Challenge4ArrayOfProductsExceptItself().findProduct(input));
    }

    @Test
    public void findProductTest1_2() {
        int[] input = {1,2,3,4};
        int[] expectedResult = {24,12,8,6};
        assertArrayEquals(expectedResult, new Challenge4ArrayOfProductsExceptItself().findProduct2(input));
    }
}