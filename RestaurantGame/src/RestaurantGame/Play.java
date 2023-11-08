

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Play {
    static double earnings = 0;
    static int tableNumber = 1;
    static Table[] tables = new Table[10];
    static double tipModifier = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> menuItems = new ArrayList<>();
        menuItems.add("Burger");
        menuItems.add("Pizza");
        menuItems.add("Salad");
        menuItems.add("Pasta");
        menuItems.add("Fries");
        menuItems.add("Soda");
        menuItems.add("Water");

        while (true) {
            System.out.println("Server Game Options:");//Homework Comment
            System.out.println("1. Open a new table");
            System.out.println("2. Serve a table");
            System.out.println("3. Close a table");
            System.out.println("4. Upgrade");
            System.out.println("5. View earnings");
            System.out.println("6. End game");
            System.out.println("7. View instructions");

            int option = scanner.nextInt(); //test1

            switch (option) {
                case 1:
                    openTable(menuItems);
                    break;
                case 2:
                    serveTable();
                    break;
                case 3:
                    closeTable();
                    break;
                case 4:
                    upgrade();
                    break;
                case 5:
                    viewEarnings();
                    break;
                case 6:
                    return;
                case 7:
                    viewInstructions();
                    break;
                default:
                    System.out.println("Invalid option. Please choose a number between 1 and 7.");
            }
        }
    }

    public static void openTable(List<String> menuItems) {
        if (tableNumber <= tables.length) {
            Table table = new Table(0.0);
            table.generateRandomMenu(menuItems);
            tables[tableNumber - 1] = table;
            System.out.println("New table opened. Table number: " + tableNumber+ "  here is their order:" +table.getTableMenu().toString());
            tableNumber++;
        } else {
            System.out.println("No more tables available.");
        }
    }

    public static void serveTable() {
        // Logic for serving a table
    }

    public static void closeTable() {
        // Logic for closing a table
    }

    public static void upgrade() {
        // Logic for upgrading
    }

    public static void viewEarnings() {
        // Logic for viewing earnings
    }

    public static void viewInstructions() {
        System.out.println("The goal of the game is to earn the most amount of money you can. \nYou have many options:");
      System.out.println("");
          System.out.println("1. Open a table: Each table will have its own table number. The more tables you open, the more money you can make.");
          System.out.println("2. Take orders: Each table will randomly assign orders for you to keep track of.");
          System.out.println("3. Serve a table: Repeat the order to serve the table. If you get an item wrong, you won't earn the money.");
          System.out.println("4. Close out a table: Display the total bill, tip, and the total amount for that table.");
          System.out.println("5. Upgrade: Spend money to improve your tips.");
    }
}
