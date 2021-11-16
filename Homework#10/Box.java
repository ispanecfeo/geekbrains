package avdeev.geekbrains;

import java.util.ArrayList;
import java.util.Iterator;

public class Box <T extends Fruit> {

    ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<T>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0;
        for (T fruit:fruits) {
           weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean getEmpty() {
        return this.fruits.isEmpty();
    }

    public void clearBox() {
        this.fruits.clear();
    }

    public ArrayList<T> getFruits() {
        return this.fruits;
    }


    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
    }

    @Override
    public String toString() {
        return "В данной коробке находится " + this.fruits.size() + " фруктов";
    }

    public void pourOverFruits(Box<T> box) {

        if (box.getFruits().isEmpty()) return;
        ArrayList<T> fruits = box.getFruits();

        for (T fruit : fruits) {
            this.add(fruit);
        }
        box.clearBox();



    }

}
