import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfTest {

    @Test
    @DisplayName("decrementLive() and Die")
    void decrementLiveAndDie() {
        Warrior attacker = new Warrior(100, 150, 2, 80);
        Elf elf = new Elf(100, 50, 1, 80);
        attacker.attack(elf);

        assertEquals(0, elf.getLives());
    }
}