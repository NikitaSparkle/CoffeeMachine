package homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CoffeeMachineOne CM = new CoffeeMachineOne();
        CM.setMaxCoffee(500);
        CM.setMaxWater(500);
        CM.setMaxWaste(500);

        CM.setCoffee(500);
        CM.setWater(500);
        CM.setWaste(0);

        int b=0;
        System.out.println("1 - Turn On\n0 - Exit\n");
        b= scan.nextInt();
        while(b!=0) {
            int a = 1;
            while (a != 0) {
                System.out.print("1 - Prepare Espresso\n2 - Prepare Americano\n");
                System.out.print("3 - Increase Coffee\n4 - Increase Water\n");
                System.out.print("5 - Clear Waste tank\n6 - Turn Off\n");
                int c;
                System.out.print("Choose action:");
                c = scan.nextInt();
                System.out.print("\n");
                switch (c) {
                    case 1:
                        if(CM.getCoffee()<22)
                        {
                            System.out.print("Error.\nNot enough coffee\n");
                            break;
                        }
                        if(CM.getWater()<30)
                        {
                            System.out.print("Error.\nNot enough water\n");
                            break;
                        }
                        if(CM.getWaste()>=CM.getMaxWaste())
                        {
                            System.out.print("Error.\nWaste tank is full\n");
                            break;
                        }
                        CM.setCoffee(CM.getCoffee() - 22);
                        CM.setWater(CM.getWater() - 30);
                        CM.setWaste(CM.getWaste()+22);
                        System.out.print("Take your coffee\n");
                        System.out.print("\n");
                        break;
                    case 2:
                        if(CM.getCoffee()<22)
                        {
                            System.out.print("Error.\nNot enough coffee\n");
                            break;
                        }
                        if(CM.getWater()<100)
                        {
                            System.out.print("Error.\nNot enough water\n");
                            break;
                        }
                        if(CM.getWaste()>=CM.getMaxWaste())
                        {
                            System.out.print("Error.\nWaste tank is full\n");
                            break;
                        }
                        CM.setCoffee(CM.getCoffee() - 22);
                        CM.setWater(CM.getWater() - 100);
                        CM.setWaste(CM.getWaste()+22);
                        System.out.print("Take your coffee\n");
                        System.out.print("\n");
                        break;
                    case 3:
                        if(CM.getCoffee()==CM.getMaxCoffee())
                        {
                            System.out.println("Water is full\n");
                            break;
                        }
                        else {
                            int i;
                            System.out.print("Enter how much coffee:");
                            i = scan.nextInt();
                            System.out.print("\n");
                            if (i > CM.getMaxCoffee()) {
                                System.out.print("Maximum is" + CM.getMaxCoffee() + "\nTry again\n");
                                System.out.print("\n");
                                while (i > CM.getMaxCoffee()) {
                                    System.out.print("Enter how much coffee:");
                                    i = scan.nextInt();
                                    if (i > CM.getMaxCoffee()) {
                                        System.out.print("Maximum is " + CM.getMaxCoffee() + "\nTry again\n");
                                        System.out.print("\n");
                                    }
                                }
                            } else {
                                CM.setCoffee(i);
                                System.out.println("Coffee increased\n");
                                System.out.print("\n");
                            }
                        }
                        break;
                    case 4:
                        if(CM.getWater()==CM.getMaxWater())
                        {
                            System.out.println("Water is full\n");
                            break;
                        }
                        else {
                            int i;
                            System.out.print("Enter how much water:");
                            i = scan.nextInt();
                            if (i > CM.getMaxWater()) {
                                System.out.print("Maximum is" + CM.getMaxWater() + "\nTry again\n");
                                while (i > CM.getMaxWater()) {
                                    System.out.print("Enter how much Water:");
                                    i = scan.nextInt();
                                    if (i > CM.getMaxWater()) {
                                        System.out.print("Maximum is " + CM.getMaxWater() + "\nTry again\n");
                                    }
                                }
                            } else {
                                CM.setWater(i);
                                System.out.print("Water increased\n");
                                System.out.print("\n");
                            }
                        }
                        break;
                    case 5:
                        CM.setWaste(0);
                        System.out.print("Waste tank is empty now\n");
                        break;
                    case 6:
                        a=0;
                        break;
                }
            }
        }

    }
}
