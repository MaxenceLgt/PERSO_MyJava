package chocolate;

public class Mars {
    private static int id = 0;
    private int instanceId = 0;

    public Mars() {
        instanceId = id;
        id++;
    }
    public int getId() {
        return (instanceId);
    }
}
