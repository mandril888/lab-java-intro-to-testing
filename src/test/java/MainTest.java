import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    private Main main;

    @BeforeEach
    public void setUp() {
        main = new Main();
    }

    @Test
    @DisplayName("test pass_num_and_generate_arrOdds")
    public void pass_num_and_generate_arrOdds() {
        assertArrayEquals(new int[]{1}, main.arrOdds(1));
        assertArrayEquals(new int[]{1}, main.arrOdds(2));
        assertArrayEquals(new int[]{1, 3, 5}, main.arrOdds(5));
        assertArrayEquals(new int[]{1, 3, 5}, main.arrOdds(6));
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, main.arrOdds(9));
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, main.arrOdds(10));
    }
}