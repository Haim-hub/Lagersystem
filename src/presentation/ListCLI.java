package presentation;

import domain.Inventory;

public class ListCLI {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.load("inventory.txt");
        inventory.printInventory();
    }
}