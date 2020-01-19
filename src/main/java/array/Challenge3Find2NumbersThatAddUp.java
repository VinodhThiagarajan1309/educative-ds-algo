package array;

import java.util.HashMap;
import java.util.Map;

public class Challenge3Find2NumbersThatAddUp {

    public int[] findSum(int[] arr, int n) {
        int[] result = new int[2];
        // write your code here

        Map<Integer, Integer> hmMap = new HashMap<>();
        for (int x : arr) {

            if (hmMap.containsKey(x)) {
                result[0] = hmMap.get(x);
                result[1] = x;
                return result;
            } else {
                int currDiff = n - x;
                hmMap.put(currDiff, x);
            }
        }

        return null;   // return the elements in the array whose sum is equal to the value passed as parameter
    }


}
