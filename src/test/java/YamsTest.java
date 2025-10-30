import org.example.Yams;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YamsTest {

        @Test
        public void testBrelan() {
            int[] lancer = {2, 2, 2, 5, 6};
            assertEquals(28, Yams.CalculerPoints(lancer));
        }


        @Test

        public void testCarre() {
        int[] carre = {3, 3, 3, 3, 2};
        assertEquals(35, Yams.CalculerPoints(carre));

        }
}
