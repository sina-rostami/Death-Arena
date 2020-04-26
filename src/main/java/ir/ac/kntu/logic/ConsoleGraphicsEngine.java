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
        printTeam(groupA);
        System.out.println("\nSide B : ");
        printTeam(groupB);
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

    public void printTeam(ArrayList<Soldier> group) {
        for (int i = 0; i < group.size(); i++) {
            Soldier s = group.get(i);
            System.out.println("[ID@" + (i + 1) + " " + s.toString() + " ]");
        }
    }
}
