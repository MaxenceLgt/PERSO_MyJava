abstract class Unit implements Fighter {
    protected String name;
    protected int hp;
    protected int ap;
    protected Fighter targetCloseTo;

    protected Unit (String unitName, int unitHp, int unitAp) {
        name = unitName;
        hp = unitHp;
        ap = unitAp;
    }

    @Override public void receiveDamage(int nbDamage) {
        if (hp > 0)
            hp -= nbDamage;
    }

    @Override public Boolean moveCloseTo(Fighter fighter) {
        if (hp <= 0 || fighter == this || fighter == targetCloseTo)
            return (false);
        System.out.println(name + " is moving closer to " + fighter.getName());
        targetCloseTo = fighter;
        return true;
    }

    @Override public void recoverAP() {
        if (ap < 50 && hp > 0) {
            if (ap <= 43)
                ap += 7;
            else {
                ap = 50;
            }
        }
    }
}
