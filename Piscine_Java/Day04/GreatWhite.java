class GreatWhite extends Shark {
    protected GreatWhite (String newName) {
        super(newName);
    }

    @Override public boolean canEat(Animal animalToEat) {
        if (animalToEat instanceof Canary) {
            System.out.println(getName() + ": Next time you try to give me that to eat, I'll eat you instead.");
            return (false);
        }
        if (animalToEat instanceof Shark)
            System.out.println(getName() + ": The best meal one could wish for.");
        return (true);
    }
}
