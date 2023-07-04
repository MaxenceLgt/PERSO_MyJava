class BlueShark extends Shark{

    protected BlueShark (String newName) {
        super(newName);
    }

    @Override public boolean canEat(Animal animalToEat) {
        if (animalToEat.getType() != "fish")
            return (false);
        return (true);
    }
}
