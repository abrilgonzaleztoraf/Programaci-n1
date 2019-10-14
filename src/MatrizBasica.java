//me declares una matriz 3x4 , la cargues con valores al azar del 0 al 1000, y me la imprimas (todo con metodos)
public class MatrizBasica {
	private static int MAXFIL = 3;
	private static int MAXCOL = 4;

	public static void main(String[] args) {
		int[][] matRicardo = new int [MAXFIL] [MAXCOL];
		cargarMatriz(matRicardo);
		imprimirMatriz(matRicardo);
	}
	
	public static void cargarMatriz(int[][] matRicardo) {
		for (int f = 0; f < MAXFIL; f++) {
			for (int c = 0; c < MAXCOL; c++) {
				matRicardo [f][c] = (int)(Math.random() * 1000);
			}
		}
	}
	
	public static void imprimirMatriz(int[][] matRicardo) {
		for (int f = 0; f < MAXFIL; f++) {
			for (int c = 0; c < MAXCOL; c++) {
				System.out.println(matRicardo[f][c]);
			}
		}
	}
	
}