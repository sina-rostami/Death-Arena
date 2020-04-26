package ir.ac.kntu;

import ir.ac.kntu.logic.*;
import ir.ac.kntu.util.RandomHelper;

public class Main {
    public static void main(String[] args) {
        GraphicsEngine engine = new ConsoleGraphicsEngine();
        Director director = new Director(engine);
        director.startGameLoop();
        //TODO: Start your game from here
    }

}
