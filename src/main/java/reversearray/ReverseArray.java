package reversearray;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    public int[] reverse(int[] array) {

        // go till the half and swap with the mirror element!!!

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;  // --> if you do not divide it by 2 it gives back the origin array
                                            // as from the middle change the values back to original place!

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int num: array) {
            System.out.println(num);
        }
    }

    public void reverseBuiltInIntegerArray(Integer[] array) {
        // this must be integer array not int array!!!
        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.asList(array));
    }
}
