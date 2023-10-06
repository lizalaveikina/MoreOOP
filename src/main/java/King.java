public class King extends Character {
    public King() {
        super(5, 15, 5, 15);
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
        return "King{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}

