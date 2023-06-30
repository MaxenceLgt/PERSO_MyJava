package ex_05;

public class Gecko {
    String name;
    int age;

    public Gecko() {
        name = "Unknown";
        age = 0;
        System.out.println("Hello!");
    }

    public Gecko(String namePeople) {
        name = namePeople;
        System.out.println("Hello " + name + "!");
    }

    public Gecko(String namePeople, int agePeople) {
        name = namePeople;
        age = agePeople;
        System.out.println("Hello " + name + "!");
    }
    
    public String getName() {
        return (name);
    }

    public int getAge() {
        return (age);
    }

    public void setAge(int agePeople) {
        age = agePeople;
    }

    public void status() {

        switch (age) {
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1:
            case 2:
                System.out.println("Baby Gecko");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Adult Gecko");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");
        }
    }

    public void hello (String peopleName) {
        System.out.println("Hello " + peopleName + ", I'm " + name);
    }

    public void hello (int nbr) {
        for(int i = 0; i < nbr; i++)
            System.out.println("Hello, I'm " + name);
    }
}
