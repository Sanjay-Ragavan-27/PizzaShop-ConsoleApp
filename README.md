# Pizza Ordering System

A simple Java-based console application that allows users to customize their pizza orders by selecting pizza bases, sauces, toppings, and optionally drinks and desserts. The application calculates the total cost of the order and applies a discount on the total amount if drinks or desserts are selected.

## Features

- **Select Pizza Base**: Choose between different pizza bases (e.g., Regular, Whole Wheat) with their respective prices.
- **Choose Pizza Sauce**: Choose a sauce (e.g., Marinara Sauce, Pesto Sauce) for the pizza.
- **Select Toppings**: Select multiple toppings (e.g., Mozzarella cheese, Chicken, Pepperoni) for the pizza, with the option to add more toppings.
- **Drinks & Desserts**: Optionally, users can select drinks and desserts (e.g., Pepsi, Lava Cake), and the total will be updated.
- **Total Calculation**: The total price of the pizza, sauces, toppings, and any selected drinks and desserts is calculated.
- **Discount**: A 5% discount is applied if drinks or desserts are added to the order.
- **Interactive Menu**: The user interacts with the application by making choices from the menu for each category.

## Structure

The project is divided into several classes, each representing a part of the pizza ordering process:

### `Main` Class
The main class where the pizza ordering process begins. The user selects a pizza base, sauce, toppings, and optionally drinks or desserts. It calculates the total cost and applies discounts where applicable.

### `PizzaBase` Class
This class stores and displays available pizza bases (e.g., Regular, Whole Wheat) and their prices.

### `Sause` Class
This class stores and displays available pizza sauces (e.g., Marinara Sauce, Pesto Sauce).

### `Toppings` Class
This class stores and displays available pizza toppings (e.g., Mozzarella Cheese, Chicken, Pepperoni).

### `DrinkAndDessert` Class
This class stores and displays available drinks and desserts (e.g., Pepsi, Lava Cake), and the option for a discount is applied if selected.

## Methods

### 1. `getChoice()`
This method prompts the user to enter a choice for the item (pizza base, sauce, topping, etc.) and returns the selected option.

### 2. `showTotal()`
Displays the total cost of the pizza order.

### 3. `displayPizzaBase()`, `displaySause()`, `displayToppings()`, `displayDD()`
These methods display the available pizza bases, sauces, toppings, and drinks & desserts respectively.

### 4. `main(String[] args)`
This is the entry point of the application. It starts the pizza ordering process and calculates the final price based on the user's selections.

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        PizzaBase pb = new PizzaBase();
        pb.displayPizzaBase();
        getChoice();
        total += Integer.parseInt(pb.pizzaBase.get(choice-1).get(2));

        Sause sa = new Sause();
        sa.displaySause();
        getChoice();

        Toppings tp = new Toppings();
        do {
            tp.displayToppings();
            getChoice();
            total += Integer.parseInt(tp.toppings.get(choice-1).get(2));
            System.out.println("Do you want more Toppings (Y/N)");
            Scanner sc = new Scanner(System.in);
            choice1 = sc.next().charAt(0);
        } while (choice1 == 'y' || choice1 == 'Y');

        DrinkAndDessert dad = new DrinkAndDessert();
        System.out.println("Do you want Drinks and Dessert(Y/N)");
        Scanner sc = new Scanner(System.in);
        choice1 = sc.next().charAt(0);
        if (choice1 == 'y' || choice1 == 'Y') {
            do {
                dad.displayDD();
                getChoice();
                total += Integer.parseInt(dad.dd.get(choice-1).get(2));
                System.out.println("Do you want more Drinks and Dessert (Y/N)");
                choice1 = sc.next().charAt(0);
            } while (choice1 == 'y' || choice1 == 'Y');

            double discount = (total * 0.05);
            total = total - discount;
            showTotal();
        } else {
            showTotal();
        }
    }
}
