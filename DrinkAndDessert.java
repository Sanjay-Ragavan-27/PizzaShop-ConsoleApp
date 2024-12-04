import java.util.ArrayList;
import java.util.Arrays;

public class DrinkAndDessert {
    ArrayList<ArrayList<String>> dd;
    DrinkAndDessert() {
        dd = new ArrayList<>();
        dd.add(new ArrayList<>(Arrays.asList("1","Pepsi","17")));
        dd.add(new ArrayList<>(Arrays.asList("2","7-up","19")));
        dd.add(new ArrayList<>(Arrays.asList("3","Coke","20")));
        dd.add(new ArrayList<>(Arrays.asList("4","Lava cake","95")));
        dd.add(new ArrayList<>(Arrays.asList("5","Chocolate brownie","86")));
    }
    public void displayDD() {
        System.out.println("Drink And Dessert:");
        for(ArrayList<String> i: dd){
            System.out.println(i.get(0)+". "+i.get(1)+ " - Rs."+i.get(2));
        }
    }
}