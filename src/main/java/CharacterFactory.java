import java.util.Random;

public class CharacterFactory {
    private Random random = new Random();

    public Character createCharacter() {
        int choose = random.nextInt(4);

        switch (choose) {
            case 0:
                return new Elf();
            case 1:
                return new Hobbit();
            case 2:
                return new King();
            case 3:
                return new Knight();
            default:
                return null;
        }
    }
}
