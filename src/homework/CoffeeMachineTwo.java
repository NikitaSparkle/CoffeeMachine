package homework;

public class CoffeeMachineTwo extends CoffeeMachineOne {
    private int milk;
    private int maxMilk;

    public CoffeeMachineTwo(int maxCoffee, int maxWater, int maxWaste, int maxMilk) {
        super(maxCoffee, maxWater, maxWaste);
        this.maxMilk = maxMilk;
    }

    @Override
    public void makeEspresso() {
        System.out.println("Incorrect function");
    }
}
