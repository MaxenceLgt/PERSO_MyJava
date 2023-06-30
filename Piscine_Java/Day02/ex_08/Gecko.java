package ex_08;

public class Gecko {
    String name;
    int age;
    int energy = 100;

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

    public int getEnergy() {
        return (energy);
    }

    public void setEnergy(int nbr) {
        if (nbr >= 0 && nbr <= 100)
            energy = nbr;
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

    public void eat (String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Yummy!");
            if (energy <= 90)
                energy += 10;
        } else if (food.equalsIgnoreCase("Vegetable")) {
            System.out.println("Erk!");
            if (energy >= 10)
                energy -= 10;
        } else
            System.out.println("I can't eat this!");
    }

    public void work (){
        if (energy >= 25){
            System.out.println("I'm working T.T");
            energy -= 9;
        } else {
            System.out.println("Heyyy I'm too sleepy, better take a nap !");
            energy += 50;
        }
    }

    public void fraternize(Object animal){
        if (animal instanceof Snake) {
            if (energy >= 10) {
                System.out.println("LET'S RUN AWAY !!!");
                energy = 0;
            } else {
                System.out.println("...");
            }
        } else if (animal instanceof Gecko) {
            if (((Gecko) animal).getEnergy() >= 30 && energy >= 30)
                goingDrink(((Gecko)animal));
            else if (((Gecko) animal).getEnergy() >= 30 && energy < 30)
                tooTired(((Gecko) animal).getName());
            else if (((Gecko) animal).energy < 30 && energy >= 30)
                tooTired(name);
            else
                notToday();
        }
    }

    public static void notToday() {
        System.out.println("Not today!");
        System.out.println("Not today!");
    }

    public static void tooTired(String tiredOne) {
        System.out.println("Sorry " + tiredOne + ", I'm too tired to go out tonight");
        System.out.println("Oh ! That's too bad, another time then !");
    }

    public void goingDrink (Gecko friend) {
        System.out.println("I'm going to drink with " + friend.getName());
        System.out.println("I'm going to drink with " + name);
        friend.setEnergy(friend.getEnergy() - 30);
        energy -= 30;
    }
}
