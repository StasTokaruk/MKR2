public interface Character {
    String getName();
    int getHealth();
    int getAttackPower();
    int[] getPosition();
    void setPosition(int x, int y);
    void attack(Character target);
}
