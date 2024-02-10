import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Player {
    protected final static int NOT_ATTR_SET_DEFAULT = 22;
    private final int INITIAL_HEALTH;
    private int health;
    private int strength;
    private int lives;

    public Player(int health, int strength, int lives) {
        setHealth(health);
        setStrength(strength);
        setLives(lives);
        INITIAL_HEALTH = health;
    }


    private void decrementLive() {
        int actualLives = this.getLives()-1;

        if (actualLives < 1) {
            this.setLives(0);
            System.out.println("This character is dead");
        } else {
            this.setHealth(INITIAL_HEALTH);
            this.setLives(actualLives);
        }
    }

    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth()-this.getStrength());
        playerToAttack.checkHealth();
    }

    private void checkHealth() {
        if(this.getHealth() < 1) {
            this.decrementLive();
        }
    }
}
