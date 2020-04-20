package ir.ac.kntu.logic;

import java.util.ArrayList;

public interface GraphicsEngine {


    public void initialize(ArrayList<Soldier> groupA, ArrayList<Soldier> groupB);

    public void visualizeFight(Soldier currentASoldier,Soldier currentBSoldier);

    public void visualizeDeath();

    public void visualizeVictoryCondition(Director.VictoryState victoryState);
}
