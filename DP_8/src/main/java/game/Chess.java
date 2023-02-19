package game;

public class Chess extends Game {
    @Override
    void initialize() {
        System.out.println("Game Chess initialized.");
    }

    @Override
    void start() {
        System.out.println("Game Chess started");
    }

    @Override
    void end() {
        System.out.println("Game Chess finished");
    }
}
