import chocolate.*;
import planet.*;
import Day03.Astronaut;
public class Test2 {
    public static void main (String[] av) {
        chocolate.Mars snack = new chocolate.Mars();
        planet.Mars rock = new planet.Mars("Viking 1");
        Astronaut hibito = new Astronaut("Hibito");
        Astronaut miyata = new Astronaut("Miyata");

        System.out.println(snack.getId());
        System.out.println(rock.getLandingSite());
        miyata.doActions(rock);
        System.out.println(miyata.getDestination());
        hibito.doActions();
        hibito.doActions(snack);
    }
}
