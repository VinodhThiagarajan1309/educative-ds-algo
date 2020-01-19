package array;

public class Challenge8RightRotateArrayBy1Index {
    //Rotates given Array by 1 position
    public static void rotateArray(int[] arr) {

        //Store last element of Array.
        //Start from the Second last and Right Shift the Array by one.
        //Store the last element saved on the first index of the Array.
        int lastElement = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {

            arr[i] = arr[i - 1];
        }

        arr[0] = lastElement;
    } //end of rotateArray

}
