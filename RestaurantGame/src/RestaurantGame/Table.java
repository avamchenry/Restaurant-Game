package RestaurantGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Table {
	private double billAmount;
    private List<String> tableMenu;

    public Table(double initialBill) {
        billAmount = initialBill;
        tableMenu = new ArrayList<>();
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double newAmount) {
        billAmount = newAmount;
    }

    public void generateRandomMenu(List<String> menuItems) {
        Random random = new Random();
        for (int i = 0; i < 3; i++) { 
            int randomIndex = random.nextInt(menuItems.size());
            tableMenu.add(menuItems.get(randomIndex));
        }
    }

    public List<String> getTableMenu() {
        return tableMenu;
    }

}
