/*  package machine;

import java.util.Scanner;

public class CoffeeMachine {
  public static void main(String[] args) {
  //stage 1 - print intro for coffee making
      System.out.println("Starting to make a coffee");
      System.out.println("Grinding coffee beans");
      System.out.println("Boiling water");
      System.out.println("Mixing boiled water with crushed coffee beans");
      System.out.println("Pouring coffee into the cup");
      System.out.println("Pouring some milk into the cup");
      System.out.println("Coffee is ready!");

      // stage 2 - asking the user how many coffee cups are needed
     // System.out.println("Write how many cups of coffee you will need:");
      Scanner scanner = new Scanner(System.in);
      // introducing the recipe
      int waterMl = 200;
      int milkMl = 50;
      int coffeeBeans = 15;
     /* System.out.println("For " + coffeeCups + " cups of coffee you will need:");
      System.out.println(coffeeCups * waterMl + " ml of water");
      System.out.println(coffeeCups * milkMl + " ml of milk");
      System.out.println(coffeeCups * coffeeBeans + " g of coffee beans");

      // stage 3 - input the ingredients available in tank

      System.out.println("Write how many ml of water the coffee machine has: ");
      int waterInTank = scanner.nextInt();
      System.out.println("Write how many ml of milk the coffee machine has: ");
      int milkInTank = scanner.nextInt();
      System.out.println("Write how many grams of coffee beans the coffee machine has:");
      int beansInTank = scanner.nextInt();
      System.out.println("Write how many cups of coffee you will need:");
      int coffeeCups = scanner.nextInt();
      */

/*
        // calculating how many cups can be made respecting the recipe
        int waterCheck = waterInTank / waterMl;
        int milkCheck = milkInTank / milkMl;
        int beansCheck = beansInTank / coffeeBeans;

        //check to see which ingredient is the minimum,
        // cause it means that is the max number of cups that can be made
        int min;
        if (waterCheck <= milkCheck && waterCheck <= beansCheck) {
            min = waterCheck;
        } else if (milkCheck <= waterCheck && milkCheck <= beansCheck) {
            min = milkCheck;
        } else {
            min = beansCheck;
        }

        //System.out.println(min);

        if (coffeeCups == min) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (coffeeCups < min) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (min - coffeeCups) + " more than that)");
        } else {
            System.out.println("No, I can make only " + min + " cup(s) of coffee");
        }
        */
        // STAGE 4
/*
        int mlOfWaterStart = 400;
        int mlOfMilkStart = 540;
        int gOfBeansStart = 120;
        int disposableCupsStart = 9;
        int moneyStart = 550;

        Scanner input = new Scanner(System.in);
        System.out.println("The coffee machine has: ");
        System.out.println(mlOfWaterStart + " ml of water ");
        System.out.println(mlOfMilkStart + " ml of milk  ");
        System.out.println(gOfBeansStart + " grams of coffee beans ");
        System.out.println(disposableCupsStart + " of disposable cups ");
        System.out.println(moneyStart + " of money ");
        System.out.println();
        System.out.println("Write action (buy, fill, take): ");
        String choice = input.nextLine();
        input.close();

        Scanner input2 = new Scanner(System.in);
        int moneyIn;
        switch (choice)
        {
            case "fill":
            {
                System.out.println("Write how many ml of water do you want to add: ");
                int mlOfWater = input2.nextInt();
                mlOfWater += mlOfWaterStart;
                System.out.println("Write how many ml of milk do you want to add: ");
                int mlOfMilk = input2.nextInt();
                mlOfMilk += mlOfMilkStart;
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                int gOfBeans = input2.nextInt();
                gOfBeans += gOfBeansStart;
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                int disposableCups = input2.nextInt();
                disposableCups += disposableCupsStart;
                //System.out.println("Write how much money do you want to add: ");
                //moneyIn = input2.nextInt();
                int money = moneyStart;

                System.out.println("The coffee machine has: ");
                System.out.println(mlOfWater + " ml of water ");
                System.out.println(mlOfMilk + " ml of milk  ");
                System.out.println(gOfBeans + " grams of coffee beans ");
                System.out.println(disposableCups + " of disposable cups ");
                System.out.println(money + " of money ");
                break;

            }
            case "buy":
            {
                int mlOfWater;
                int mlOfMilk;
                int gOfBeans;
                int disposableCups;
                int money;
                //Scanner input3 = new Scanner(System.in);
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                int coffee = input2.nextInt();
                switch (coffee)
                {
                    case 1:
                    {
                        mlOfWater = mlOfWaterStart - 250;
                        mlOfMilk = mlOfMilkStart;
                        gOfBeans = gOfBeansStart - 16;
                        disposableCups = disposableCupsStart - 1;
                        money = moneyStart + 4;
                        System.out.println("The coffee machine has: ");
                        System.out.println(mlOfWater + " ml of water ");
                        System.out.println(mlOfMilk + " ml of milk  ");
                        System.out.println(gOfBeans + " grams of coffee beans ");
                        System.out.println(disposableCups + " of disposable cups ");
                        System.out.println(money + " of money ");
                        break;

                    }
                    case 2:
                    {
                        mlOfWater = mlOfWaterStart - 350;
                        mlOfMilk = mlOfMilkStart - 75;
                        gOfBeans = gOfBeansStart - 20;
                        disposableCups = disposableCupsStart - 1;
                        money = moneyStart + 7;
                        System.out.println("The coffee machine has: ");
                        System.out.println(mlOfWater + " ml of water ");
                        System.out.println(mlOfMilk + " ml of milk  ");
                        System.out.println(gOfBeans + " grams of coffee beans ");
                        System.out.println(disposableCups + " of disposable cups ");
                        System.out.println(money + " of money ");
                        break;

                    }
                    case 3:
                    {
                        mlOfWater = mlOfWaterStart - 200;
                        mlOfMilk = mlOfMilkStart - 100;
                        gOfBeans = gOfBeansStart - 12;
                        disposableCups = disposableCupsStart - 1;
                        money = moneyStart + 6;
                        System.out.println("The coffee machine has: ");
                        System.out.println(mlOfWater + " ml of water ");
                        System.out.println(mlOfMilk + " ml of milk  ");
                        System.out.println(gOfBeans + " grams of coffee beans ");
                        System.out.println(disposableCups + " of disposable cups ");
                        System.out.println(money + " of money ");
                        break;
                    }

                }
                break;
                // input3.close();
            }
            case "take":
            {
                int giveMoney = 0;
                System.out.println("I gave you " + moneyStart);
                System.out.println();
                System.out.println("The coffee machine has: ");
                System.out.println(mlOfWaterStart + " ml of water ");
                System.out.println(mlOfMilkStart + " ml of milk  ");
                System.out.println(gOfBeansStart + " grams of coffee beans ");
                System.out.println(disposableCupsStart + " of disposable cups ");
                System.out.println(giveMoney + " of money ");
                break;

            }
        }
*/

package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        while (bool) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String choice = sc.next();
            System.out.println();
            switch (choice) {
                case "buy":
                    buy();
                    break;

                case "fill":
                    fill();
                    break;

                case "take":
                    take();
                    break;

                case "remaining":
                    remaining();
                    break;

                case "exit":
                    bool = false;
                    break;
            }
            System.out.println();
        }
    }

    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cups = 9;
    static int money = 550;

    public static void intro() {
        System.out.println("The coffee machine has: ");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }

    public static void buy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String choice = sc.next();

        switch (choice) {
            case "1":
                if (water >= 250 && coffeeBeans >= 16 && cups > 1) {
                    water -= 250;
                    coffeeBeans -= 16;
                    money += 4;
                    cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                else if(water<250){
                    System.out.println("Sorry, not enough water!");
                }
                else if(coffeeBeans < 16){
                    System.out.println("Sorry, not enough coffeeBeans!");
                }
                else if(cups < 1){
                    System.out.println("Sorry, not enough cups!");
                }
                break;

            case "2":
                if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && cups > 1) {
                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    money += 7;
                    cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                else if(water<350){
                    System.out.println("Sorry, not enough water!");
                }
                else if(milk<75) {
                    System.out.println("Sorry, not enough milk!");
                }
                else if(coffeeBeans < 20){
                    System.out.println("Sorry, not enough coffeeBeans!");
                }
                else if(cups < 1){
                    System.out.println("Sorry, not enough cups!");
                }
                break;

            case "3":
                if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && cups > 1) {
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    money += 6;
                    cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                else if(water<200){
                    System.out.println("Sorry, not enough water!");
                }
                else if(milk<100) {
                    System.out.println("Sorry, not enough milk!");
                }
                else if(coffeeBeans < 12){
                    System.out.println("Sorry, not enough coffeeBeans!");
                }
                else if(cups < 1){
                    System.out.println("Sorry, not enough cups!");
                }
                break;

            case "back":
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
    }
    public static void fill() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add: ");
        water += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        coffeeBeans += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cups += sc.nextInt();
    }

    public static void remaining() {
        intro();
    }

    public static void take() {
        System.out.println("I gave you $ " + money);
        money -= money;
    }
}
