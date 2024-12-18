import java.util.ArrayList;
import java.util.List;

public class Arena implements Mediator {
    private List<Character> characters = new ArrayList<>();

    @Override
    public void registerCharacter(Character character) {
        characters.add(character);
        System.out.println(character.getName() + " приєднався до арени.");
    }

    @Override
    public void coordinateAttack(Character attacker, Character target) {
        System.out.println("Атака на арені:");
        attacker.attack(target);
    }

    @Override
    public void move(Character mover, int x, int y) {
        System.out.println("Переміщення на арені " + mover.getName() + " на координати " + x + " " + y);
        mover.setPosition(x, y);
    }
}
