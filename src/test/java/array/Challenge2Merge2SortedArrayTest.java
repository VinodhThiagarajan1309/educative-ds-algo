package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Challenge2Merge2SortedArrayTest {

    @Test
    public void mergeArraysPositiveTest() {
        int[] arr1 = {1,3,4,5};
        int[] arr2 = {2,6,7,8};

        int[] expected = {1,2,3,4,5,6,7,8};

        assertArrayEquals(expected,new Challenge2Merge2SortedArray().mergeArrays(arr1,arr2));
    }


    @Test
    public void mergeArraysPositiveTest2() {
        int[] arr1 = {-4,-1,3,5,29807};
        int[] arr2 = {-7,2,6,8,190,8764};

        int[] expected = {-7,-4,-1,2,3,5,6,8,190,8764,29807};

        assertArrayEquals(expected,new Challenge2Merge2SortedArray().mergeArrays(arr1,arr2));
    }
}