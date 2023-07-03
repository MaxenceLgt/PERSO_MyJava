package planet.moon;
import planet.Mars;
public class Phobos {
    private planet.Mars mars = null;
    private String landingSite = null;

    public Phobos (Object newMars, String landing) {
        if (newMars instanceof planet.Mars) {
            System.out.println("Phobos placed in orbit.");
            landingSite = landing;
            mars = ((planet.Mars) newMars);
        } else {
            System.out.println("No planet given.");
        }
    }

    public planet.Mars getMars() {
        return mars;
    }

    public String getLandingSite() {
        return landingSite;
    }
}
