package ir.ac.kntu;

import ir.ac.kntu.logic.ConsoleGraphicsEngine;
import ir.ac.kntu.logic.Director;
import ir.ac.kntu.logic.GraphicsEngine;

public class Main {
    GraphicsEngine engine = new ConsoleGraphicsEngine(); 
    Director director = new Director(graphicsEngine); 
    
    //TODO: Start your game from here
}
