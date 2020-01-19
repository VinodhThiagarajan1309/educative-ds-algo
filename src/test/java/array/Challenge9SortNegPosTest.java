package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Challenge9SortNegPosTest {

    @Test
    public void reArrange() {
        int[] inp = {10, -1, 20, 4, 5, -9, -6};

        new Challenge9SortNegPos().reArrange(inp);
    }
}