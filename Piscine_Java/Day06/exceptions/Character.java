package exceptions;

abstract class Character implements Movable {

    protected String name;
    protected final String RPGClass;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;

    protected Character(String newName, String newRpgClass) {
        this.name = newName;
        this.RPGClass = newRpgClass;
    }

    public String getName() {
        return name;
    }

    public String getRPGClass() {
        return RPGClass;
    }

    public int getAgility() {
        return agility;
    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public void attack (String weapon) throws WeaponException {
        System.out.println(name + ": Rrrrrrrrr....");
    }

    @Override public void moveBack() {
        System.out.print(getName() + ": move back");
    }

    @Override public void moveForward() {
        System.out.print(getName() + ": move forward");
    }

    @Override public void moveLeft() {
        System.out.print(getName() + ": move left");
    }

    @Override public void moveRight() {
        System.out.print(getName() + ": move right");
    }

    public final void unsheathe() {
        System.out.println(getName() + ": unsheathes his weapon.");
    }

    public void tryToAttack(String weapon) {
        try {
            if (weapon.isEmpty()) {
                throw new WeaponException(getName()+ ": I refuse to fight with my bare hands!");
            } else if ((weapon != "hammer" || weapon != "sword") & RPGClass == "Warrior") {
                throw new WeaponException(getName() + ": A " + weapon + "?? What should I do with this ?!");
            } else if ((weapon != "magic" || weapon != "wand") & RPGClass == "Mage") {
                throw new WeaponException(getName() + ": I don't need this stupid " + weapon + "! Don ' t misjudge my powers !");
            } else {
                attack(weapon);
            }
        } catch (WeaponException e) {
            System.out.println(e);
        }
    }

}
