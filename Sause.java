import java.util.ArrayList;
import java.util.Arrays;

public class Sause {
    ArrayList<ArrayList<String>> sause;
    Sause(){
        sause = new ArrayList<>();
        sause.add(new ArrayList<>(Arrays.asList("1","Marinara sauce")));
        sause.add(new ArrayList<>(Arrays.asList("2","Pesto sauce")));
    }
    public void displaySause(){
        System.out.println("Pizza Sauses:");
        for(ArrayList<String> i : sause){
            System.out.println(i.get(0)+". "+i.get(1));
        }
    }
}