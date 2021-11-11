package avdeev.geekbrains;

public class Cat implements Participant{

    private int maxHeight;
    private int maxLength;
    private Boolean passObstacle;

    public Cat(int maxHeight, int maxLength) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.passObstacle = null;
    }

    @Override
    public Boolean getPassObstacle() {
        return passObstacle;
    }

    @Override
    public void setPassObstacle(Boolean passObstacle) {
        this.passObstacle = passObstacle;
    }

    @Override
    public String getTypeParticipant() {
        return "Cat";
    }

    @Override
    public void jump() {
        System.out.println("Прыгнула кошка");
    }

    @Override
    public int getMaximumHeight() {
        return this.maxHeight;
    }

    @Override
    public void run() {
        System.out.println("Бежит кошка");
    }

    @Override
    public int getMaximumLength() {
        return maxLength;
    }
}
