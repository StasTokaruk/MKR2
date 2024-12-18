public interface Character {
    String getName();
    int getHealth();
    int getAttackPower();
    int[] getPosition();
    void displayInfo();
    void displayPosition();
    void setPosition(int x, int y);
    void setHealth(int health);
    void attack(Character target);
}
