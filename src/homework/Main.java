package homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CoffeeMachineThree coffeeMachine = new CoffeeMachineThree(500,500,500,500,500);
        int a=2;
        System.out.print("1 - Turn on\n0 - Exit\n");
        a= scan.nextInt();
        switch (a)
        {
            case 1:a=1;
                coffeeMachine.on();
                break;
            case 0:a=0;
            break;
        }
        while(a!=0)
        {
            int c;
            System.out.print("1 - Make Espresso\n2 - Make Americano\n");
            System.out.print("3 - Make Latte\n4 - Make Capuchino\n");
            System.out.print("5 - Clear waste tank\n6 - Add Coffee\n");
            System.out.print("7 - Add Water\n8 - Add Milk\n");
            System.out.print("9 - Turn off\n");
            System.out.print("Choose action:" );
            c= scan.nextInt();
            switch(c)
            {
                case 1:
                    coffeeMachine.makeEspresso();
                    System.out.print("\n");
                    break;
                case 2:
                    coffeeMachine.makeAmericano();
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.println("How much milk?");
                    int milk1= scan.nextInt();
                    coffeeMachine.makeLatte(milk1);
                    break;
                case 4:
                    System.out.println("How much milk?");
                    int milk2= scan.nextInt();
                    coffeeMachine.makeCapuchino(milk2);
                    break;
                case 5:
                    coffeeMachine.clearWaste();
                    System.out.print("\n");
                    break;
                case 6:
                    System.out.print("How much coffee?\n>>");
                    int inc= scan.nextInt();
                    coffeeMachine.addCoffee(inc);
                    System.out.print("\n");
                    break;
                case 7:
                    System.out.print("How much water?\n>>");
                    int inc2= scan.nextInt();
                    coffeeMachine.addWater(inc2);
                    System.out.print("\n");
                    break;
                case 8:
                    System.out.print("How much milk?\n>>");
                    int inc3= scan.nextInt();
                    coffeeMachine.addMilk(inc3);
                    System.out.print("\n");
                    break;
                case 9:
                    coffeeMachine.off();
                    a=0;
                    break;
            }
        }

    }
}
