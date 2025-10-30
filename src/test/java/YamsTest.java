import org.example.Yams;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

         @Test
         public void testFull() {
        int[] full = {2, 2, 2, 3, 3};
        assertEquals(30, Yams.CalculerPoints(full));
         }

    @Test
    public void testGrandeSuite() {
        int[] suite1 = {1, 2, 3, 4, 5};
        int[] suite2 = {2, 3, 4, 5, 6};
        int[] nonSuite = {1, 3, 4, 5, 6};

        assertEquals(40, Yams.CalculerPoints(suite1));
        assertEquals(40, Yams.CalculerPoints(suite2));
        assertNotEquals(40, Yams.CalculerPoints(nonSuite));
    }






}
