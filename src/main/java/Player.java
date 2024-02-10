import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Player {
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
            System.out.println("This character is dead");
        } else {
            this.setHealth(INITIAL_HEALTH);
            this.setLives(actualLives);
        }
    }

    private void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth()-this.getStrength());
    }

    private void checkHealth() {
        if(this.getHealth() < 1) {
            this.decrementLive();
        }
    }
}
