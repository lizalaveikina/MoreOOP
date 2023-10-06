import java.util.Random;

public class Character {
    protected int power;
    protected int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    private int generateRandomValue(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    public Character(int minPower, int maxPower, int minHp, int maxHp) {
        this.power = generateRandomValue(minPower, maxPower);
        this.hp = generateRandomValue(minHp, maxHp);
    }

    public void kick(Character c) {
        if (c.power < this.power) {
            c.damage(c.getHp());
        } 
        else {
            c.damage(1);
        }
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void damage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int newHp) {
        if (newHp >= 0) {
            this.hp = newHp;
        } 
        else {
            this.hp = 0;
        }
    }
    
}
