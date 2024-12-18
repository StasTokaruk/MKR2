public class Warrior extends Character {
    public Warrior(String name, int x, int y) {
        super(name, 150, 20, x, y);
    }

    @Override
    public void displayInfo() {
        System.out.println("Воїн: " + name + " Здоров'я: " + health + ", Атака: " + attackPower + ", Координати:"+ x + " " + y);
    }
}
