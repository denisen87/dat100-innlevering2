package no.hvl.dat100.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {
        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i] + " ");
            System.out.println(); // linjeskift til slutt
        }
    }

    // b)
    public static String tilStreng(int[] tabell) {
        String s = "[";
        for (int i = 0; i < tabell.length; i++) {
            s += tabell[i];
            if (i < tabell.length - 1) {
                s += ",";
            }
        }
        s += "]";
        return s;
    }


    // c)
    public static int summer(int[] tabell) {
        int sum = 0;
        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        return sum;
    }


	// d)
    public static boolean finnesTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;
    }

	// e)
    public static int posisjonTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
    }

	// f)
    public static int[] reverser(int[] tabell) {
        int[] ny = new int[tabell.length];
        for (int i = 0; i < tabell.length; i++) {
            ny[i] = tabell[tabell.length - 1 - i];
        }
        return ny;
    }




	// g)
    public static boolean erSortert(int[] tabell) {
        for (int i = 0; i < tabell.length - 1; i++) {
            if (tabell[i] > tabell[i + 1]) {
                return false;
            }
        }
        return true;
    }



	// h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] ny = new int[tabell1.length + tabell2.length];

        // kopier tabell1
        for (int i = 0; i < tabell1.length; i++) {
            ny[i] = tabell1[i];
        }

        // kopier tabell2
        for (int j = 0; j < tabell2.length; j++) {
            ny[tabell1.length + j] = tabell2[j];
        }

        return ny;
    }
}

