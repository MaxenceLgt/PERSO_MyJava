public class Example04 {
    public static void main(String[] av) {
        Warrior warrior = new Warrior("Jean-Luc");
        Mage mage = new Mage("Robert");

        warrior.moveRight();
        warrior.moveLeft();
        warrior.moveBack();
        warrior.moveForward();
        mage.moveRight();
        mage.moveLeft();
        mage.moveBack();
        mage.moveForward();
    }
}
