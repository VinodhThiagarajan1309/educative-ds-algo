package array;

import java.util.HashMap;
import java.util.Map;

public class Challenge3Find2NumbersThatAddUp {

    public int[] findSum(int[] arr, int n) {
        int[] answer = new int[2];
        // write your code here

        Map<Integer, Integer> hmMap = new HashMap<>();
        for (int x : arr) {

            if (hmMap.containsKey(x)) {
                answer[0] = hmMap.get(x);
                answer[1] = x;
                return answer;
            } else {
                int currDiff = n - x;
                hmMap.put(currDiff, x);
            }
        }

        return null;   // return the elements in the array whose sum is equal to the value passed as parameter
    }


}
