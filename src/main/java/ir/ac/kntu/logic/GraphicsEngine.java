package ir.ac.kntu.logic;

import java.util.ArrayList;
import java.util.Scanner;

public interface GraphicsEngine {


    void initialize(ArrayList<Soldier> groupA, ArrayList<Soldier> groupB);

    void visualizeFight(Soldier currentASoldier, Soldier currentBSoldier);

    void visualizeDeath();

    void visualizeVictoryCondition(Director.VictoryState victoryState);

    int getSizeOfTeam();

}
