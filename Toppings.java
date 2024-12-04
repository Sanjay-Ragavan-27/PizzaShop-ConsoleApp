import java.util.ArrayList;
import java.util.Arrays;

public class Toppings {
    ArrayList<ArrayList<String>> toppings;
    Toppings() {
        toppings = new ArrayList<>();
        toppings.add(new ArrayList<>(Arrays.asList("1","Mozzarella cheese","30")));
        toppings.add(new ArrayList<>(Arrays.asList("2","Cheddar cheese","25")));
        toppings.add(new ArrayList<>(Arrays.asList("3","Spinach","20")));
        toppings.add(new ArrayList<>(Arrays.asList("4","Corn","15")));
        toppings.add(new ArrayList<>(Arrays.asList("5","Mushroom","15")));
        toppings.add(new ArrayList<>(Arrays.asList("6","Chicken","50")));
        toppings.add(new ArrayList<>(Arrays.asList("7","Pepperoni","45")));
    }
    public void displayToppings() {
        System.out.println("Pizza Toppings:");
        for(ArrayList<String> i: toppings) {
            System.out.println(i.get(0)+". "+i.get(1)+ " - Rs. "+i.get(2));
        }
    }
}