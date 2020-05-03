package ir.ac.kntu.gamelogic;

import ir.ac.kntu.util.RandomHelper;

import java.util.*;

import ir.ac.kntu.logic.*;

public final class RandomObjects {
    public static ArrayList<Soldier> getRandomSoldiers(int size) {
        ArrayList<Soldier> tempList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            tempList.add(newRandomSoldier());
        }
        for (int i = 0; i < size; i++) {
            tempList.get(i).setId(i + 1);
        }
        return new ArrayList<>(tempList);
    }

    public static Soldier newRandomSoldier() {
        int rand = Math.abs(RandomHelper.nextInt());
        rand %= 4;
        Gun gun = null;
        switch (rand) {
            case 0:
                gun = new AssaultRifle(Caliber.FIVE);
                break;
            case 1:
                gun = new AssaultRifle(Caliber.SEVEN);
                break;
            case 2:
                gun = new SniperRifle(Caliber.FIVE, RandomHelper.nextBoolean());
                break;
            case 3:
                gun = new SniperRifle(Caliber.SEVEN, RandomHelper.nextBoolean());
                break;
            default:
                break;
        }
        rand = Math.abs(RandomHelper.nextInt());
        int health = (rand % 91) + 10;
        return new Soldier(health, gun.getDamage(), gun);
    }

    public static Soldier getRandomSoldier(ArrayList<Soldier> group) {
        int random = RandomHelper.nextInt(group.size());
        Soldier soldier = group.get(random);
        if (!soldier.isDead()) {
            return soldier;
        } else {
            return getRandomSoldier(group);
        }
    }

}
