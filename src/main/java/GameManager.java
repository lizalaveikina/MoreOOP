public class GameManager {

    public void fight(Character c1, Character c2) {

        System.out.println("Fighting " + c1.getClass().getSimpleName() + " – {Power: " + c1.getPower() + " , HP: " + c1.getHp() + "} and " +
                c2.getClass().getSimpleName() + " – {Power: " + c2.getPower() + ", HP: " + c2.getHp() + "}");

        while (c1.isAlive() && c2.isAlive()) {
            
            c1.kick(c2);
            c2.kick(c1);

            System.out.println(c1.getClass().getSimpleName() + " fight – result: " + getStatus(c1) +
                "\n" + c2.getClass().getSimpleName() + " fight – result: " + getStatus(c2));
        }

        System.out.println((c1.isAlive() ? c1.getClass().getSimpleName() + " wins!" : c2.getClass().getSimpleName() + " wins!"));
    }

    private String getStatus(Character c) {
        return "HP: " + c.getHp() + ", Power: " + c.getPower();
    }
}
