package ir.ac.kntu.logic;

import java.util.*;

public class ConsoleGraphicsEngine implements GraphicsEngine {
    private int round = 1;
    private Scanner scanner;
    //TODO: Implement Graphics Options

    @Override
    public int getSizeOfTeam() {
        scanner = new Scanner(System.in);
        System.out.print("Enter Number Of Soldiers : ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    @Override
    public void initialize(ArrayList<Soldier> groupA, ArrayList<Soldier> groupB) {
        printTeam(groupA, null, 1);
        printTeam(groupB, null, 2);
    }

    @Override
    public void visualizeFight(Soldier currentASoldier, Soldier currentBSoldier,
                               int acc1, int acc2, int first,
                               ArrayList<Soldier> teamA, ArrayList<Soldier> teamB) {
        System.out.println("========================ROUND : " + round++ + "========================");
        printTeam(teamA, currentASoldier, 1);
        System.out.println("$$Arena$$ \n" +
                "Soldier A : \n" + currentASoldier.toString() + "\n");
        if (first == 1) {
            if (acc1 <= currentASoldier.getGun().getAccuracy()) {
                System.out.println("Soldier A attacks @AccRoll:" + acc1 + " @success! taked" +
                        currentASoldier.getDamage() + " dmg From Soldier B");
            } else {
                System.out.println("Soldier A attacks @AccRoll:" + acc1 + " @Failed");
            }
            if (acc2 <= currentBSoldier.getGun().getAccuracy()) {
                System.out.println("Soldier B attacks @AccRoll:" + acc2 + " @success! taked" +
                        currentBSoldier.getDamage() + " dmg From Soldier A");
            } else {
                System.out.println("Soldier B attacks @AccRoll:" + acc2 + " @Failed");
            }
        } else if (first == 2) {
            if (acc2 <= currentBSoldier.getGun().getAccuracy()) {
                System.out.println("Soldier B attacks @AccRoll:" + acc2 + " @success! taked" +
                        currentBSoldier.getDamage() + " dmg From Soldier A");
            } else {
                System.out.println("Soldier B attacks @AccRoll:" + acc2 + " @Failed");
            }
            if (acc1 <= currentASoldier.getGun().getAccuracy()) {
                System.out.println("Soldier A attacks @AccRoll:" + acc1 + " @success! taked" +
                        currentASoldier.getDamage() + " dmg From Soldier B");
            } else {
                System.out.println("Soldier A attacks @AccRoll:" + acc1 + " @Failed");
            }
        }
        System.out.println("\n" + currentBSoldier.toString() + "\nSoldier B :");
        System.out.println("$$Arena$$\n");
        printTeam(teamB, currentBSoldier, 2);
        System.out.println("==========================================================");
    }

    @Override
    public void visualizeDeath(Soldier a, Soldier b) {
        if (a.isDead()) {
            System.out.println("Soldier A is Dead !");
        } else if (b.isDead()) {
            System.out.println("Soldier B is Dead !");
        }
    }

    @Override
    public void visualizeVictoryCondition(Director.VictoryState victoryState) {
        System.out.println(victoryState);
    }

    public void printTeam(ArrayList<Soldier> group, Soldier except, int id) {
        if (id == 1) {
            System.out.println("\nSide A : ");
        }
        for (Soldier s : group) {
            if (s == except) {
                continue;
            }
            System.out.println(s.toString());
        }
        if (id == 1) {
            System.out.println();
        }
        if (id == 2) {
            System.out.println("Side B : \n");
        }
    }
}
