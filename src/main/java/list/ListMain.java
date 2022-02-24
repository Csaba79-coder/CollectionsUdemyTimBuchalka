package list;

import java.util.ArrayList;

public class ListMain {

    public static void main(String[] args) {

        GroceryList list = new GroceryList();

        ArrayList<String> resultList = new ArrayList<>();

        list.addGroceryItem("apple", resultList);
        list.addGroceryItem("banana", resultList);

        list.printGroceryList(resultList);

        list.addGroceryItem("pear", resultList);
        list.addGroceryItem("strawberry", resultList);
        list.printGroceryListByUdemyVideo(resultList);

        list.modifyGroceryItem(2, "pineapple", resultList);
        System.out.println(resultList);
        list.printGroceryListByUdemyVideo(resultList);

        list.removeItem(2, resultList);
        System.out.println(resultList);
    }
}
