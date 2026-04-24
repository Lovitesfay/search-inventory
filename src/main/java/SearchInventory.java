import java.io.*;
import java.util.ArrayList;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        System.out.println("--- Current Inventory --- ");

        for (Product productList : inventory) {
            System.out.printf("ID: %d | Product: %-12s | Price: $%.2f | Quantity: %d%n",
                    productList.getProductID(),
                    productList.getProductName(),
                    productList.getPrice(),
                    productList.getQuantity());
        }
        try {
            FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufReader.readLine()) != null) {

                System.out.println(line);

                String[] parts = line.split("\\|");
                if (parts.length == 4) {
                    int productID = Integer.parseInt(parts[0]);

                    String productName = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    int quantity = Integer.parseInt(parts[3]);
                        break;

                }


            }

                    bufReader.close();


        } catch (IOException e) {

        }
        saveInventory(inventory);


        {
            for (Product p : inventory) {
                String line =
                        p.getProductID() + p.getProductName() + "|" + p.getPrice() + "|" + p.getQuantity();

            }

        }
    }

    private static void saveInventory(ArrayList<Product> inventory) {
        String filePath = "src/main/resources/inventory.csv";
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true));) {

            for (Product p : inventory) {
                String line = p.getProductID() + "|" +
                        p.getProductName() + "|" +
                        p.getPrice() + "|" +
                        p.getQuantity();

                writer.write(line);
                writer.newLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static ArrayList<Product> getInventory() {


        ArrayList<Product> inventory = new ArrayList<>();
        inventory.add(new Product(50, "Coke 24pk", 13.00, 100));
        inventory.add(new Product(35, "Cools 24pk", 11.00, 50));
        inventory.add(new Product(70, "Pepsi 24pk", 12.00, 30));
        inventory.add(new Product(82, "Fanta 24pk", 14.00, 40));
        inventory.add(new Product(93, "Sprite 24pk", 15.00, 35));
        return inventory;


    }
}



