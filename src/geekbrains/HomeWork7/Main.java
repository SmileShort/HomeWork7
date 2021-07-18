package geekbrains.HomeWork7;

public class Main {

    public static void main(String[] args) {

            Cat[] cats = {
                    new Cat(7, "Маня"),
                    new Cat(8, "Мику"),
                    new Cat(15, "Рыжик")
            };

            Plate plate = new Plate(20);

            for (Cat cat : cats)
            {
                cat.eat(plate);
            }

            plate.increaseFood(30);

            for (Cat cat : cats)
            {
                cat.eat(plate);
            }
        }

}
