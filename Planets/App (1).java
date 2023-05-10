import explorers.*;
import planets.*;

public class App {

    public static void main(String[] args) {

        planet mars = new mars();
        planet saturn = new saturn();
        planet mercury = new mercury();
        planet neptune = new neptune();
        planet jupiter = new jupiter();

        explorer astronaut = new humanexplorer();
        explorer rover = new robotexplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        neptune.accept(astronaut);
        jupiter.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        neptune.accept(rover);
        jupiter.accept(rover);
    }
}
