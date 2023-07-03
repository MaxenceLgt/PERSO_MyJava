import chocolate.*;
import planet.*;
import Day03.Astronaut;
public class Test2 {
    public static void main (String[] av) {
        planet.Mars titi = new planet.Mars ("Here and there");
        planet.Mars toto = new planet.Mars ("Up");
        planet.moon.Phobos phobos1 = new planet.moon.Phobos(titi,"Alpha 3");

        new planet.moon.Phobos(toto, "Beta 1");
        System.out.println(phobos1.getLandingSite());
    }
}
