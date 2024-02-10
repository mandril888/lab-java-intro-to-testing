import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Elf extends Player {
    private int speed;
    public Elf(int health, int strength, int lives, int speed) {
        super(health, strength, lives);
        setSpeed(speed);
    }
}
