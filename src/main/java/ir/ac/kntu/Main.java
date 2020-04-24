package ir.ac.kntu;

import ir.ac.kntu.logic.ConsoleGraphicsEngine;
import ir.ac.kntu.logic.Director;
import ir.ac.kntu.logic.GraphicsEngine;
import ir.ac.kntu.util.RandomHelper;

public class Main {
    public static void main(String[] args) {
        GraphicsEngine engine = new ConsoleGraphicsEngine();
        Director director = new Director(engine);
        //TODO: Start your game from here
        System.out.println(RandomHelper.nextInt(15));
        System.out.println(RandomHelper.nextInt(15));
        System.out.println(RandomHelper.nextInt(15));
    }
    
}
