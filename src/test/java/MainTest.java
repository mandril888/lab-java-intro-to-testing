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

    @Test
    @DisplayName("test isJavaKeyword")
    public void isJavaKeyword() {
        assertFalse(Main.isJavaKeyword("I love to breakdance"));
        assertTrue(Main.isJavaKeyword("Don't break my heart"));
        assertFalse(Main.isJavaKeyword("Test my code"));
        assertTrue(Main.isJavaKeyword("Do it for all"));
    }
}