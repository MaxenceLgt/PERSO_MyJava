package ex_02;

public class Gecko {
    public String name;

    public Gecko() {
        name = "Unknown";
        System.out.println("Hello!");
    }

    public Gecko(String namePeople) {
        name = namePeople;
        System.out.println("Hello " + name + "!");
    }
}
