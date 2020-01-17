package array;

public class Challenge4ArrayOfProductsExceptItself {

    public int[] findProduct(int arr[])
    {
        int [] result = new int[arr.length];
        boolean hasZero = false;

        // 1 5 9 7 6
        // Muliply all the number skipping zeros
        // Check if there is a zero and flag it
        // if current number is zero set the master result

        int masterResult = 1;
        for(int x : arr) {
            if(x != 0) {
                masterResult =  x * masterResult;
            } else {
                hasZero = true;
            }
        }

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == 0) {
                result[i] = masterResult;
            } else {
                if(hasZero) {
                    result[i] = 0;
                } else {
                    result[i] = masterResult/arr[i];
                }

            }

        }


        // write your code here
        return result;
    }

    public int[] findProduct2(int arr[])
    {
        int n = arr.length;
        int i, temp = 1;

        // Allocation of result array
        int result[] = new int[n];

        // Initializing the result array by 1
        for(int j=0; j < n; j++)
            result[j] = 1;

        // Product of elements on left side excluding arr[i]
        for (i = 0; i < n; i++)
        {
            result[i] = temp;
            temp *= arr[i];
        }

        // Initializing temp to 1 for product on right side
        temp = 1;

        // Product of elements on right side excluding arr[i]
        for (i = n - 1; i >= 0; i--)
        {
            result[i] *= temp;
            temp *= arr[i];
        }

        return result;
    }
    public static String arrayToString(int arr[]){
        if (arr.length > 0){
            String result = "";
            for(int i = 0; i < arr.length; i++) {
                result += arr[i] + " ";
            }
            return result;
        }
        else {
            return "Empty Array!";
        }
    }
}
