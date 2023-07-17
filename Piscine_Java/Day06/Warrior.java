public class Warrior extends Character {
    protected Warrior(String warriorName) {
        super(warriorName, "Warrior");
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        System.out.println(getName() + ": My name will go down in history!");
    }

    @Override public void attack(String weapon) {
        if (weapon == "hammer" || weapon == "sword") {
            super.attack(weapon);
            System.out.println(getName() + ": I'll crush you with my " + weapon + "!");
        }
    }

    @Override public void moveBack() {
        super.moveBack();
        System.out.println(" like a bad boy.");
    }

    @Override public void moveForward() {
        super.moveForward();
        System.out.println(" like a bad boy.");
    }

    @Override public void moveLeft() {
        super.moveLeft();
        System.out.println(" like a bad boy.");
    }

    @Override public void moveRight() {
        super.moveRight();
        System.out.println(" like a bad boy.");
    }
}
