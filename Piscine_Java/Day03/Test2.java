import chocolate.*;
import planet.*;
import Day03.Astronaut;
import Day03.Team;
import planet.moon.Phobos;

public class Test2 {
    public static void main (String[] av) {
        Astronaut mutta = new Astronaut("Mutta");
        Astronaut hibito = new Astronaut("Hibito");
        Astronaut serika = new Astronaut ("Serika");
        Team spaceBro = new Team ("SpaceBrothers");

        spaceBro.add(mutta);
        spaceBro.add(hibito);
        spaceBro.add(serika);
        System.out.println(spaceBro.countMembers());
        planet.Mars titi = new planet.Mars("Hill");
        mutta.doActions(titi);
        spaceBro.showMembers();
        spaceBro.remove(hibito);
        System.out.println(spaceBro.countMembers());

        spaceBro.doActions();
        spaceBro.doActions(titi);
    }
}
