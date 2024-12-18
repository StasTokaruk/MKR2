public class Player implements Observer {
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void update(Character character) {
        System.out.println(playerName + ", новий персонаж доданий на арену: " + character.name);
    }
}
