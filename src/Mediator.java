public interface Mediator {
    void registerCharacter(Character character);
    void coordinateAttack(Character attacker, Character target);
    void move(Character mover, int x, int y);
}
