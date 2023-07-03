package planet;

public class Mars {
    private static int id = 0;
    private int instanceId = 0;
    private String landingSite = null;

    public Mars(String landing) {
        instanceId = id;
        landingSite = landing;
        id++;
    }
    public int getId() {
        return (instanceId);
    }
    public String getLandingSite() {
        return (landingSite);
    }
}
