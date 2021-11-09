package avdeev.geekbrains;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = {new Cat("Tom", 30), new Cat("Liapolt", 50)};
        Plate p = new Plate(40);

        //Покормим котов и сообщим о результатах кормления
        for(Cat cat: cats){
            cat.eat(p);
            System.out.println(cat);
        }


        ArrayList<Cat> hungryCats = new ArrayList<Cat>();
        //После кормления проверим остались ли голодные коты и добавим
        //еды в тарерлку и снова покормим
        //Намерено делаю второй цикл чтобы разделить логически эти события
        int lackOfFood = 0;
        for(Cat cat: cats) {
            if (!cat.isSatiety()) {
                lackOfFood += cat.getAppetite();
                hungryCats.add(cat);
            }
        }

        if (lackOfFood > 0) {
            p.addFood(lackOfFood);
            System.out.println("Добавили " + lackOfFood + ", единиц еды");
        }

        for (Cat cat : hungryCats) {
            cat.eat(p);
            System.out.println(cat);
        }

    }
}
