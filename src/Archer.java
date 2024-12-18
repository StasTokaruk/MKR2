public class Archer extends Character {
    public Archer(String name, int x, int y) {
        super(name, 120, 30, x, y);
    }

    @Override
    public void displayInfo() {
        System.out.println("Лучник: " + name + " Здоров'я: " + health + ", Атака: " + attackPower + ", Координати:"+ x + " " + y);
    }
}
