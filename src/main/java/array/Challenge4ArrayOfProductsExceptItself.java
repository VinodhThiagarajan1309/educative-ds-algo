package array;

public class Challenge4ArrayOfProductsExceptItself {

    public int[] findProduct(int arr[]) {
        int[] result = new int[arr.length];
        boolean hasZero = false;

        // 1 5 9 7 6
        // Muliply all the number skipping zeros
        // Check if there is a zero and flag it
        // if current number is zero set the master result

        int masterResult = 1;
        for (int x : arr) {
            if (x != 0) {
                masterResult = x * masterResult;
            } else {
                hasZero = true;
            }
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                result[i] = masterResult;
            } else {
                if (hasZero) {
                    result[i] = 0;
                } else {
                    result[i] = masterResult / arr[i];
                }

            }

        }


        // write your code here
        return result;
    }

    public int[] findProduct2(int arr[]) {
        int n = arr.length;
        int i, temp = 1;

        // Allocation of result array
        int result[] = new int[n];

        // Initializing the result array by 1
        for (int j = 0; j < n; j++)
            result[j] = 1;

        for (int k = 0; k < n; k++) {
            result[k] = temp;
            temp *= arr[k];
        }

        temp = 1;

        for (int z = n - 1 ; z >= 0; z--) {
            result[z] *= temp;
            temp *= arr[z];
        }



        return result;
    }


}
