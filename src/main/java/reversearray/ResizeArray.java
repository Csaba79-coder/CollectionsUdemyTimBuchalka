package reversearray;

public class ResizeArray {

    public int[] resizeArray(int[] array, int size) {
        int[] original = array;

        array = new int[size];

        for (int i = 0; i < original.length; i++) {
            array[i] = original[i];
        }
        return array;
    }
}
