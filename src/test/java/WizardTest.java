import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    @Test
    @DisplayName("convertToElf()")
    void convertToElf() {
        Wizard wizard = new Wizard(100, 150, 2, 80);
        Elf newElf = wizard.convertToElf();
        Elf elf = new Elf(100, 150, 2, 80);

        assertEquals(elf.getHealth(), newElf.getHealth());
        assertEquals(Player.NOT_ATTR_SET_DEFAULT, newElf.getSpeed());
    }
}