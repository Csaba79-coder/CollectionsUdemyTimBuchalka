package types;

import java.util.Arrays;

public class ReferenceAndValueTypes {

    // value types are primitives --> they hold a value!
    // String and Object are reference types, also array is a ref. type

    public static void main(String[] args) {

        // VALUE TYPE

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        // both value works independently!

        System.out.println("my int value: " + myIntValue);
        System.out.println("another int value: " + anotherIntValue);

        anotherIntValue++;

        System.out.println("my int value: " + myIntValue);
        System.out.println("another int value: " + anotherIntValue);

        anotherIntValue++;

        System.out.println("my int value: " + myIntValue);
        System.out.println("another int value: " + anotherIntValue);

        // REFERENCE TYPE (like Object, Class, Array, String etc.)
        // new keyword means creating a new Object!!! ...
        // reference types are used by a reference!!!
        // a reference holds a reference or an address to an Object! (but not the Object itself)
        int[] intArray = new int[5]; // --> this holds a reference or an address to the array in the memory!
        int[] anotherArray = intArray; // they hold the same address!

        System.out.println("my int array: " + Arrays.toString(intArray));
        System.out.println("another array: " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change my int array: " + Arrays.toString(intArray));
        System.out.println("after change another array: " + Arrays.toString(anotherArray));

        modifyArray(intArray);

        System.out.println("after change with method my int array: " + Arrays.toString(intArray));
        System.out.println("after change with method another array: " + Arrays.toString(anotherArray));

        modifyArray2(anotherArray);

        System.out.println("after change with method2 my int array: " + Arrays.toString(intArray));
        System.out.println("after change with method2 another array: " + Arrays.toString(anotherArray));

        modifyNewArray(anotherArray);

        System.out.println("after change with method2 my int array: " + Arrays.toString(intArray));
        System.out.println("after change with method2 another array: " + Arrays.toString(anotherArray));

        modifyNewArrayVideo(anotherArray);

        System.out.println("after change with method2 my int array: " + Arrays.toString(intArray));
        System.out.println("after change with method2 another array: " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4, 5, 6, 7, 8}; // because of new it is now pont to a different address / reference!
        modifyArray(intArray);

        System.out.println("after change with method2 my int array: " + Arrays.toString(intArray));
        System.out.println("after change with method2 another array: " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
    }

    private static void modifyArray2(int[] array) {
        array[3] = 2;
    }

    private static void modifyNewArray(int[] array) {
        int[] modifyArray = new int[array.length];
        array[1] = 10;
    }

    private static void modifyNewArrayVideo(int[] array) {
        array[4] = 100;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
