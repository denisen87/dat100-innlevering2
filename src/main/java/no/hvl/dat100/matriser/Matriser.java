package no.hvl.dat100.matriser;

public class Matriser {

	// a)
    public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) {         // utvidet for-løkke over radene
            for (int elem : rad) {          // utvidet for-løkke over elementene i raden
                System.out.print(elem + " ");
            }
            System.out.println();           // ny linje etter hver rad
        }
    }

	// b)
    public static String tilStreng(int[][] matrise) {
        StringBuilder sb = new StringBuilder();
        for (int[] rad : matrise) {
            for (int elem : rad) {
                sb.append(elem).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

	// c)
    public static int[][] skaler(int tall, int[][] matrise) {
        int rader = matrise.length;
        int kolonner = (rader > 0) ? matrise[0].length : 0;
        int[][] nyMatrise = new int[rader][kolonner];

        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                nyMatrise[i][j] = matrise[i][j] * tall;
            }
        }
        return nyMatrise;
    }

	// d)
    public static boolean erLik(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length) return false;

        for (int i = 0; i < mat1.length; i++) {
            if (mat1[i].length != mat2[i].length) return false;
            for (int j = 0; j < mat1[i].length; j++) {
                if (mat1[i][j] != mat2[i][j]) return false;
            }
        }
        return true;
    }
	
	// e)
    public static int[][] speile(int[][] matrise) {
        int n = matrise.length;            // antall rader
        int[][] ny = new int[n][n];        // ny kvadratisk matrise

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ny[j][i] = matrise[i][j];  // bytter rader og kolonner
            }
        }
        return ny;
    }

	// f)
    public static int[][] multipliser(int[][] a, int[][] b) {
        int raderA = a.length;
        int kolonnerA = (raderA > 0) ? a[0].length : 0;
        int raderB = b.length;
        int kolonnerB = (raderB > 0) ? b[0].length : 0;

        if (kolonnerA != raderB) {
            throw new IllegalArgumentException("Antall kolonner i a må være lik antall rader i b");
        }

        int[][] produkt = new int[raderA][kolonnerB];

        for (int i = 0; i < raderA; i++) {
            for (int j = 0; j < kolonnerB; j++) {
                for (int k = 0; k < kolonnerA; k++) {
                    produkt[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return produkt;
    }
}
