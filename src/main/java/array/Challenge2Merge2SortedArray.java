package array;

public class Challenge2Merge2SortedArray {

    // merge arr1 and arr2 into a new result array
    public  int[] mergeArrays(int[] arr1, int[] arr2)
    {

        // Maintain 2 integers to fetch the next index from the each array
        int firstArrInd = 0,secondArrInd = 0,resultArrSizeIncr = 0;

        // Iterate from 0 to two array sizes combined
        int combinedArrayLength = arr1.length + arr2.length;
        // Initiate result array
        int result[] = new int[combinedArrayLength];

        while(resultArrSizeIncr < combinedArrayLength) {
            // fetch the first items from both array

            int firstArrItem = firstArrInd == arr1.length ? Integer.MAX_VALUE : arr1[firstArrInd];
            int secondArrItem = secondArrInd == arr2.length ? Integer.MAX_VALUE : arr2[secondArrInd];

            // compare and get the min of both
            // If both are same numbers
            if(firstArrItem == secondArrItem) {
                // add them to the result array
                result[resultArrSizeIncr++] = firstArrItem;
                firstArrInd++;
                result[resultArrSizeIncr++] = secondArrItem;
                secondArrInd++;
            } else {
                int smallestOfTwo = Math.min(firstArrItem,secondArrItem);
                if (smallestOfTwo == firstArrItem) {
                    result[resultArrSizeIncr++] = firstArrItem;
                    firstArrInd++;
                } else {
                    result[resultArrSizeIncr++] = secondArrItem;
                    secondArrInd++;
                }
            }
        }

        // write your code here
        return result; // make a new resultant array and return your results in that
    }
}
