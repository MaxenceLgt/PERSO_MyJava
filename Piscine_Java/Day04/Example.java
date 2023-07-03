package Day04;
import Day04.Animal;

public class Example {
    public static void main ( String [] args ) {
        Animal isidore = new Animal("Isidore", 4, Animal.Type.MAMMAL);
        System.out.println(isidore.getName() + " has " + isidore.getLegs() + " legs and is a " + isidore.getType() + ".");
    }
}
