package ir.ac.kntu.logic;

import java.util.ArrayList;

public class Director {

    private ArrayList<Soldier> groupA;
    private ArrayList<Soldier> groupB;

    private GraphicsEngine graphicsEngine;

    private Soldier currentASoldier;
    private Soldier currentBSoldier;

    private VictoryState victoryState;

    public Director(GraphicsEngine graphicsEngine) {
        //TODO: Intialize soldiers


        this.graphicsEngine = graphicsEngine;

        victoryState = VictoryState.NOT_FINISHED;
    }

    public void startGameLoop() {
        //TODO: Add Game Logic Loop here - Graphics also go here

    }


    public enum VictoryState {WIN_A, WIN_B, NOT_FINISHED}


}
