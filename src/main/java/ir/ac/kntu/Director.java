package ir.ac.kntu;

import java.util.ArrayList;

public class Director {

    private ArrayList<Soldier> groupA;
    private ArrayList<Soldier> groupB;

    private GraphicsEngine graphicsEngine;

    private Soldier currentASoldier;
    private Soldier currentBSoldier;

    private VictoryState victoryState;

    public Director(GraphicsEngine graphicsEngine) {
        groupA = new ArrayList<>();
        //TODO: Intialize soldier

        groupA.add(new Soldier(10, 20));
        groupA.add(new Soldier(10, 20));
        groupA.add(new Soldier(10, 20));
        currentASoldier = new Soldier(10, 20);

        groupB = new ArrayList<>();
        //TODO: Intialize soldier

        groupB.add(new Soldier(10, 20));
        groupB.add(new Soldier(10, 20));
        groupB.add(new Soldier(10, 20));
        currentBSoldier = new Soldier(10, 20);

        this.graphicsEngine = graphicsEngine;

        victoryState = VictoryState.NOT_FINISHED;
    }

    public void startGameLoop() {
        //TODO: Hardcopy the arrays
        graphicsEngine.initialize((ArrayList<Soldier>) groupA.clone(),(ArrayList<Soldier>) groupB.clone());
        startFight();
        graphicsEngine.visualizeFight(currentASoldier,currentBSoldier);
        checkDeath();
        checkVictoryCondition();
        graphicsEngine.visualizeVictoryCondition(victoryState);


    }

    private void startFight() {
        if (groupA.size() <= groupB.size()) {
            currentBSoldier = groupB.get(0);
            groupB.remove(0);
        } else {
            currentASoldier = groupA.get(0);
            groupA.remove(0);
        }

    }

    private void checkDeath() {
        //Redundant
    }

    private void checkVictoryCondition() {
        if (groupA.size() == 0) {
            victoryState = VictoryState.WIN_B;
        } else if (groupB.size() == 0) {
            victoryState = VictoryState.WIN_A;
        }
    }

    enum VictoryState {WIN_A, WIN_B, NOT_FINISHED}


}
