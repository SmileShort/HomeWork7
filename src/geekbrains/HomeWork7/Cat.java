package geekbrains.HomeWork7;

public class Cat {
    private boolean isFull;
    private int appetite;
    private String name;

    public Cat(int appetite, String name)
    {
        isFull = false;
        this.appetite = appetite;
        this.name = name;
    }

    public void eat(Plate plate)
    {
        if (plate.hasEnoughFoodFor(appetite) && !isFull)
        {
            System.out.println(name + " кушает из тарелки");
            plate.decreaseFood(appetite);
            isFull = true;
        }
        else if (!plate.hasEnoughFoodFor(appetite))
        {
            System.out.println(name + " недовольно рычит, ведь у тарелки видно дно!");
        }
        else if (isFull)
        {
            System.out.println(name + " уже сыт(а) и больше не хочет кушать!");
        }
    }

}
