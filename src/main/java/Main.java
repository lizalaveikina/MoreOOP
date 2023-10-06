public class Main {
    public static void main(String[] args) {
        GameManager manager = new GameManager();
        CharacterFactory character = new CharacterFactory();

        Character c1 = character.createCharacter();
        Character c2 = character.createCharacter();

        manager.fight(c1, c2);
    }
}

