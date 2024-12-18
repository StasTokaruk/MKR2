public class Mage implements Character {
    private String name;
    private int health = 100;
    private int attackPower = 40;
    private int[] position = new int[2];

    public Mage(String name, int x, int y) {
        this.name = name;
        this.position[0] = x;
        this.position[1] = y;
    }
    @Override
    public void setHealth(int health) {
        this.health = health;
    }
    @Override
    public String getName() { return name; }

    @Override
    public int getHealth() { return health; }

    @Override
    public int getAttackPower() { return attackPower; }

    @Override
    public int[] getPosition() { return position; }

    @Override
    public void setPosition(int x, int y) {
        position[0] = x;
        position[1] = y;
    }
    @Override
    public void displayPosition() {
        System.out.println("Координати: " + position[0] + ", " + position[1]);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " кидає заклинання на " + target.getName() + " на " + attackPower + " одиниць!");
        target.setHealth(getHealth()-attackPower);
    }
    @Override
    public void displayInfo() {
        System.out.println("Ім'я " + name + " Здоров'я " + health + " Сила атаки " + attackPower);
    }
}
