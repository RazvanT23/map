import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ElektronikShopTest {

    @Test
    public void testFindeBilligsteTastaturPositive() {
        int[] tastaturen = {40, 35, 80, 10, 45};
        int expectedBilligsteTastatur = 10; // Expected cheapest keyboard price
        int actualBilligsteTastatur = ElektronikShop.findeBilligsteTastatur(tastaturen);
        assertEquals(expectedBilligsteTastatur, actualBilligsteTastatur);
    }

    @Test
    public void testFindeBilligsteTastaturNegative() {
        int[] tastaturen = {40, 35, 80, 100, 45};
        int expectedBilligsteTastatur = -1; // Expected result for no affordable keyboard
        int actualBilligsteTastatur = ElektronikShop.findeBilligsteTastatur(tastaturen);
        assertEquals(expectedBilligsteTastatur, actualBilligsteTastatur);
    }

    @Test
    public void testFindeTeuerstenGegenstandPositive() {
        int[] tastaturen = {40, 35, 80, 10, 45};
        int[] usbLaufwerke = {20, 15, 40, 15};
        int expectedTeuersterGegenstand = 80; // Expected highest price among keyboards and USB drives
        int actualTeuersterGegenstand = ElektronikShop.findeTeuerstenGegenstand(tastaturen, usbLaufwerke);
        assertEquals(expectedTeuersterGegenstand, actualTeuersterGegenstand);
    }

    @Test
    public void testFindeTeuerstenGegenstandNegative() {
        int[] tastaturen = {40, 35, 30, 10, 45};
        int[] usbLaufwerke = {20, 15, 25, 15};
        int expectedTeuersterGegenstand = Integer.MIN_VALUE; // Expected result for no items
        int actualTeuersterGegenstand = ElektronikShop.findeTeuerstenGegenstand(tastaturen, usbLaufwerke);
        assertEquals(expectedTeuersterGegenstand, actualTeuersterGegenstand);
    }


    @Test
    public void testFindeTeuerstesUsbLaufwerkPositive() {
        int[] usbLaufwerke = {20, 15, 40, 15};
        int budget = 30;
        int expectedTeuerstesUsbLaufwerk = 15; // Expected highest price of USB drives within the budget
        int actualTeuerstesUsbLaufwerk = ElektronikShop.findeTeuerstesUsbLaufwerk(usbLaufwerke, budget);
        assertEquals(expectedTeuerstesUsbLaufwerk, actualTeuerstesUsbLaufwerk);
    }

    @Test
    public void testFindeTeuerstesUsbLaufwerkNegative() {
        int[] usbLaufwerke = {40, 50, 60, 70};
        int budget = 30;
        int expectedTeuerstesUsbLaufwerk = -1; // Expected result when no USB drives are within the budget
        int actualTeuerstesUsbLaufwerk = ElektronikShop.findeTeuerstesUsbLaufwerk(usbLaufwerke, budget);
        assertEquals(expectedTeuerstesUsbLaufwerk, actualTeuerstesUsbLaufwerk);
    }

    @Test
    public void testFindeGeldbetragPositive() {
        int[] tastaturen = {40, 35, 80, 10, 45};
        int[] usbLaufwerke = {20, 15, 40, 15};
        int budget = 30;
        int expectedGeldbetrag = 55; // Expected total cost of the cheapest keyboard and USB drive within budget
        int actualGeldbetrag = ElektronikShop.findeGeldbetrag(tastaturen, usbLaufwerke, budget);
        assertEquals(expectedGeldbetrag, actualGeldbetrag);
    }

    @Test
    public void testFindeGeldbetragNegative() {
        int[] tastaturen = {40, 50, 60, 70};
        int[] usbLaufwerke = {80, 90, 100};
        int budget = 30;
        int expectedGeldbetrag = -1; // Expected result when no combination of keyboard and USB drive is within budget
        int actualGeldbetrag = ElektronikShop.findeGeldbetrag(tastaturen, usbLaufwerke, budget);
        assertEquals(expectedGeldbetrag, actualGeldbetrag);
    }
}



