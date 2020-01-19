package array;

public class Challenge9SortNegPos {

    public  void reArrange(int[] arr) {

        //Write - Your - Code
        int[] orderedArr = new int[arr.length];
        int posCounter = 0;
        int negCounter = arr.length-1;

        for(int i : arr) {

            if(i < 0) {
                orderedArr[posCounter++] = i;
            } else {
                orderedArr[negCounter--] = i;
            }

        }
        arr  = orderedArr;
    }
}
