public class ElektronikShop {

    public static void main(String[] args) {
        int[] tastaturen = {40, 35, 80, 10, 45};
        int[] usbLaufwerke = {20, 15, 40, 15};
        int budget = 30;

        int billigsteTastatur = findeBilligsteTastatur(tastaturen);
        int teuersterGegenstand = findeTeuerstenGegenstand(tastaturen, usbLaufwerke);
        int teuerstesUsbLaufwerk = findeTeuerstesUsbLaufwerk(usbLaufwerke, budget);
        int geldbetrag = findeGeldbetrag(tastaturen, usbLaufwerke, budget);

        System.out.println("Billigste Tastatur: " + billigsteTastatur);
        System.out.println("Teuerster Gegenstand: " + teuersterGegenstand);
        System.out.println("Teuerstes USB Laufwerk: " + teuerstesUsbLaufwerk);
        System.out.println("Geldbetrag, den Markus ausgeben wird: " + geldbetrag);
    }

    // Methode 1: Findet die billigste Tastatur
    public static int findeBilligsteTastatur(int[] tastaturen) {
        int billigsteTastatur = Integer.MAX_VALUE;
        for (int preis : tastaturen) {
            billigsteTastatur = Math.min(billigsteTastatur, preis);
        }
        return billigsteTastatur;
    }

    // Methode 2: Findet den teuersten Gegenstand
    public static int findeTeuerstenGegenstand(int[] tastaturen, int[] usbLaufwerke) {
        int teuersterGegenstand = Integer.MIN_VALUE;
        for (int preis : tastaturen) {
            teuersterGegenstand = Math.max(teuersterGegenstand, preis);
        }
        for (int preis : usbLaufwerke) {
            teuersterGegenstand = Math.max(teuersterGegenstand, preis);
        }
        return teuersterGegenstand;
    }

    // Methode 3: Findet das teuerste USB Laufwerk innerhalb des Budgets
    public static int findeTeuerstesUsbLaufwerk(int[] usbLaufwerke, int budget) {
        int teuerstesUsbLaufwerk = -1;
        for (int preis : usbLaufwerke) {
            if (preis <= budget) {
                teuerstesUsbLaufwerk = Math.max(teuerstesUsbLaufwerk, preis);
            }
        }
        return teuerstesUsbLaufwerk;
    }

    // Methode 4: Findet den Geldbetrag, den Markus ausgeben wird (-1, wenn er nicht genug für beide hat)
    public static int findeGeldbetrag(int[] tastaturen, int[] usbLaufwerke, int budget) {
        int billigsteTastatur = findeBilligsteTastatur(tastaturen);
        int teuerstesUsbLaufwerk = findeTeuerstesUsbLaufwerk(usbLaufwerke, budget);

        if (billigsteTastatur == Integer.MAX_VALUE || teuerstesUsbLaufwerk == -1) {
            return -1; // Markus kann nicht genug für beide Gegenstände ausgeben
        }

        return billigsteTastatur + teuerstesUsbLaufwerk;
    }
}
