abstract class SpaceMarine extends Unit {
    protected Weapon weapon = null;

    protected SpaceMarine(String name, int hp, int ap) {
        super(name, hp, ap);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override public Boolean equip(Weapon newWeapon) {
        if (weapon == null) {
            weapon = newWeapon;
            System.out.println(getName() + " has been equipped with a " + weapon.getName() + ".");
            return (true);
        }
        return (false);
    }

    @Override public Boolean attack(Fighter fighter) {
        if (weapon == null) {
            System.out.println(getName() + ": Hey, this is crazy. I'm not going to fight this empty-handed.");
            return (false);
        }
        if (weapon.isMelee() == true && this.targetCloseTo != fighter) {
            System.out.println(getName() + ": I ' m too far away from " + fighter.getName() + ".");
            return (false);
        }
        if (weapon.getApcost() <= getAp()) {
            System.out.println(getName() + " attacks " + fighter.getName() + " with a " + weapon.getName() + ".");
            this.ap -= weapon.getApcost();
            weapon.attack();
            fighter.receiveDamage(weapon.getDamage());
            return (true);
        }
        return (false);
    }

    @Override public Boolean moveCloseTo(Fighter fighter) {
        if (weapon.isMelee()) {
            return (super.moveCloseTo(fighter));
        }
        return (false);
    }

    @Override public void recoverAP() {
        this.ap += 2;
        super.recoverAP();
    }
}
