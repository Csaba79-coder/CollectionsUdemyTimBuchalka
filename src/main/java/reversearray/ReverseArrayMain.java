package reversearray;

import java.util.Arrays;

public class ReverseArrayMain {

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();

        Integer[] testArr1 = new Integer[] {1, 2, 3, 4, 5};

        reverseArray.reverseBuiltInIntegerArray(testArr1);

        int[] testArr2 = new int[] {1, 2, 3, 4, 5};

        reverseArray.reverse(testArr2);
        reverseArray.printArray(testArr2);

        System.out.println(Arrays.toString(testArr2));

        int[] testArray = {1, 5, 3, 7, 11, 9, 15};

        System.out.println("Original array: " + Arrays.toString(testArray));

        reverseArray.reverse(testArray);

        System.out.println("Reverse array: " + Arrays.toString(testArray));
    }
}
