package groceries;

import util.Input;

public class GroceryListApp {



    public static Input input = new Input();
    public static void main(String[] args) {
        String makeAList = input.getString("Would you like to create a grocery list? (y/n): ");
        while (true) {
            if (makeAList.equalsIgnoreCase("y")) {
                String addAnItem = input.getString("Would you like to add a new item? (y/n): ");
                if (addAnItem.equalsIgnoreCase("y")) {
                    addItem();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

    }

public static void addItem() {
String userChoice = input.getString("a. Given an ordered list of grocery categories to choose from, select the category.\n" +
        "b. Enter the name of the item.\n" +
        "b. Enter how many of the item.\n");
}

public static void showCategories() {

}


}
