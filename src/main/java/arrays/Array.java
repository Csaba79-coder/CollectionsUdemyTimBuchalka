package arrays;

import java.util.Arrays;

public class Array {

    public void printArray(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }

    public int[] sortedDescendingArrays(int[] array) {

        // refactor the for loop with a built-in function!
        int[] sortedArray = Arrays.copyOf(array, array.length);

        /*
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        */

        boolean flag = true;
        int temp;
        
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public int[] sortedAscendingArrays(int[] array) {
        int temp;
        for (int i = 0; i <array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {      //swap elements if not in order
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
