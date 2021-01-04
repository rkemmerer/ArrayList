import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
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
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    System.out.println("Quitting...");
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t0 - to print choice options.");
        System.out.println("\t1 - to print the list of grocery items.");
        System.out.println("\t2 - to add an item to the grocery list.");
        System.out.println("\t3 - to modify an item in the  grocery list.");
        System.out.println("\t4 - to remove an item from the grocery list.");
        System.out.println("\t5 - to search for an item in the grocery list.");
        System.out.println("\t6 - to quit.");
    }

    public static void addItem(){
        String newItem = "new";
        System.out.print("Please enter grocery list item to add: ");
        groceryList.addGrocery(scanner.nextLine());
    }

    public static void modifyItem(String newItem){

    }
    public static void modifyItem(){
        System.out.print("Enter the item name to be modified: ");
        groceryList.modifyGroceryItem(scanner.nextLine());

    }

    public static void removeItem(){
        System.out.print("Enter the item name to be removed: ");
        groceryList.removeGroceryItem(scanner.nextLine());


    }

    public static void searchForItem(){
        System.out.print("Enter the item you are looking for: ");
        String searchItem = scanner.nextLine();
        int foundPosition = groceryList.findItem(searchItem);
        if(foundPosition>0){
            System.out.println(searchItem+" is in the list at position "+(foundPosition+1));
        }
        else{
            System.out.println("Item not in list.");
        }

    }

    public static void processArrayList(){
        ArrayList<String> newArray= new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
