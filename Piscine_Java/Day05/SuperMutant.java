public class SuperMutant extends Monster {

    private static int id = 1;

    protected SuperMutant () {
        super("SuperMutant", 170, 20);
        this.name += (" #" + id);
        id++;
        System.out.println(getName() + ": Roaarrr!");
    }

    @Override public Boolean attack(Fighter fighter) {
        this.damage = 60;
        this.apcost = 20;
        return super.attack(fighter);
    }

    @Override public void recoverAP() {
        if (hp < 160 && hp > 0) {
            hp += 10;
        } else if (hp > 160 && hp > 0) {
            hp = 170;
        }
        super.recoverAP();
    }
}
