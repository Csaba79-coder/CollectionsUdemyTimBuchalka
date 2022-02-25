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

    private void modifyGroceryItem(int position, String newItem, ArrayList<String> list) {
        list.set(position, newItem);
        System.out.println("Grocery item number " + (position + 1) + " has been modified to: " + newItem);
    }

    public void modifyGroceryItem(String currentItem, String newItem, ArrayList<String> list) {
        int position = findItemByItem(currentItem, list);
        if (position >= 0) {
            modifyGroceryItem(position, newItem, list);
        }
    }

    private int findItemByItem(String newItem, ArrayList<String> list) {
        return list.indexOf(newItem);
    }

    public boolean onFile(String item, ArrayList<String> list) {
        int position = findItemByItem(item, list);
        return position >= 0;
    }

    public void removeItem(String item, ArrayList<String> list) {
        int position = findItemByItem(item, list);
        if (position >= 0) {
            removeItem(position + 1, list);
        }
    }

    private void removeItem(int position, ArrayList<String> list) {
        list.remove(position -1);
        System.out.println("The item has been removed from list!");
    }

    public String findItem(String searchItem, ArrayList<String> list) {
        boolean exist = list.contains(searchItem);
        /*for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(searchItem)) {
                searchItem = list.get(i);
            }
        }*/
        return searchItem;
    }

    public String findItemByIndex(String searchItem, ArrayList<String> list) {
        int position = list.indexOf(searchItem);
        if (position >= 0) {
            return list.get(position);
        } else {
            return "No such item!";
        }
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(ArrayList<String> groceryList) {
        this.groceryList = groceryList;
    }
}
