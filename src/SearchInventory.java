import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        System.out.println("--- Current Inventory --- ");

        for(Product productList : inventory){
            System.out.printf("Product: %-12s | Price: $%.2f | Quantity: %d%n",
                    productList.getProductName(), productList.getPrice(), productList.getQuantity());


        }
    }

    public static ArrayList<Product>getInventory(){
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product("Coke 24pk", 13.00, 100 ));
        inventory.add(new Product("Cools 24pk", 11.00, 50 ));
        inventory.add(new Product("Pepsi 24pk", 12.00, 30 ));
        inventory.add(new Product("Fanta 24pk", 14.00,40 ));
        inventory.add(new Product("Sprite 24pk", 15.00,35 ));

        return inventory;

    }
}
