import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wizard extends Player {
    private int spell;

    public Wizard(int health, int strength, int lives, int spell) {
        super(health, strength, lives);
        setSpell(spell);
    }

    public Elf convertToElf() {
        return new Elf(this.getHealth(), this.getStrength(), this.getLives(), NOT_ATTR_SET_DEFAULT);
    }
}
