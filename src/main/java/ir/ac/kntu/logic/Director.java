package ir.ac.kntu.logic;

import java.util.ArrayList;
import java.util.List;

import ir.ac.kntu.gamelogic.RandomObjects;

public class Director {

    private final ArrayList<Soldier> groupA;
    private final ArrayList<Soldier> groupB;

    private final GraphicsEngine graphicsEngine;

    private Soldier currentASoldier;
    private Soldier currentBSoldier;

    private final VictoryState victoryState;

    public Director(GraphicsEngine graphicsEngine) {
        //TODO: Intialize soldiers
        this.graphicsEngine = graphicsEngine;
        int size = graphicsEngine.getSizeOfTeam();
        groupA = new ArrayList<>(RandomObjects.getRandomSoldiers(size));
        groupB = new ArrayList<>(RandomObjects.getRandomSoldiers(size));
        victoryState = VictoryState.NOT_FINISHED;
        graphicsEngine.initialize(groupA, groupB);
    }

    public void startGameLoop() {
        //TODO: Add Game Logic Loop here - Graphics also go here

    }


    public enum VictoryState {WIN_A, WIN_B, NOT_FINISHED}


}
