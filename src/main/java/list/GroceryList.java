package list;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public GroceryList() {
    }

    public GroceryList(ArrayList<String> groceryList) {
        this.groceryList = groceryList;
    }

    public void addGroceryItem(String item, ArrayList<String> list) {
        list.add(item);
    }
    
    public void printGroceryList(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    public void printGroceryListByUdemyVideo(ArrayList<String> list) {
        System.out.println("You have " + list.size() + " items on your list");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem, ArrayList<String> list) {
        list.set(position, newItem);
        System.out.println("Grocery item number " + (position + 1) + " has been modified to: " + newItem);
    }

    public void removeItem(int position, ArrayList<String> list) {
        list.remove(position);
        System.out.println("The item has been removed from list!");
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(ArrayList<String> groceryList) {
        this.groceryList = groceryList;
    }
}
