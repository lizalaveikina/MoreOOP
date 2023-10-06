public class Knight extends Character {
    public Knight() {
        super(2, 12, 2, 12);
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < this.power) {
            c.damage(c.getHp());
        } 
        else {
            c.damage(1);
        }
    }

    @Override
    public String toString() {
        return "Knight{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
