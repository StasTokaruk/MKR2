public class Mage extends Character {
    public Mage(String name, int x, int y) {
        super(name, 100, 40, x, y);
    }

    @Override
    public void displayInfo() {
        System.out.println("Маг: " + name + " Здоров'я: " + health + ", Атака: " + attackPower + ", Координати:"+ x + " " + y);
    }
}
