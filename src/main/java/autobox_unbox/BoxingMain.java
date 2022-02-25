package autobox_unbox;

import java.util.ArrayList;

public class BoxingMain {

    public static void main(String[] args) {

        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54)); // this is how I add int to an int arraylist!!! --> using class!

        // but autoboxing helps us & makes it more easy / easier!
        // using object wrapper! see bellow. casting automatically int to Integer

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            // it says unnecessary boxing as java makes this one automatically!
            intArrayList.add(Integer.valueOf(i)); // but this one made by java automatically!
            intArrayList.add(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); // this is also an unnecessary boxing!!!
        }

        // from int to Integer it is autoboxing!!! :)

        // unboxing: when we take from a class and convert back to primitive!

        Integer myIntValue = 56; // java is using this in background: Integer.valueOf(56);
        // above line is exactly: Integer myIntValue = Integer.valueOf(56);

        // autoboxing cannot make between double and integer e.g.
        int myInt = myIntValue; // background: myIntValue.intValue();
        System.out.println(myInt);

        ArrayList<Double> doubleArrayList = new ArrayList<>();

        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            // doubleArrayList.add(Double.valueOf(dbl));
            doubleArrayList.add(dbl);
        }

        for (int i = 0; i < doubleArrayList.size(); i++) {
            // double value = doubleArrayList.get(i).doubleValue(); // unnecessary boxing!
            double value = doubleArrayList.get(i);
            System.out.println(value);
        }

        for (int i = 0; i < doubleArrayList.size(); i++) {
            System.out.println(doubleArrayList.get(i));
        }

        // BUT different result!!! WATCH out!!!
        for (int i = 0; i < doubleArrayList.size(); i++) {
            System.out.println(i);
        }
    }
}
