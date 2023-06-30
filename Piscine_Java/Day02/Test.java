import ex_08.Gecko;
import ex_08.Snake;

public class Test {
    public static void main (String[] av) {
            Gecko mimi = new Gecko("mimi");
            Gecko mama = new Gecko("mama");
            Snake mumu = new Snake();

            mimi.fraternize(mama);
            mimi.setEnergy(29);
            mimi.fraternize(mama);
            mama.setEnergy(29);
            mimi.fraternize(mama);
            mimi.fraternize(mumu);
            mimi.fraternize(mumu);
    }
}
