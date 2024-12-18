public class Main {
    public static void main(String[] args) {
        // Створення Арени
        Arena arena = new Arena();

        // Спостерігач
        Observer observer = new CharacterObserver();

        // Створення персонажів через фабрику
        Character warrior = CharacterFactory.createCharacter("warrior", "Борис", 0, 0);
        Character mage = CharacterFactory.createCharacter("mage", "Зіновій", 10, 10);
        Character archer = CharacterFactory.createCharacter("archer", "Робін", 20 , 20);

        // Реєстрація персонажів на арені
        arena.registerCharacter(warrior);
        observer.update(warrior);

        arena.registerCharacter(mage);
        observer.update(mage);

        arena.registerCharacter(archer);
        observer.update(archer);

        warrior.displayInfo();
        mage.displayInfo();
        archer.displayInfo();

        // Координація атак
        arena.coordinateAttack(warrior, mage);
        arena.coordinateAttack(archer, warrior);
        arena.coordinateAttack(mage, archer);

        //Переміщення персонажа
        warrior.displayPosition();
        arena.move(warrior,30,30);
        warrior.displayPosition();

        warrior.displayInfo();
        mage.displayInfo();
        archer.displayInfo();
    }
}
