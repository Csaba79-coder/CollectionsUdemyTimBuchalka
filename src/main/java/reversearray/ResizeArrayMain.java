package reversearray;

import java.util.Arrays;

public class ResizeArrayMain {

    public static void main(String[] args) {

        ResizeArray resizeArray = new ResizeArray();

        int[] baseArray = new int[]{10, 2, 3, 4, 8, 69, 7, 9, 76, -45}; // original size is 10

        System.out.println(Arrays.toString(baseArray));

        int[] resizeArr = resizeArray.resizeArray(baseArray, 12);

        System.out.println(Arrays.toString(resizeArr));

        int size = resizeArr.length;
        System.out.println(size);

        resizeArr[10] = 100;
        resizeArr[11] = -164;

        System.out.println(Arrays.toString(resizeArr));
    }
}
