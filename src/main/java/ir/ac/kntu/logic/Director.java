package ir.ac.kntu.logic;

import java.util.List;

public class Director {

    private List<Soldier> groupA;
    private List<Soldier> groupB;

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
