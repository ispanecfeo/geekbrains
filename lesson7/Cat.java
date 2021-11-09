package avdeev.geekbrains;

public class Cat {

    private String name;
    private boolean satiety;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p){
        int availableFood = Math.min(this.appetite, p.getFood());
        this.satiety = availableFood >= this.appetite;
        p.decreaseFood(availableFood);
        this.appetite -= availableFood;
    }

    @Override
    public String toString() {
        String str;
        if (this.satiety) {
            str = "Кот: " + this.name + " полностью сыт)";
        } else {
            str = "Для сытости коту " + this.name + ", не хватает " +  this.appetite + " единиц еды";
        }
        return  str;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }
}
