package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Challenge5FindMinValueInArrayTest {

    @Test
    public void findMinimum() {

        int[] arr = {9, 2, 3, 6};

        int exp = 2;

        assertEquals(exp, new Challenge5FindMinValueInArray().findMinimum(arr));
    }

    @Test
    public void findMinimum2() {

        int[] arr = {4,2,1,5,0};

        int exp = 0;

        assertEquals(exp, new Challenge5FindMinValueInArray().findMinimum(arr));
    }
}