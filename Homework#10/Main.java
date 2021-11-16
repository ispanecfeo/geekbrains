package avdeev.geekbrains;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

         String[] arrString = {"One", "Two", "Three"};
         ExchangeElementsArray.exchange(arrString);
         System.out.println(Arrays.toString(arrString));

         Integer[] arrInteger = {1, 2, 3};
         ExchangeElementsArray.exchange(arrInteger);
         System.out.println(Arrays.toString(arrInteger));

          Orange orange1 = new Orange();
          Orange orange2 = new Orange();

          Apple apple1 = new Apple();
          Apple apple2 = new Apple();
          Apple apple3 = new Apple();

          Box<Orange> boxOranges = new Box<>();
          boxOranges.add(orange1);
          boxOranges.add(orange2);

          Box<Apple> boxApples1 = new Box<>();
          boxApples1.add(apple1);
          boxApples1.add(apple2);
          boxApples1.add(apple3);

          String messCompare =  boxApples1.compare(boxOranges) ? "совпадают" : "не совпадают";
          System.out.println("Веса в коробках " + messCompare);

          Apple apple4 = new Apple();
          Apple apple5 = new Apple();
          Apple apple6 = new Apple();

          Box<Apple> boxApples2 = new Box<>();
          boxApples2.add(apple4);
          boxApples2.add(apple5);
          boxApples2.add(apple6);

          System.out.println("Количество фруктов в коробках:");

          System.out.println(boxApples1);
          System.out.println(boxApples2);

          System.out.println();
          System.out.println("Пересыпаем фрукты");

          boxApples1.pourOverFruits(boxApples2);

          System.out.println("Количество фруктов в коробках после пересыпания:");

          System.out.println(boxApples1);
          System.out.println(boxApples2);



    }
}
