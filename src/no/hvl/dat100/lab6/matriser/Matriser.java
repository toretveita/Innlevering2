package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
	for (int i=0; i < matrise.length; i++) {
		for (int j=0; j < matrise[i].length; j++) {
			System.out.printf("%2d", matrise[i][j]);
		}
		System.out.println();
	}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		StringBuilder strMatrise = new StringBuilder();
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				strMatrise.append(matrise[i][j]);
				strMatrise.append("\t");
			}
			strMatrise.append("\n");
		}
		return strMatrise.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] a = matrise;
        int[][] matriseS = a.clone();
        
        for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				matriseS[i][j] = matrise[i][j] * tall;
			}}
        return matriseS;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if(a == b) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
