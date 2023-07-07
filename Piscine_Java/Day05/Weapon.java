abstract class Weapon {
    protected String name;
    protected int apcost;
    protected int damage;
    protected boolean melee;

    protected Weapon(String newName, int newApcost, int newDamage, boolean isMelee) {
        name = newName;
        apcost = newApcost;
        damage = newDamage;
        melee = isMelee;
    }

    protected String getName(){
        return (name);
    }

    protected int getApcost(){
        return (apcost);
    }

    protected int getDamage() {
        return (damage);
    }

    protected boolean isMelee() {
        return (melee);
    }

    public abstract void attack();
}
