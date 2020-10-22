package homework;

abstract class CoffeeMachine {
    private int maxCoffee;
    private int maxWater;
    private int maxWaste;
    private int coffee;
    private int water;
    private int waste;
    private boolean ready;

    // Максимальные значения загрузки зависят от модели.
    public CoffeeMachine(int maxCoffee, int maxWater, int maxWaste) {
        this.maxCoffee = maxCoffee;
        this.maxWater = maxWater;
        this.maxWaste = maxWaste;
    }

    // Кофемашина загружается молотым кофе
    public void addCoffee(int coffee) {
        this.coffee+=coffee;
        if(this.coffee>=maxCoffee)
        {
            this.coffee=maxCoffee;
        }
    }

    // и водой
    public void addWater(int water) {
        this.water += water;
        if(this.water > maxWater) {
            this.water = maxWater;
        }
    }

    // бак для отработаного кофе может быть переполнен
    public void addWaste(int waste) {
        if(this.waste + waste >= this.maxWaste) {
            System.err.println("Waste tank is full\n");
        } else {
            this.waste += waste;
        }
    }

    // бак для отработаного кофе можно очистить
    public void clearWaste(){
        if(this.waste>0)
        {
            this.waste=0;
            System.out.println("Waste tank is cleared\n");
        }
        else
        {
            System.out.println("Waste tank is empty\n");;
        }
    }

    public int getMaxCoffee() {
        return maxCoffee;
    }

    public int getMaxWater() {
        return maxWater;
    }

    public int getMaxWaste() {
        return maxWaste;
    }

    public int getCoffee() {
        return coffee;
    }

    public int getWater() {
        return water;
    }

    public int getWaste() {
        return waste;
    }

    // Кофемашина имеет кнопки:
    // включения;
    public void on(){
        ready=true;
    }
    // выключения;
    public void off(){
        ready=false;
    }

    public void makeEspresso(){
        if(ready){
            if(water>=30)
            {
                if(coffee>=22)
                {
                    water-=30;
                    coffee-=22;
                    addWaste(22);
                    System.out.println("Take Espresso\n");
                }
                else{
                    System.err.println("Not enough coffee\n");
                }
            }
            else {
                System.err.println("Not enough water\n");
            }
        }
    }

    public void makeAmericano(){
        if(ready)
        {
            if(water>100)
            {
                if(coffee>22)
                {
                    water-=100;
                    coffee-=22;
                    addWaste(22);
                    System.out.println("Taker Americano\n");
                }
                else
                {
                    System.err.println("Not enough coffee\n");
                }
            }
            else
            {
                System.err.println("Not enough water\n");
            }
        }
    }

}
