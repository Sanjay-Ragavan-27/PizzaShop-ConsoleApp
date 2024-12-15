# Pizza Customization Application in Java

## Overview

This project implements a **Pizza Customization Application** in Java. The system allows users to build their own pizza by selecting a base, sauce, toppings, and optional drinks or desserts. It calculates the total price dynamically and applies a discount for qualifying orders.

---

## Features

1. **Pizza Base Selection**: Choose between Regular and Whole Wheat bases.  
2. **Sauce Selection**: Pick your preferred pizza sauce (e.g., Marinara or Pesto).  
3. **Topping Selection**: Add multiple toppings to customize your pizza.  
4. **Drinks and Desserts**: Optionally add drinks or desserts to your order.  
5. **Dynamic Pricing**: Calculates total cost, including discounts.  
6. **User Interaction**: Interactive menu-driven program.  

---

## Code Structure

### **Classes**

| Class               | Description                                                                  |
|---------------------|------------------------------------------------------------------------------|
| `PizzaBase`         | Handles pizza base selection.                                               |
| `Sause`             | Handles pizza sauce selection.                                              |
| `Toppings`          | Handles pizza topping selection.                                            |
| `DrinkAndDessert`   | Manages drinks and desserts.                                                |
| `Main`              | Coordinates the application flow and calculates the total cost.             |

### **Main Class Methods**

| Method              | Description                                                                  |
|---------------------|------------------------------------------------------------------------------|
| `getChoice()`       | Takes user input for menu selection.                                         |
| `showTotal()`       | Displays the final total cost.                                               |

---

## How to Use

1. Clone this repository or copy the code.  
2. Compile and run the `Main` class.  
3. Follow the prompts to customize your pizza and optionally add drinks/desserts.  

### Example Code

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
        do{
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
        if(choice1 == 'y' || choice1 == 'Y') {
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
```

---

## Sample Output

```
Pizza Bases:
1. Regular - Rs. 50
2. Whole wheat - Rs. 75
Enter your choice: 1
Pizza Sauces:
1. Marinara sauce
2. Pesto sauce
Enter your choice: 1
Pizza Toppings:
1. Mozzarella cheese - Rs. 30
2. Cheddar cheese - Rs. 25
3. Spinach - Rs. 20
Do you want more Toppings (Y/N): Y
Pizza Toppings:
1. Mozzarella cheese - Rs. 30
Enter your choice: 2
Do you want more Toppings (Y/N): N
Do you want Drinks and Dessert(Y/N): N
Total of pizza: 105
```

---

## Customization

- Add more options for pizza bases, sauces, toppings, drinks, and desserts.  
- Implement advanced pricing logic (e.g., combo discounts).  
- Enhance user input validation and error handling.  

---
