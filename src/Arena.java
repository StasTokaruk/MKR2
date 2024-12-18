import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Character> characters = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        notifyObservers(character);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers(Character character) {
        for (Observer observer : observers) {
            observer.update(character);
        }
    }

    public void displayAllCharacters() {
        System.out.println("Персонажі на арені:");
        for (Character character : characters) {
            character.displayInfo();
        }
    }
}
