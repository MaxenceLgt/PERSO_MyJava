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
}
