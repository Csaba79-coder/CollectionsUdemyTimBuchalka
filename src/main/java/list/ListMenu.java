package list;


import java.util.ArrayList;
import java.util.Scanner;

public class ListMenu {

    private Scanner scanner = new Scanner(System.in);
    private GroceryList groceryList = new GroceryList();
    private ArrayList<String> resultList = new ArrayList<>();

    public ListMenu() {
    }

    public ListMenu(Scanner scanner, GroceryList groceryList, ArrayList<String> resultList) {
        this.scanner = scanner;
        this.groceryList = groceryList;
        this.resultList = resultList;
    }

    public void run() {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> printInstruction();
                case 1 -> groceryList.printGroceryListByUdemyVideo(resultList);
                case 2 -> addItem();
                case 3 -> modifyItem();
                case 4 -> removeItem();
                case 5 -> searchForItem();
                case 6 -> quit = true;
            }
            // refactor above!
            /*switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList(resultList);
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;*/
        }
    }

    public void printInstruction() {
        System.out.println("Press");
        System.out.println("0 -> print menu");
        System.out.println("1 -> print existing list");
        System.out.println("2 -> add item to the list");
        System.out.println("3 -> modify item in the list");
        System.out.println("4 -> remove item from the list");
        System.out.println("5 -> search item in the list");
        System.out.println("6 -> quit the application");
    }

    public void addItem() {
        System.out.print("Please enter the item: ");
        groceryList.addGroceryItem(scanner.nextLine(), resultList);
    }

    public void modifyItem() {
        //System.out.print("Enter item number: ");
        //int itemNo = scanner.nextInt();
        //scanner.nextLine();
        //System.out.println("Enter new item to replace: ");
        //String newItem = scanner.nextLine();
        // groceryList.modifyGroceryItem((itemNo-1), newItem, resultList);
        System.out.println("Enter item name: ");
        String item = scanner.nextLine();
        System.out.println("Enter new item:");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(item, newItem, resultList);
    }

    public void removeItem() {
        /*System.out.println("Enter item number: ");
        int position = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeItem(position, resultList);*/
        System.out.println("Please enter item name: ");
        String item = scanner.nextLine();
        groceryList.removeItem(item, resultList);
    }

    public void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        //if (!groceryList.findItemByIndex(searchItem, resultList).equals("No such item!")) {
        if (groceryList.onFile(searchItem, resultList)) {
            System.out.println("Found " + searchItem + " in list");
        } else {
            System.out.println("No such element on list: " + searchItem);
        }
    }

    public void processArrayList() {
        ArrayList<String> newArraylist = new ArrayList<>();
        // newArraylist = groceryList.getGroceryList();
        newArraylist.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArrayList = new ArrayList<>(groceryList.getGroceryList());

        String[] arrayFromList = new String[groceryList.getGroceryList().size()];
        arrayFromList = groceryList.getGroceryList().toArray(arrayFromList);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public GroceryList getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(GroceryList groceryList) {
        this.groceryList = groceryList;
    }

    public ArrayList<String> getResultList() {
        return resultList;
    }

    public void setResultList(ArrayList<String> resultList) {
        this.resultList = resultList;
    }
}
