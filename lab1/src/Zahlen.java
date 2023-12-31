
import java.util.Arrays;

public class Zahlen {

    public static void main(String[] args) {
        int[] zahlen = {4, 8, 3, 10, 17};

        int maximaleZahl = findeMaximaleZahl(zahlen);
        int minimaleZahl = findeMinimaleZahl(zahlen);
        int maximaleSumme = findeMaximaleSumme(nMinusEinsSumme(zahlen));
        int minimaleSumme = findeMinimaleSumme(nMinusEinsSumme(zahlen));

        System.out.println("Maximale Zahl: " + maximaleZahl);
        System.out.println("Minimale Zahl: " + minimaleZahl);
        System.out.println("Maximale Summe von n-1 Zahlen: " + maximaleSumme);
        System.out.println("Minimale Summe von n-1 Zahlen: " + minimaleSumme);
    }


    public static int findeMaximaleZahl(int[] zahlen) {
        int maximum = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl > maximum) {
                maximum = zahl;
            }
        }
        return maximum;
    }


    public static int findeMinimaleZahl(int[] zahlen) {
        int minimum = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl < minimum) {
                minimum = zahl;
            }
        }
        return minimum;
    }


    public static int findeMaximaleSumme(int[] zahlen) {
        int summe = 0;
        Arrays.sort(zahlen);
        for (int i = 0; i < zahlen.length - 1; i++) {
            summe += zahlen[i];
        }
        return summe;
    }


    public static int findeMinimaleSumme(int[] zahlen) {
        int summe = 0;
        Arrays.sort(zahlen);
        for (int i = 1; i < zahlen.length; i++) {
            summe += zahlen[i];
        }
        return summe;
    }


    public static int[] nMinusEinsSumme(int[] zahlen) {
        int[] nMinusEinsArray = new int[zahlen.length - 1];
        for (int i = 0, j = 0; i < zahlen.length; i++) {
            if (i != j) {
                nMinusEinsArray[j] = zahlen[i];
                j++;
            }
        }
        return nMinusEinsArray;
    }
}
