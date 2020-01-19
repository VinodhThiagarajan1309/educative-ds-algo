package array;

public class Challenge7Find2ndLargestItemInArray {

    public int findSecondMaximum(int[] arr)
    {

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE + 1;

        for(int j : arr) {

            if(j > firstMax ) {
                secondMax = firstMax;
                firstMax = j;
            } else if (j > secondMax) {
                secondMax = j;
            }

        }

        // Write - Your - Code
        return secondMax;
    }
}
