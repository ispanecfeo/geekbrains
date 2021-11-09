package avdeev.geekbrains;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public void decreaseFood(int food) {
        if (this.food < food){
            this.food = 0;
            return;
        }
        this.food -= food;
    }

    public int getFood() {
        return food;
    }

    public void addFood(int food){
        this.food += food;
    }


}
