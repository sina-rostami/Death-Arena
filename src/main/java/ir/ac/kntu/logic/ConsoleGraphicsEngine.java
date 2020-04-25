package ir.ac.kntu.logic;

import java.util.*;

public class ConsoleGraphicsEngine implements GraphicsEngine {

    //TODO: Implement Graphics Options

    @Override
    public int getSizeOfTeam() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number Of Soldiers : ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    @Override
    public void initialize(ArrayList<Soldier> groupA, ArrayList<Soldier> groupB) {
        System.out.println("Side A : ");
        for (int i = 0; i < groupA.size(); i++) {
            Soldier s = groupA.get(i);
            System.out.println("[ID@" + (i + 1) + " " + s.toString() + " ]");
        }
        System.out.println("\nSide B : ");
        for (int i = 0; i < groupB.size(); i++) {
            Soldier s = groupB.get(i);
            System.out.println("[ID@" + (i + 1) + " " + s.toString() + " ]");
        }
    }
    @Override
    public void visualizeFight(Soldier currentASoldier, Soldier currentBSoldier) {

    }

    @Override
    public void visualizeDeath() {

    }

    @Override
    public void visualizeVictoryCondition(Director.VictoryState victoryState) {

    }
}
