public interface Fighter {
    public Boolean equip(Weapon newWeapon);
    public Boolean attack(Fighter fighter);
    public void receiveDamage(int nbDamage);
    public Boolean moveCloseTo(Fighter fighter);
    public void recoverAP();
    public String getName();
    public int getAp();
    public int getHp();
}
