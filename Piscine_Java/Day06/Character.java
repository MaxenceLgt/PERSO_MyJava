abstract class Character implements Movable{

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

    public void attack (String weapon) {
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
}
