package arrays;

public class ArraysMain {

    public static void main(String[] args) {

        Arrays arrays = new Arrays();

        int[] testArray = {20, 2, 6, 48, 4};

        int[] sortedTestArray = arrays.sortedDescendingArrays(testArray);

        arrays.printArray(sortedTestArray);

        int[] ascendingTestArray = {20, 2, 6, 48, 4};

        int[] sortedAscendingArr = arrays.sortedAscendingArrays(ascendingTestArray);

        arrays.printArray(sortedAscendingArr);
    }
}
