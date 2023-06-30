package ex_03;

public class Gecko {
    String name;

    public Gecko() {
        name = "Unknown";
        System.out.println("Hello!");
    }

    public Gecko(String namePeople) {
        name = namePeople;
        System.out.println("Hello " + name + "!");
    }
    
    public String getName() {
        return (name);
    }
}
