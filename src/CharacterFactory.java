public class CharacterFactory {
    public static Character createCharacter(String type, String name, int x, int y) {
        switch (type.toLowerCase()) {
            case "warrior": return new Warrior(name, x, y);
            case "mage": return new Mage(name, x, y);
            case "archer": return new Archer(name, x ,y);
            default: throw new IllegalArgumentException("Невідомий тип персонажа");
        }
    }
}
