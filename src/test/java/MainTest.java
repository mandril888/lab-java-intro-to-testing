import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    @DisplayName("test pass_num_and_generate_arrOdds")
    public void pass_num_and_generate_arrOdds() {
        assertArrayEquals(new int[]{1}, Main.arrOdds(1));
        assertArrayEquals(new int[]{1}, Main.arrOdds(2));
        assertArrayEquals(new int[]{1, 3, 5}, Main.arrOdds(5));
        assertArrayEquals(new int[]{1, 3, 5}, Main.arrOdds(6));
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, Main.arrOdds(9));
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, Main.arrOdds(10));
    }
}