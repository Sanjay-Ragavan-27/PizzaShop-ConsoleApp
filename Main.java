import java.util.Scanner;

class PizzaShop {
    double total =0;

    //base
    String baseName[] = {"Regular",
            "Whole wheat"};
    int basePrice[] = {50,75};
    int baseSize = baseName.length;

    //sause
    String sauseName[]={"Marinara sauce",
            "Pesto sauce"};
    int sauseSize= sauseName.length;

    //toppings
    String toppingsName[] ={"Mozzarella cheese",
            "Cheddar cheese",
            "Spinach",
            "Corn",
            "Mushroom",
            "Chicken",
            "Pepperoni"};
    int toppingsPrize[] = {30,25,20,15,15,50,45};
    int toppingsSize= toppingsName.length;

    //Drinks and Dessert
    String ddName[] ={
            "Pepsi",
            "7-up",
            "Coke",
            "Lava cake",
            "Chocolate brownie"
    };
    int ddPrize[] = {17,19,20,95,86};
    int ddSize= ddName.length;

    void start(){
        displayBase();
        chooseBase();
        displaySauce();
        chooseSause();
        displayToppings();
        chooseToppings();

        System.out.println("Do you want Drinks and Dessert(Y/N)");
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);
        if(choice == 'y' || choice == 'Y'){
            displayDrinksAndDessert();
            chooseDrinksAndDessert();
            showTotal();
        }
        else{
            showTotal();
        }
    }

    //base
    private void displayBase() {
        System.out.println("Pizza Base:");
        for(int i=0; i<baseSize;i++){
            System.out.println(i+1 + " " + baseName[i] + "  Rs. " + basePrice[i]);
        }
    }
    private void chooseBase() {
        System.out.println("Choose base:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        total +=basePrice[choice-1];
//        System.out.println("s:     "+ total);
    }

    //sause
    private  void displaySauce() {
        System.out.println("Sauce:");
        for(int i=0; i<sauseSize;i++){
            System.out.println(i+1 + " " + sauseName[i]);
        }
    }
    private void chooseSause() {
        System.out.println("Choose sauce:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
    }

    //toppings
    private void displayToppings(){
        System.out.println("Toppings:");
        for(int i=0; i<toppingsSize;i++){
            System.out.println(i+1 + " " + toppingsName[i] + "  Rs. " + toppingsPrize[i]);
        }
    }
    private void chooseToppings() {
        Scanner sc = new Scanner(System.in);
        char choice1;
        do{
            System.out.println("Choose topping:");
            int choice = sc.nextInt();
            total +=toppingsPrize[choice-1];
//            System.out.println("s:     "+ total);
            System.out.println("Do you want more Toppings (Y/N)");
            choice1 = sc.next().charAt(0);
        }while (choice1 == 'y' || choice1 == 'Y');

    }

    //Drinks and Dessert
    private void displayDrinksAndDessert() {
        System.out.println("Drinks & Desserts:");
        for(int i=0; i<ddSize;i++){
            System.out.println(i+1 + " " + ddName[i] + "  Rs. " + ddPrize[i]);
        }
    }
    private void chooseDrinksAndDessert() {
        Scanner sc = new Scanner(System.in);
        char choice1;
        do{
            System.out.println("Choose any Drinks or Desserts:");
            int choice = sc.nextInt();
            total +=ddPrize[choice-1];
            System.out.println("Do you want more Drinks and Dessert (Y/N)");
            choice1 = sc.next().charAt(0);
        }while (choice1 == 'y' || choice1 == 'Y');

        double discount = (total*0.05);
        total = total - discount;
    }

    //print
    private void showTotal() {
        System.out.println("Amount to be paid is " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        PizzaShop p = new PizzaShop();
        p.start();
    }
}
