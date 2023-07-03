package Day04;
public class Animal {

    private String name;
    private int legs;
    private Type type;
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
}
