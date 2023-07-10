public class AssaultTerminator extends SpaceMarine {

    protected AssaultTerminator (String name){
        super(name, 150,30);
        System.out.println(name + " has teleported from space.");
        this.equip(new PowerFist());
    }

    @Override public void receiveDamage(int nbDamage) {
        if (nbDamage > 3) {
            super.receiveDamage(nbDamage - 3);
        } else {
            super.receiveDamage(1);
        }
    }
}
