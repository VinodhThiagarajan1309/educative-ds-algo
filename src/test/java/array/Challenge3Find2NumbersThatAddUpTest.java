package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Challenge3Find2NumbersThatAddUpTest {

    @Test
    public void findSum() {
        int[] input = {1, 21, 3, 14, 5, 60, 7, 6};
        int[] expectedRes = {21, 6};

        assertArrayEquals(expectedRes,new Challenge3Find2NumbersThatAddUp().findSum(input,27));
    }
}