public class Archer implements Character {
    private String name;
    private int health = 120;
    private int attackPower = 30;
    private int[] position = new int[2];

    public Archer(String name) {
        this.name = name;
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
    public void attack(Character target) {
        System.out.println(name + " стріляє у " + target.getName() + " на " + attackPower + " одиниць!");
    }
}
