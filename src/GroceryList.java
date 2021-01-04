import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGrocery(String item){
        groceryList.add(item);
        System.out.println(item+" was added.");

    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" on your grocery list.");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String searchItem){
        int position  = findItem(searchItem);
        if(position>0){
            Scanner groceryListScanner = new Scanner(System.in);
            System.out.print("Enter replacement item: ");
            String newItem = groceryListScanner.nextLine();
            groceryList.set(position, newItem );
            System.out.println(searchItem+" was replaced with "+newItem);
        }
        else{
            System.out.println(searchItem+" is not in the grocery list.");
        }

    }
//    public void modifyGroceryItem(int position, String newItem){
//        String oldItem = groceryList.get(position);
//        groceryList.set(position, newItem);
//        System.out.println("Grocery item #"+(position+1)+" has been modified.");
//        System.out.println(oldItem+" was replaced with "+groceryList.get(position));
//
//    }

    public void removeGroceryItem(String searchItem){
        int position  = findItem(searchItem);
        if(position>0){
            groceryList.remove(position);
            System.out.println(searchItem+" was removed.");
        }
        else{
            System.out.println(searchItem+" is not in the grocery list.");
        }
    }
//    public void removeGroceryItem(int position){
//        String theItem = groceryList.get(position);
//        groceryList.remove(position);
//    }

    public int findItem(String searchItem){
        //boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position>=0){
            return position;
        }
        else{
            return -1;
        }

    }
}
