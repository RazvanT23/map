import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ZahlenOperationTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = {8, -7, 0, 0, 0, 0, 0, 0, 0};
        ZahlenOperation.berechneSumme(zahl1, zahl2); // This should throw an IllegalArgumentException
    }


    @Test
    public void testBerechneSumme() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] expectedSum = {9, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] actualSum = ZahlenOperation.berechneSumme(zahl1, zahl2);
        assertArrayEquals(expectedSum, actualSum);
    }


    @Test
    public void testBerechneDifferenzWithBorrow() {
        int[] zahl1 = {1, 0, 0, 0};
        int[] zahl2 = {3, 0, 0, 0};
        int[] expectedDifferenz = {8, 0, 0, 0}; // 1000 - 3000 = -2000, add 10000 to get 8000
        int[] actualDifferenz = ZahlenOperation.berechneDifferenz(zahl1, zahl2);
        assertArrayEquals(expectedDifferenz, actualDifferenz);
    }

    @Test
    public void testBerechneDifferenzWithoutBorrow() {
        int[] zahl1 = {3, 0, 0, 0};
        int[] zahl2 = {1, 0, 0, 0};
        int[] expectedDifferenz = {2, 0, 0, 0}; // 3000 - 1000 = 2000
        int[] actualDifferenz = ZahlenOperation.berechneDifferenz(zahl1, zahl2);
        assertArrayEquals(expectedDifferenz, actualDifferenz);
    }

    @Test(expected = ArithmeticException.class)
    public void testBerechneMultiplikationWithOverflow() {
        int[] zahl = {9, 9, 9}; // Large number
        int factor = 2; // Factor causing overflow
        ZahlenOperation.berechneMultiplikation(zahl, factor); // This should throw an ArithmeticException
    }

    @Test
    public void testBerechneMultiplikationWithoutOverflow() {
        int[] zahl = {3, 2, 1}; // Number without overflow
        int factor = 2;
        int[] expectedMultiplikation = {6, 4, 2}; // 321 * 2 = 642
        int[] actualMultiplikation = ZahlenOperation.berechneMultiplikation(zahl, factor);
        assertArrayEquals(expectedMultiplikation, actualMultiplikation);
    }

}
