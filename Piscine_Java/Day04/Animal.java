package Day04;
public class Animal {

    private String name;
    private int legs;
    private Type type;

    private static int numberOfAnimals = 0;
    private static int numberOfMammals = 0;
    private static int numberOfBirds = 0;
    private static int numberOfFish = 0;
    protected enum Type {
        MAMMAL,
        FISH,
        BIRD,
    }

    protected Animal(String animalName, int numberLegs, Type animalType) {
        name = animalName;
        legs = numberLegs;
        type = animalType;
        System.out.println("My name is " + name + " and I am a " + getType() + "!");
        numberOfAnimals++;
        if (getType() == "mammal")
            numberOfMammals++;
        else if (getType() == "birds")
            numberOfBirds++;
        else if (getType() == "fish")
            numberOfFish++;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getLegs() {
        return legs;
    }

    public String getType() {
        if (type.equals(Type.MAMMAL))
            return ("mammal");
        else if (type.equals(Type.BIRD))
            return ("bird");
        else if (type.equals(Type.FISH))
            return ("fish");
        return (null);
    }

    public void setType(Type newType) {
        type = newType;
    }

    public int getNumberOfAnimals() {
        if (numberOfAnimals == 1 || numberOfAnimals == 0)
            System.out.println("There is currently " + numberOfAnimals + " animal in our world.");
        else
            System.out.println("There are currently " + numberOfAnimals + " animals in our world.");
        return (numberOfAnimals);
    }

    public int getNumberOfMammals() {
        if (numberOfMammals == 1 || numberOfMammals == 0)
            System.out.println("There is currently " + numberOfMammals + " mammal in our world .");
        else
            System.out.println("There are currently " + numberOfMammals + " mammals in our world .");
        return (numberOfMammals);
    }

    public int getNumberOfBirds() {
        if (numberOfBirds == 1 || numberOfBirds == 0)
            System.out.println("There is currently " + numberOfBirds + " bird in our world .");
        else
            System.out.println("There are currently " + numberOfBirds + " birds in our world .");
        return (numberOfBirds);
    }

    public int getNumberOfFish() {
        if (numberOfFish == 1 || numberOfFish == 0)
            System.out.println("There is currently " + numberOfFish + " fish in our world .");
        else
            System.out.println("There are currently " + numberOfFish + " fish in our world .");
        return (numberOfFish);
    }
}
