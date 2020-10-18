package homework;

abstract class CoffeeMachine {
    private int MaxCoffee;
    private int MaxWater;
    private int MaxWaste;
    private int Coffee;
    private int Water;
    private int Waste;

    public void setMaxCoffee(int maxCoffee) {
        MaxCoffee = maxCoffee;
    }

    public void setMaxWater(int maxWater) {
        MaxWater = maxWater;
    }

    public void setMaxWaste(int maxWaste) {
        MaxWaste = maxWaste;
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

    public int getMaxCoffee() {
        return MaxCoffee;
    }

    public int getMaxWater() {
        return MaxWater;
    }

    public int getMaxWaste() {
        return MaxWaste;
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
}
