package avdeev.geekbrains;

public class Main {

    public static void main(String[] args) {

       Participant[] participants = {
               new Cat(3, 100),
               new Human(15, 3000),
               new Robot(100, 15000)
       };

       Obstacles[] obstacles = {new Treadmill(2000), new Wall(15)};

        for (Participant p: participants ) {

            for (Obstacles o:  obstacles) {
                o.performTask(p);
            }

        }


    }
}
