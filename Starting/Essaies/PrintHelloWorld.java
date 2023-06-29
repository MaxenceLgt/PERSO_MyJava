public class PrintHelloWorld {
    public static void main (String[] av){
        String name = "Hey";
        AddExclamation classObj = new AddExclamation();
        classObj.addExclamation(name);
        addInterogation(name);
    }

    public static void addInterogation(String str) {
        System.out.println(str + "?");
    }
}