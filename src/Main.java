public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena();

        // Створення спостерігачів
        Player player1 = new Player("Гравець 1");
        Player player2 = new Player("Гравець 2");

        arena.addObserver(player1);
        arena.addObserver(player2);

        // Створення персонажів через фабрику
        Character warrior = CharacterFactory.createCharacter("воїн", "Артур", 10, 20);
        Character mage = CharacterFactory.createCharacter("маг", "Мерлін", 15, 25);
        Character archer = CharacterFactory.createCharacter("лучник", "Робін", 30, 40);

        // Додавання персонажів на арену
        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        // Виведення всіх персонажів
        arena.displayAllCharacters();
    }
}
