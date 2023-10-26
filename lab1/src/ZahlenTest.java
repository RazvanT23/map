import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ZahlenTest {

    @Test
    public void testFindeMaximaleZahl() {
        int[] zahlen = {4, 8, 3, 10, 17};
        int expectedMaximum = 17;
        int actualMaximum = Zahlen.findeMaximaleZahl(zahlen);
        assertEquals(expectedMaximum, actualMaximum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindeMaximaleZahlWithEmptyArray() {
        int[] zahlen = {};
        Zahlen.findeMaximaleZahl(zahlen); // This should throw an IllegalArgumentException
    }

    @Test
    public void testFindeMinimaleZahl() {
        int[] zahlen = {4, 8, 3, 10, 17};
        int expectedMinimum = 3;
        int actualMinimum = Zahlen.findeMinimaleZahl(zahlen);
        assertEquals(expectedMinimum, actualMinimum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindeMinimaleZahlWithEmptyArray() {
        int[] zahlen = {};
        Zahlen.findeMinimaleZahl(zahlen); // This should throw an IllegalArgumentException
    }

    @Test
    public void testFindeMaximaleSumme() {
        int[] zahlen = {4, 8, 3, 10, 17};
        int expectedSum = 25; // Sum of n-1 numbers: 4 + 8 + 3 + 10 = 25
        int actualSum = Zahlen.findeMaximaleSumme(zahlen);
        assertEquals(expectedSum, actualSum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindeMaximaleSummeWithLessThanTwoElements() {
        int[] zahlen = {5}; // Array with only one element, which is less than two
        Zahlen.findeMaximaleSumme(zahlen); // This should throw an IllegalArgumentException
    }

    @Test
    public void testFindeMinimaleSumme() {
        int[] zahlen = {4, 8, 3, 10, 17};
        int expectedSum = 25; // Sum of n-1 numbers: 8 + 3 + 10 + 17 = 38
        int actualSum = Zahlen.findeMinimaleSumme(zahlen);
        assertEquals(expectedSum, actualSum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindeMinimaleSummeWithLessThanTwoElements() {
        int[] zahlen = {5}; // Array with only one element, which is less than two
        Zahlen.findeMinimaleSumme(zahlen); // This should throw an IllegalArgumentException
    }

}


