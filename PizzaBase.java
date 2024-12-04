import java.util.ArrayList;
import java.util.Arrays;

public class PizzaBase {

    ArrayList<ArrayList<String>> pizzaBase;
    PizzaBase() {
            pizzaBase = new ArrayList<>();
            pizzaBase.add(new ArrayList<>(Arrays.asList("1", "Regular", "50")));
            pizzaBase.add(new ArrayList<>(Arrays.asList("2", "Whole wheat", "75")));
        }
    public void displayPizzaBase() {
        System.out.println("Pizza Bases:");
        for (ArrayList<String> entry : pizzaBase) {
            System.out.println(entry.get(0) + ". " + entry.get(1) + " - Rs. " + entry.get(2));
        }
    }
}