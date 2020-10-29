package homework;

public class CoffeeMachineThree extends CoffeeMachineTwo {
    private boolean ready;
    private int milk;
    private int maxMilk;
    private int water;
    private int coffee;
    private int waste;
    private int maxZern;
    private int zern;

    public CoffeeMachineThree(int maxCoffee,int maxWater,int maxWaste,int maxMilk, int maxZern){
        super(maxCoffee, maxWater, maxWaste,maxMilk);
        this.maxZern=maxZern;
    }

    //включается
    public void on(){
        ready=true;
    }

    //выключается
    public void off(){
        ready=false;
    }

    @Override
    public void makeEspresso() {
        System.err.println("This function can not be done\n");
    }

    @Override
    public void makeAmericano() {
        System.err.println("This function can not be done\n");
    }

    public void addZern(int zern)
    {
        this.zern+=zern;
        if(this.zern>=maxZern)
        {
            this.zern=maxZern;
        }
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
                    if(zern>=22)
                    {
                        coffee+=22;
                        zern-=22;
                        water-=30;
                        coffee-=22;
                        addWaste(22);
                        this.milk-=milk;
                        System.out.println("Take your Latte\n");
                    }
                    else
                    {
                        System.err.println("Not enough coffee\n");
                    }
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
                    if(zern>=22)
                    {
                        coffee+=22;
                        zern-=22;
                        water-=30;
                        coffee-=22;
                        addWaste(22);
                        this.milk-=milk;
                        System.out.println("Take your Capuchino\n");
                    }
                    else
                    {
                        System.err.println("Not enough coffee\n");
                    }
                }
            }
            else
            {
                System.err.println("Not enough water\n");
            }
        }
    }

}
