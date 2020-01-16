package array;

import java.util.ArrayList;
import java.util.List;

public class Challenge1RemoveEvenNumbers {


    /**
     * My Lame Solution
     * @param inputArr
     * @return
     */
    public int[] removeEvenIntegers(int[] inputArr) {

        List<Integer> integerList = new ArrayList<>();
        if(inputArr.length == 0) {
            return null;
        } else {
            for(int i : inputArr) {
                int modRes = i % 2;
                if(modRes != 0) {
                    integerList.add(i);
                }
            }
        }

        int[] result = new int[integerList.size()];
        for(int j = 0; j < integerList.size(); j++) {
            result[j] = integerList.get(j);
        }

        return result.length == 0 ? null : result;
    }
}
