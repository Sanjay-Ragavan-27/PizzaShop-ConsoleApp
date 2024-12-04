import java.util.Scanner;

public class Main {
    static double total =0;
    static int choice;
    static char choice1;

    static void getChoice(){
        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
    }

    static void showTotal() {
        System.out.println("Total of pizza: "+total);
    }

    public static void main(String[] args) {
        PizzaBase pb = new PizzaBase();
        pb.displayPizzaBase();
        getChoice();
        total += Integer.parseInt(pb.pizzaBase.get(choice-1).get(2));

        Sause sa = new Sause();
        sa.displaySause();
        getChoice();

        Toppings tp = new Toppings();
        do{
            tp.displayToppings();
            getChoice();
            total +=Integer.parseInt(tp.toppings.get(choice-1).get(2));
            System.out.println("Do you want more Toppings (Y/N)");
            Scanner sc = new Scanner(System.in);
            choice1 = sc.next().charAt(0);
        }while (choice1 == 'y' || choice1 == 'Y');


        DrinkAndDessert dad =new DrinkAndDessert();
        System.out.println("Do you want Drinks and Dessert(Y/N)");
        Scanner sc = new Scanner(System.in);
        choice1 = sc.next().charAt(0);
        if(choice1 == 'y' || choice1 == 'Y'){
            do {
                dad.displayDD();
                getChoice();
                total+=Integer.parseInt(dad.dd.get(choice-1).get(2));
                System.out.println("Do you want more Drinks and Dessert (Y/N)");
//                Scanner sc = new Scanner(System.in);
                choice1 = sc.next().charAt(0);
            }while (choice1 == 'y' || choice1 == 'Y');

            double discount = (total*0.05);
            total = total - discount;
            showTotal();
        }
        else{
            showTotal();
        }
    }
}