import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    @DisplayName("decrementLive() by Health")
    void decrementLiveByHelath() {
        Warrior attacker = new Warrior(100, 150, 2, 80);
        Warrior warrior = new Warrior(100, 50, 2, 80);
        attacker.attack(warrior);

        assertEquals(1, warrior.getLives());
        assertNotEquals(2, warrior.getLives());
    }
}