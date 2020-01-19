package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Challenge7Find2ndLargestItemInArrayTest {

    @Test
    public void findSecondMaximum() {
        int[] test = {9,2,3,6};
        int exp = 6;
        assertEquals(exp, new Challenge7Find2ndLargestItemInArray().findSecondMaximum(test));
    }

    @Test
    public void findSecondMaximum2() {
        int[] test = {4,2,1,5,0};
        int exp = 4;
        assertEquals(exp, new Challenge7Find2ndLargestItemInArray().findSecondMaximum(test));
    }
}