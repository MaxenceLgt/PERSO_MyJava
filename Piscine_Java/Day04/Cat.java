class Cat extends Animal {

    private String color = "grey";
    protected Cat(String animalName) {
        super(animalName, 4, Type.MAMMAL);
        System.out.println(getName() + ": MEEEOOWWWW");
    }

    protected Cat(String animalName, String newColor) {
        super(animalName, 4, Type.MAMMAL);
        System.out.println(getName() + ": MEEEOOWWWW");
        color = newColor;
    }

    public void meow() {
        System.out.println(getName() + " the " + color + " kitty is meowing.");
    }
}
