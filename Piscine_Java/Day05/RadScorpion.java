public class RadScorpion extends Monster {
    
    protected static int id = 1;

    protected RadScorpion () {
        super("RadScorpion", 80, 50);
        this.name += (" #" + id);
        id++;
        System.out.println(getName() + ": Crrr!");
    }

    public int getId() {
        return (id);
    }

    @Override public Boolean attack(Fighter fighter) {
        if (fighter instanceof AssaultTerminator) {
            this.damage = 25;
        } else {
            this.damage = 50;
        }
        this.apcost = 8;
        return super.attack(fighter);
    }
}
