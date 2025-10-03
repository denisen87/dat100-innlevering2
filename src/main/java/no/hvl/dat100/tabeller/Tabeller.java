package no.hvl.dat100.tabeller;

public class Tabeller {

    // a) Skriv ut tabellen
    public static void skrivUt(int[] tabell) {
        System.out.print("[");
        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i]);
            if (i < tabell.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }

    // b) Konverter tabellen til streng
    public static String tilStreng(int[] tabell) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tabell.length; i++) {
            sb.append(tabell[i]);
            if (i < tabell.length - 1) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

    // c) Summer tabellen
    public static int summer(int[] tabell) {
        int sum = 0;
        for (int t : tabell) sum += t;
        return sum;
    }

    // d) Sjekk om tallet finnes i tabellen
    public static boolean finnesTall(int[] tabell, int tall) {
        for (int t : tabell) if (t == tall) return true;
        return false;
    }

    // e) Finn posisjonen til et tall
    public static int posisjonTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) return i;
        }
        return -1;
    }

    // f) Reverser tabellen
    public static int[] reverser(int[] tabell) {
        int[] ny = new int[tabell.length];
        for (int i = 0; i < tabell.length; i++) {
            ny[i] = tabell[tabell.length - 1 - i];
        }
        return ny;
    }

    // g) Sjekk om tabellen er sortert stigende
    public static boolean erSortert(int[] tabell) {
        for (int i = 0; i < tabell.length - 1; i++) {
            if (tabell[i] > tabell[i + 1]) return false;
        }
        return true;
    }

    // h) Sett sammen to tabeller
    public static int[] settSammen(int[] tab1, int[] tab2) {
        int[] ny = new int[tab1.length + tab2.length];
        for (int i = 0; i < tab1.length; i++) ny[i] = tab1[i];
        for (int i = 0; i < tab2.length; i++) ny[tab1.length + i] = tab2[i];
        return ny;
    }
}

