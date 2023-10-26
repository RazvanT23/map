import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
public class JavaUniversitaetTest {

    @Test
    public void testFilterNichtAusreichendeNoten() {
        int[] noten = {84, 29, 91, 67, 53};
        int[] expectedFilteredNoten = {29}; // Expected non-satisfactory grade(s)
        int[] actualFilteredNoten = JavaUniversitaet.filterNichtAusreichendeNoten(noten);
        assertArrayEquals(expectedFilteredNoten, actualFilteredNoten);
    }

    @Test
    public void testFilterNichtAusreichendeNotenNoNonSatisfactoryGrades() {
        int[] noten = {84, 41, 91, 67, 53}; // All grades are satisfactory
        int[] expectedFilteredNoten = {}; // Expected empty array (no non-satisfactory grades)
        int[] actualFilteredNoten = JavaUniversitaet.filterNichtAusreichendeNoten(noten);
        assertArrayEquals(expectedFilteredNoten, actualFilteredNoten);
    }

    @Test
    public void testBerechneDurchschnittsNote() {
        int[] noten = {84, 29, 91, 67, 53};
        double expectedAverage = (84 + 29 + 91 + 67 + 53) / 5.0; // Expected average grade
        double actualAverage = JavaUniversitaet.berechneDurchschnittsNote(noten);
        assertEquals(expectedAverage, actualAverage, 0.001); // Delta of 0.001 for double comparison
    }

    @Test(expected = ArithmeticException.class)
    public void testBerechneDurchschnittsNoteEmptyArray() {
        int[] noten = {}; // Empty array
        JavaUniversitaet.berechneDurchschnittsNote(noten); // This should throw an ArithmeticException
    }


    @Test
    public void testRundeNotenAb() {
        int[] noten = {37, 42, 45, 50, 53};
        int[] expectedRoundedGrades = {37, 42, 45, 50, 55}; // Expected rounded grades
        int[] actualRoundedGrades = JavaUniversitaet.rundeNotenAb(noten);
        assertArrayEquals(expectedRoundedGrades, actualRoundedGrades);
    }

    @Test
    public void testFindeMaximaleAbgerundeteNote() {
        int[] noten = {37, 42, 45, 50, 53};
        int expectedMaximumRoundedGrade = 55; // Expected maximum rounded grade
        int actualMaximumRoundedGrade = JavaUniversitaet.findeMaximaleAbgerundeteNote(noten);
        assertEquals(expectedMaximumRoundedGrade, actualMaximumRoundedGrade);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRundeNotenAbEmptyArray() {
        int[] noten = {}; // Empty array
        JavaUniversitaet.rundeNotenAb(noten); // This should throw an IllegalArgumentException
    }
}
