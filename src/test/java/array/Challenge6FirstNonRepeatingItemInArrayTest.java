package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Challenge6FirstNonRepeatingItemInArrayTest {

    @Test
    public void findFirstUnique() {
        int[] arr = {9, 2, 3, 2, 6, 6};
        int exp = 9;
        assertEquals(exp,new Challenge6FirstNonRepeatingItemInArray().findFirstUnique(arr));
    }

    @Test
    public void findFirstUnique2() {
        int[] arr = {4,5,1,2,0,4};
        int exp = 5;
        assertEquals(exp,new Challenge6FirstNonRepeatingItemInArray().findFirstUnique(arr));
    }
}