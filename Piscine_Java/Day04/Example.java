public class Example {
    public static void main ( String [] args ) {
        Canary titi = new Canary("Titi");
        Shark willy = new Shark ("Willy"); // Yes Willy is a shark here !
        GreatWhite baba = new GreatWhite("Baba");

        willy.status();
        willy.smellBlood(true);
        willy.status();
        titi.layEgg();
        System.out.println(titi.getEggsCount());
        willy.eat(titi);
        willy.eat(willy);
        baba.eat(willy);
    }
}
