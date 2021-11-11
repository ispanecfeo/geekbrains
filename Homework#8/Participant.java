package avdeev.geekbrains;

public interface Participant extends Runner, Jumper{
    Boolean getPassObstacle();
    void setPassObstacle(Boolean passObstacle);
    String getTypeParticipant();

}
