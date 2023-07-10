import com.sun.jdi.ClassObjectReference;

import java.util.*;

public class SpaceArena {

    private List<SpaceMarine> marines = new ArrayList<>();
    private List<Monster> monsters = new ArrayList<>();

    public void enlistMonsters(List<Monster> listOfMonsters) {
        for (int i = 0; i < listOfMonsters.size(); i++) {
            monsters.add(listOfMonsters.get(i));
        }
    }

    public void enlistSpaceMarines (List<SpaceMarine> listOfMarines) {
        for (int i = 0; i < listOfMarines.size(); i++) {
            if (!marines.contains(listOfMarines.get(i))) {
                marines.add(listOfMarines.get(i));
            }
        }
    }

    public boolean fight() {
        if (marines.isEmpty()) {
            System.out.println("Those cowards ran away.");
            return (false);
        } else if (monsters.isEmpty()) {
            System.out.println("No monsters available to fight.");
            return (false);
        }
        System.out.println(marines.get(0).getName() + " has entered the arena.");
        System.out.println(monsters.get(0).getName() + " has entered the arena.");
        while (!marines.isEmpty() && !monsters.isEmpty()) {
            spaceMarinesAttack();
            if (!verifySurvivingLists()) {
                continue;
            }
            monstersAttack();
            if (!verifySurvivingLists()) {
                continue;
            }
        }
        if (marines.isEmpty()) {
            System.out.println("The monsters are victorious!");
        } else if (monsters.isEmpty()) {
            System.out.println("The spaceMarines are victorious");
        }
        return (true);
    }

    private void spaceMarinesAttack() {
        if (marines.get(0).attack(monsters.get(0)) == false) {
            if (marines.get(0).weapon.isMelee() && marines.get(0).weapon.isMelee()) {
                marines.get(0).moveCloseTo(monsters.get(0));
            }
            if (marines.get(0).weapon.getApcost() > marines.get(0).getAp()) {
                marines.get(0).recoverAP();
            }
        }
    }

    private void monstersAttack() {
        if (monsters.get(0).attack(marines.get(0)) == false) {
            if (monsters.get(0).targetCloseTo != marines.get(0)) {
                monsters.get(0).moveCloseTo(marines.get(0));
            } else if (monsters.get(0).getApcost() > monsters.get(0).getAp()) {
                monsters.get(0).recoverAP();
            }
        }
    }

    private boolean verifySurvivingLists() {
        if (marines.get(0).getHp() <= 0) {
            marines.remove(0);
            monsters.get(0).recoverAP();
            if (!marines.isEmpty()) {
                System.out.println(marines.get(0).getName() + " has entered the arena.");
            }
            return (false);
        }
        if (monsters.get(0).getHp() <= 0) {
            monsters.remove(0);
            marines.get(0).recoverAP();
            if (!monsters.isEmpty()) {
                System.out.println(monsters.get(0).getName() + " has entered the arena.");
            }
            return (false);
        }
        return (true);
    }
}
