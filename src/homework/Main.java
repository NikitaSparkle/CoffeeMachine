package homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CoffeeMachineOne coffeeMachine = new CoffeeMachineOne(500,500,500);
        coffeeMachine.on();
        coffeeMachine.addWater(500);
        coffeeMachine.addCoffee(500);
        coffeeMachine.makeEspresso();

    }
}
