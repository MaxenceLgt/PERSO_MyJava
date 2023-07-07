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
        return (true);
    }
}
