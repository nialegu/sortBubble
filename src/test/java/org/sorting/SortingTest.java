package org.sorting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest{

    @Test
    public void mainTest() {
        Sorting sorting = new Sorting();
        int[] mas = {2,1,8,4};
        int[] sortedArr = sorting.sortBubble(mas);
        for(int i = 0; i<mas.length-1; i++){
            assertEquals(sortedArr[i]<= sortedArr[i+1], true);
        }
    }
}