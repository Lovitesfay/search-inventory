import java.io.*;
import java.util.ArrayList;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        System.out.println("--- Current Inventory --- ");

        for (Product productList : inventory) {
            System.out.printf("Product: %-12s | Price: $%.2f | Quantity: %d%n",
                    productList.getProductName(),
                    productList.getPrice(),
                    productList.getQuantity());
        }
        try (FileWriter fileWriter = new FileWriter("src/main/resources/inventory.csv");
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            for (Product p : inventory) {
                String line = p.getProductName() + "|" + p.getPrice() + "|" + p.getQuantity();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static ArrayList<Product> getInventory() {


        ArrayList<Product> inventory = new ArrayList<>();
        inventory.add(new Product("Coke 24pk", 13.00, 100));
        inventory.add(new Product("Cools 24pk", 11.00, 50));
        inventory.add(new Product("Pepsi 24pk", 12.00, 30));
        inventory.add(new Product("Fanta 24pk", 14.00, 40));
        inventory.add(new Product("Sprite 24pk", 15.00, 35));
        return inventory;


                }
            }



