public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (c.power < this.power) {
            c.damage(c.hp);
        } 
        else {
            c.damage(1);
        }
    }

    @Override
    public String toString() {
        return "Elf{hp=" + hp + ", power=" + power + "}";
    }
}
