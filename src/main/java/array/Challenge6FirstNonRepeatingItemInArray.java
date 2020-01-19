package array;

import java.util.*;

public class Challenge6FirstNonRepeatingItemInArray {

    public int findFirstUnique(int[] arr)
    {

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> removedItems = new HashSet<>();

        for(int curNum : arr) {
            if(linkedHashSet.contains(curNum) || removedItems.contains(curNum)) {
                linkedHashSet.remove(curNum);
                removedItems.add(curNum);
            } else {
                linkedHashSet.add(curNum);
            }
        }

        return linkedHashSet.iterator().next();
    }
}
