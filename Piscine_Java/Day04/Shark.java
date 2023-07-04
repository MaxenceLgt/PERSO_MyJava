class Shark extends Animal {

    boolean frenzy = false;
    protected Shark(String newName) {
        super (newName, 0, Type.FISH);
        System.out.println("A KILLER IS BORN!");
    }

    public void smellBlood(boolean newFrenzy) {
        frenzy = newFrenzy;
    }

    public void status() {
        if (frenzy == true)
            System.out.println(getName() + " is smelling blood and wants to kill.");
        else
            System.out.println(getName() + " is swimming peacefully.");
    }

    public boolean canEat(Animal animalToEat) {
        if (animalToEat == this)
            return (false);
        return (true);
    }

    public void eat(Animal animalToEat) {
        if (canEat(animalToEat) == true) {
            System.out.println(getName() + " ate a " + animalToEat.getType() + " named " + animalToEat.getName() + ".");
            if (frenzy == true)
                smellBlood(false);
        } else
            System.out.println(getName() + ": It's not worth my time.");
    }
}
