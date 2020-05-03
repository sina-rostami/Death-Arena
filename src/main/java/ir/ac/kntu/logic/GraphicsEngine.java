package ir.ac.kntu.logic;

import java.util.ArrayList;


public interface GraphicsEngine {


    void initialize(ArrayList<Soldier> groupA, ArrayList<Soldier> groupB);

    void visualizeFight(Soldier currentASoldier, Soldier currentBSoldier,
                        int acc1, int acc2, int first,
                        ArrayList<Soldier> teamA, ArrayList<Soldier> teamB);

    void visualizeDeath(Soldier a, Soldier b);

    void visualizeVictoryCondition(Director.VictoryState victoryState);

    int getSizeOfTeam();

    void printTeam(ArrayList<Soldier> group, Soldier except, int id);

}
