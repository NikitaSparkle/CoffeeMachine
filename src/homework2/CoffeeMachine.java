package homework2;

abstract class CoffeeMachine {
    private int MaxCoffee;
    private int MaxWater;
    private int MaxWaste;
    private int MaxMilk;
    private int Coffee;
    private int Water;
    private int Waste;
    private int Milk;

    public void setMaxCoffee(int maxCoffee) {
        MaxCoffee = maxCoffee;
    }

    public void setMaxWater(int maxWater) {
        MaxWater = maxWater;
    }

    public void setMaxWaste(int maxWaste) {
        MaxWaste = maxWaste;
    }

    public void setMaxMilk(int maxMilk) {
        MaxMilk = maxMilk;
    }

    public void setCoffee(int coffee) {
        Coffee = coffee;
    }

    public void setWater(int water) {
        Water = water;
    }

    public void setWaste(int waste) {
        Waste = waste;
    }

    public void setMilk(int milk) {
        Milk = milk;
    }

    public int getMaxCoffee() {
        return MaxCoffee;
    }

    public int getMaxWater() {
        return MaxWater;
    }

    public int getMaxWaste() {
        return MaxWaste;
    }

    public int getMaxMilk() {
        return MaxMilk;
    }

    public int getCoffee() {
        return Coffee;
    }

    public int getWater() {
        return Water;
    }

    public int getWaste() {
        return Waste;
    }

    public int getMilk() {
        return Milk;
    }

}
