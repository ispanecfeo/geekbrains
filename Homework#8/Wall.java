package avdeev.geekbrains;

public class Wall implements Obstacles {

    private  int wallHeight;
    private final String name = "Стена";

    public  Wall(int height) {
        this.wallHeight = height;
    }

    @Override
    public void performTask(Participant participant) {
        if (participant.getPassObstacle() != null && Boolean.FALSE.equals(participant.getPassObstacle())) {
            System.out.println(participant.getTypeParticipant() + " участнику нельзя проходить препятствие - \"" + this.name + "\"");
            return;
        }

        if (participant.getMaximumHeight() >= this.wallHeight) {
            successfullyСlimbed(participant.getTypeParticipant());
            participant.setPassObstacle(true);
        } else {
            failureСlimbed(participant.getTypeParticipant());
            participant.setPassObstacle(false);
        }

    }

    private void successfullyСlimbed(String type) {
        System.out.println(type + " успешно залез на стену");
    }

    private void failureСlimbed(String type) {
        System.out.println(type + " не удалось залезть");
    }
}
