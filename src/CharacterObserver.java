public class CharacterObserver implements Observer {
    @Override
    public void update(Character character) {
        System.out.println("Спостерігач: на арені з'явився персонаж " + character.getName());
    }
}
