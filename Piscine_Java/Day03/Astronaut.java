package Day03;

import planet.Mars;

public class Astronaut {
    private String name = "";
    private int snacks = 0;
    private String destination = null;
    private int id = 0;
    private static int numberId = 0;

    public Astronaut (String newName) {
        name = newName;
        id = numberId;
        System.out.println(name + " ready for launch!");
        numberId++;
    }

    public int getId() {
        return (id);
    }

    public String getName() {
        return (name);
    }

    public String getDestination() {
        return (destination);
    }

    public int getSnacks() {
        return snacks;
    }

    public void doActions() {
        System.out.println(name + ": Nothing to do.");
        if (destination == null)
            System.out.println(name + ": I may have done nothing, but I have " + snacks + " Mars to eat at least !");
    }

    public void doActions(Object marsObject) {
        if (marsObject instanceof planet.Mars) {
            System.out.println(name + ": Started a mission");
            destination = ((planet.Mars) marsObject).getLandingSite();
        } else if (marsObject instanceof  chocolate.Mars) {
            System.out.println(name + ": Thanks for this mars number " + ((chocolate.Mars) marsObject).getId());
            snacks += 1;
        } else if (marsObject instanceof planet.moon.Phobos) {
            System.out.println(name + ": Started a mission");
            destination = ((planet.moon.Phobos) marsObject).getLandingSite();
        }
        if (destination == null)
            System.out.println(name + ": I may have done nothing, but I have " + snacks + " Mars to eat at least !");
    }
}
