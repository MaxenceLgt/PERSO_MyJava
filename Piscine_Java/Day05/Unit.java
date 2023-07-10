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

    @Override public String getName() {
        return name;
    }

    @Override public int getAp() {
        return ap;
    }

    @Override public int getHp() {
        return hp;
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
        if (hp > 0) {
            ap += 7;
            if (ap > 50) {
                ap = 50;
            }
        }
    }
}
