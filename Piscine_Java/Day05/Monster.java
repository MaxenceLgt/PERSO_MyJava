abstract class Monster extends Unit {
    protected int damage = 0;
    protected int apcost = 0;

    protected Monster(String name, int hp, int ap) {
        super(name, hp, ap);
    }

    public int getDamage() {
        return damage;
    }

    public int getApcost() {
        return apcost;
    }

    @Override public Boolean equip(Weapon newWeapon) {
        System.out.println("Monsters are proud and fight with their own bodies.");
        return false;
    }

    @Override public Boolean attack(Fighter fighter) {
        if (this.targetCloseTo != fighter) {
            System.out.println(getName() + ": I'm too far away from " + fighter.getName());
            return (false);
        }
        if (this.ap >= apcost) {
            this.ap -= apcost;
            System.out.println(getName() + " attacks " + fighter.getName());
            fighter.receiveDamage(damage);
            return (true);
        }
        return false;
    }
}
