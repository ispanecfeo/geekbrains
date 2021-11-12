package avdeev.geekbrains;

public class Robot implements Participant{

    private int maxHeight;
    private int maxLength;
    private Boolean passObstacle;

    public Robot(int maxHeight, int maxLength) {
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
        return "Robot";
    }

    @Override
    public void jump() {
        System.out.println("Прыгнул робот");
    }

    @Override
    public int getMaximumHeight() {
        return this.maxHeight;
    }

    @Override
    public void run() {
        System.out.println("Бежит робот");
    }

    @Override
    public int getMaximumLength() {
        return this.maxLength;
    }
}
