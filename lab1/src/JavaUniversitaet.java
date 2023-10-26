
import java.util.ArrayList;

public class JavaUniversitaet {

    public static void main(String[] args) {
        int[] noten = {84, 29, 91, 67, 53};

        int[] nichtAusreichendeNoten = filterNichtAusreichendeNoten(noten);
        double durchschnitt = berechneDurchschnittsNote(noten);
        int[] abgerundeteNoten = rundeNotenAb(noten);
        int maximaleAbgerundeteNote = findeMaximaleAbgerundeteNote(noten);

        System.out.print("Nicht ausreichende Noten: ");
        for (int note : nichtAusreichendeNoten) {
            System.out.print(note + " ");
        }
        System.out.println();

        System.out.println("Durchschnittswert: " + durchschnitt);

        System.out.print("Abgerundete Noten: ");
        for (int note : abgerundeteNoten) {
            System.out.print(note + " ");
        }
        System.out.println();

        System.out.println("Maximale abgerundete Note: " + maximaleAbgerundeteNote);
    }


    public static int[] filterNichtAusreichendeNoten(int[] noten) {
        ArrayList<Integer> nichtAusreichendeNoten = new ArrayList<>();
        for (int note : noten) {
            if (note < 40) {
                nichtAusreichendeNoten.add(note);
            }
        }

        return nichtAusreichendeNoten.stream().mapToInt(i -> i).toArray();
    }


    public static double berechneDurchschnittsNote(int[] noten) {
        int summe = 0;
        for (int note : noten) {
            summe += note;
        }
        return (double) summe / noten.length;
    }


    public static int[] rundeNotenAb(int[] noten) {
        int[] abgerundeteNoten = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] < 38) {
                abgerundeteNoten[i] = noten[i];
            } else {
                int remainder = noten[i] % 5;
                if (remainder >= 3) {
                    abgerundeteNoten[i] = noten[i] + (5 - remainder);
                } else {
                    abgerundeteNoten[i] = noten[i];
                }
            }
        }
        return abgerundeteNoten;
    }


    public static int findeMaximaleAbgerundeteNote(int[] noten) {
        int[] abgerundeteNoten = rundeNotenAb(noten);
        int maximum = abgerundeteNoten[0];
        for (int note : abgerundeteNoten) {
            if (note > maximum) {
                maximum = note;
            }
        }
        return maximum;
    }
}
