import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Warrior extends Player {
    private int force;

    public Warrior(int health, int strength, int lives, int force) {
        super(health, strength, lives);
        setForce(force);
    }

    public Elf convertToElf() {
        return new Elf(this.getHealth(), this.getStrength(), this.getLives(), NOT_ATTR_SET_DEFAULT);
    }
}
