package avdeev.geekbrains;

public class Human implements Participant{

    private int maxHeight;
    private int maxLength;
    private Boolean passObstacle;

    public Human(int maxHeight, int maxLength) {
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
        return "Human";
    }

    @Override
    public void jump() {
        System.out.println("Прыгает человек");
    }

    @Override
    public int getMaximumHeight() {
        return this.maxHeight;
    }

    @Override
    public void run() {
        System.out.println("Бежит человек");
    }

    @Override
    public int getMaximumLength() {
        return this.maxLength;
    }
}
