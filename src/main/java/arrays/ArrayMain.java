package arrays;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {

        Array array = new Array();

        int[] testArray = {20, 2, 6, 48, 4};

        int[] sortedTestArray = array.sortedDescendingArrays(testArray);

        array.printArray(sortedTestArray);

        int[] ascendingTestArray = {20, 2, 6, 48, 4};

        int[] sortedAscendingArr = array.sortedAscendingArrays(ascendingTestArray);

        array.printArray(sortedAscendingArr);
    }
}
