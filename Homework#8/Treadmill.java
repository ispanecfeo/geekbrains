package avdeev.geekbrains;

public class Treadmill implements Obstacles {

    private int trackLength;
    private final String name = "Беговая дорожка";

    public  Treadmill(int length){
        this.trackLength = length;
    }

    @Override
    public void performTask(Participant participant) {

        if (participant.getPassObstacle() != null && Boolean.FALSE.equals(participant.getPassObstacle())) {
            System.out.println(participant.getTypeParticipant() + " участнику нельзя проходить препятствие - \"" + this.name + "\"");
            return;
        }

        if (participant.getMaximumLength() >= this.trackLength) {
            successfullyRan(participant.getTypeParticipant());
            participant.setPassObstacle(true);
        } else {
            failureRan(participant.getTypeParticipant());
            participant.setPassObstacle(false);
        }

    }

    private void successfullyRan(String type) {
        System.out.println(type + " успешно пробежал");
    }

    private void failureRan(String type) {
        System.out.println(type + " не удалось пробежать");
    }


}
