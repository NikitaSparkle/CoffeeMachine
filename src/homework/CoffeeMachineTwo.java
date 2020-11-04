package homework;

public class CoffeeMachineTwo extends CoffeeMachine {
    private int milk;
    private int maxMilk;
    private boolean ready;
    private int water;
    private int coffee;
    private int waste;

    public CoffeeMachineTwo(int maxCoffee, int maxWater, int maxWaste, int maxMilk) {
        super(maxCoffee, maxWater, maxWaste);
        this.maxMilk = maxMilk;
    }

    // Заполняется молоком
    public void addMilk(int milk){
        this.milk=milk;
        if(this.milk>maxMilk)
        {
            this.milk=maxMilk;
        }
    }

    // Зачем здесь нужно переопределять метод? он такой же, как и в CoffeeMachine
    public void on(){
        ready=true;
    }

    // Зачем здесь нужно переопределять метод? он такой же, как и в CoffeeMachine
    public void off(){
        ready=false;
    }

    //делает Латте
    public void makeLatte(int milk){
        if(ready)
        {
            if(water>=30)
            {
                if(coffee>=22)
                {
                    if(this.milk>=milk)
                    {
                        water-=30;
                        coffee-=22;
                        addWaste(22);
                        this.milk-=milk;
                        System.out.println("Take your Latte\n");
                    }
                    else
                    {
                        System.err.println("Not enough milk");
                    }
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

    //делаеет Капучино
    public void makeCapuchino(int milk){
        if(ready)
        {
            if(water>=30)
            {
                if(coffee>=22)
                {
                    if(this.milk>=milk)
                    {
                        water-=30;
                        coffee-=22;
                        addWaste(22);
                        this.milk-=milk;
                        System.out.println("Take your Capuchino\n");
                    }
                    else
                    {
                        System.err.println("Not enough milk");
                    }
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
