package Day03;

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
}
