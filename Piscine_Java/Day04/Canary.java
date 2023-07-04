class Canary extends Animal{

    private int eggs = 0;
    protected Canary(String newName) {
        super(newName, 2, Type.BIRD);
        System.out.println("Yellow and smart? Here I am!");
    }

    public int getEggsCount() {
        return (eggs);
    }

    public void layEgg() {
        eggs++;
    }
}
