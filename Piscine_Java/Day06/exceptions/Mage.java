package exceptions;

public class Mage extends Character {
    protected Mage(String mageName) {
        super(mageName, "Mage");
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        System.out.println(getName() + ": May the gods be with me.");
    }

    @Override public void attack(String weapon) throws WeaponException {
        if (weapon == "magic" || weapon == "wand") {
            super.attack(weapon);
            System.out.println(getName() + ": Feel the power of my " + weapon + "!");
        } else {
            tryToAttack(weapon);
        }
    }

    @Override public void moveBack() {
        super.moveBack();
        System.out.println(" furtively.");
    }

    @Override public void moveForward() {
        super.moveForward();
        System.out.println(" furtively.");
    }

    @Override public void moveLeft() {
        super.moveLeft();
        System.out.println(" furtively.");
    }

    @Override public void moveRight() {
        super.moveRight();
        System.out.println(" furtively.");
    }
}
