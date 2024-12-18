public class Main {
    public static void main(String[] args) {
        // Створення медіатора (Арена)
        Arena arena = new Arena();

        // Спостерігач
        Observer observer = new CharacterObserver();

        // Створення персонажів через фабрику
        Character warrior = CharacterFactory.createCharacter("warrior", "Борис");
        Character mage = CharacterFactory.createCharacter("mage", "Зіновій");
        Character archer = CharacterFactory.createCharacter("archer", "Лука");

        // Реєстрація персонажів на арені
        arena.registerCharacter(warrior);
        observer.update(warrior);

        arena.registerCharacter(mage);
        observer.update(mage);

        arena.registerCharacter(archer);
        observer.update(archer);

        // Координація атак
        arena.coordinateAttack(warrior, mage);
        arena.coordinateAttack(archer, warrior);
    }
}
