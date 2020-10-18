package homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CoffeeMachineThree CM = new CoffeeMachineThree();
        CM.setMaxCoffee(500);
        CM.setMaxMolCoffee(500);
        CM.setMaxWater(500);
        CM.setMaxWaste(500);
        CM.setMaxMilk(500);

        CM.setCoffee(500);
        CM.setMolCoffee(500);
        CM.setWater(500);
        CM.setMilk(500);
        CM.setWaste(0);

        int b=0;
        System.out.println("1 - Turn On\n0 - Exit\n");
        b= scan.nextInt();
        while(b!=0) {
            int a = 1;
            while (a != 0) {
                System.out.print("1 - Prepare Americano\n2 - Prepare Latte\n");
                System.out.print("3 - Increase Coffee\n4 - Increase Water\n");
                System.out.print("5 - Increase Milk\n6 - Clear Waste tank\n");
                System.out.print("7 - Increase Mol Coffee\n8 - Turn off\n");
                int c;
                System.out.print("Choose action:");
                c = scan.nextInt();
                System.out.print("\n");
                switch (c) {
                    case 1:
                        if(CM.getCoffee()<22)
                        {
                            if(CM.getMolCoffee()<22)
                            {
                                System.out.print("Error.\nNot enough coffee or mol coffee\n");
                                break;
                            }
                            else
                            {
                                CM.setMolCoffee(CM.getMolCoffee()-22);
                                CM.setCoffee(CM.getCoffee()+22);
                            }
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
                        System.out.print("Take your Americano\n");
                        System.out.print("\n");
                        break;
                    case 2:
                        int m2;
                        System.out.print("How much milk?\n");
                        m2= scan.nextInt();
                        if(CM.getMilk()<m2||CM.getMilk()<=0)
                        {
                            System.out.print("Not enough milk\n");
                        }
                        if(CM.getCoffee()<22)
                        {
                            if(CM.getMolCoffee()<22)
                            {
                                System.out.print("Error.\nNot enough coffee or mol coffee\n");
                                break;
                            }
                            else
                            {
                                CM.setMolCoffee(CM.getMolCoffee()-22);
                                CM.setCoffee(CM.getCoffee()+22);
                            }
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
                        CM.setMilk(CM.getMilk()-m2);
                        CM.setWaste(CM.getWaste()+22);
                        System.out.print("Take your Latte\n");
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
                            int i2;
                            System.out.print("Enter how much water:");
                            i2 = scan.nextInt();
                            if (i2 > CM.getMaxWater()) {
                                System.out.print("Maximum is" + CM.getMaxWater() + "\nTry again\n");
                                while (i2 > CM.getMaxWater()) {
                                    System.out.print("Enter how much Water:");
                                    i2 = scan.nextInt();
                                    if (i2 > CM.getMaxWater()) {
                                        System.out.print("Maximum is " + CM.getMaxWater() + "\nTry again\n");
                                    }
                                }
                            } else {
                                CM.setWater(i2);
                                System.out.print("Water increased\n");
                                System.out.print("\n");
                            }
                        }
                        break;
                    case 5:
                        if(CM.getMilk()==CM.getMaxMilk())
                        {
                            System.out.println("Milk is full\n");
                            break;
                        }
                        else {
                            int i3;
                            System.out.print("Enter how much milk:");
                            i3 = scan.nextInt();
                            if (i3 > CM.getMaxMilk()) {
                                System.out.print("Maximum is" + CM.getMaxMilk() + "\nTry again\n");
                                while (i3 > CM.getMaxMilk()) {
                                    System.out.print("Enter how much milk:");
                                    i3 = scan.nextInt();
                                    if (i3 > CM.getMaxMilk()) {
                                        System.out.print("Maximum is " + CM.getMaxMilk() + "\nTry again\n");
                                    }
                                }
                            } else {
                                CM.setMilk(i3);
                                System.out.print("Milk increased\n");
                                System.out.print("\n");
                            }
                        }

                        break;
                    case 6:
                        CM.setWaste(0);
                        System.out.print("Waste tank is empty now\n");
                        break;
                    case 7:
                        if(CM.getMolCoffee()==CM.getMaxMolCoffee())
                        {
                            System.out.println("Mol Coffee is full\n");
                            break;
                        }
                        else {
                            int i4;
                            System.out.print("Enter how much mol coffee:");
                            i4 = scan.nextInt();
                            System.out.print("\n");
                            if (i4 > CM.getMaxCoffee()) {
                                System.out.print("Maximum is" + CM.getMaxMolCoffee() + "\nTry again\n");
                                System.out.print("\n");
                                while (i4 > CM.getMaxCoffee()) {
                                    System.out.print("Enter how much mol coffee:");
                                    i4 = scan.nextInt();
                                    if (i4 > CM.getMaxCoffee()) {
                                        System.out.print("Maximum is " + CM.getMaxMolCoffee() + "\nTry again\n");
                                        System.out.print("\n");
                                    }
                                }
                            } else {
                                CM.setCoffee(i4);
                                System.out.println("Mol Coffee increased\n");
                                System.out.print("\n");
                            }
                        }
                        break;
                    case 8:
                        a=0;
                        break;
                }
            }
        }

    }
}
