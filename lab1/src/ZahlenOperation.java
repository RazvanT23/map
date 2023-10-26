public class ZahlenOperation {

    public static void main(String[] args) {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] summe = berechneSumme(zahl1, zahl2);
        int[] differenz = berechneDifferenz(zahl1, zahl2);
        int[] multiplikation = berechneMultiplikation(zahl1, 2);
        int[] division = berechneGanzzahligeDivision(zahl1, 2);

        System.out.print("Summe: ");
        printArray(summe);
        System.out.print("Differenz: ");
        printArray(differenz);
        System.out.print("Multiplikation: ");
        printArray(multiplikation);
        System.out.print("Ganzzahlige Division: ");
        printArray(division);
    }


    public static int[] berechneSumme(int[] zahl1, int[] zahl2) {
        int carry = 0;
        int[] summe = new int[zahl1.length];
        for (int i = zahl1.length - 1; i >= 0; i--) {
            int digitSum = zahl1[i] + zahl2[i] + carry;
            summe[i] = digitSum % 10;
            carry = digitSum / 10;
        }
        return summe;
    }


    public static int[] berechneDifferenz(int[] zahl1, int[] zahl2) {
        int borrow = 0;
        int[] differenz = new int[zahl1.length];
        for (int i = zahl1.length - 1; i >= 0; i--) {
            int digitDiff = zahl1[i] - zahl2[i] - borrow;
            if (digitDiff < 0) {
                digitDiff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            differenz[i] = digitDiff;
        }
        return differenz;
    }


    public static int[] berechneMultiplikation(int[] zahl, int factor) {
        int carry = 0;
        int[] multiplikation = new int[zahl.length];
        for (int i = zahl.length - 1; i >= 0; i--) {
            int digitProduct = zahl[i] * factor + carry;
            multiplikation[i] = digitProduct % 10;
            carry = digitProduct / 10;
        }
        return multiplikation;
    }


    public static int[] berechneGanzzahligeDivision(int[] zahl, int divisor) {
        int[] division = new int[zahl.length];
        int remainder = 0;
        for (int i = 0; i < zahl.length; i++) {
            int dividend = remainder * 10 + zahl[i];
            division[i] = dividend / divisor;
            remainder = dividend % divisor;
        }
        return division;
    }


    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num);
        }
        System.out.println();
    }
}
