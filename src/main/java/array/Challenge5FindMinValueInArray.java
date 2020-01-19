package array;

public class Challenge5FindMinValueInArray {

    public int findMinimum(int[] arr) {

        int presentMin = Integer.MAX_VALUE;

        for(int currVal : arr)  {
            presentMin = Math.min(currVal,presentMin);
        }

        // Write your code here
        return presentMin;
    }
}
