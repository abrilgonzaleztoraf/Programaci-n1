//1. Dada una matriz de enteros de 10 x 10, realizar los siguientes
//procedimientos o funciones:
//a) Obtener la suma de una diagonal.
//b) Invierta el contenido entre las posiciones inicio y fin de una fila
//dada.
public class MatrizEjercicio1 {
	private static int MAXFIL = 3;
	private static int MAXCOL = 3;

	public static void main(String[] args) {
		int[][] matriz = new int[MAXFIL][MAXCOL];
		cargarMatriz(matriz);
		// sumarDiagonal(matriz);
		imprimirMatriz(matriz);
		System.out.println("----------Movido-------");
//		invertirExtremos(matriz, 2);
		bubbleMatriz(matriz);
		imprimirMatriz(matriz);
	}

	public static void cargarMatriz(int[][] matriz) {
		for (int f = 0; f < MAXFIL; f++) {
			for (int c = 0; c < MAXCOL; c++) {
				matriz[f][c] = (int) (Math.random() * 10);
			}
		}
	}

	public static void sumarDiagonal(int[][] matriz) {
		int resultado = 0;
		for (int f = 0; f < MAXFIL; f++) {
			for (int c = 0; c < MAXCOL; c++) {
				if (f == c) {
					resultado = resultado + matriz[f][c];
				}
			}
		}
		System.out.println("resultado: " + resultado);
	}

	public static void imprimirMatriz(int[][] matriz) {
		for (int f = 0; f < MAXFIL; f++) {
			for (int c = 0; c < MAXCOL; c++) {
				System.out.println("Fila: " + f + " Columna: " + c + ": " + matriz[f][c]);
			}
		}
	}

	public static void invertirExtremos(int[][] matriz, int fila) {
		int aux = 0;
		aux = matriz[fila][0];
		matriz[fila][0] = matriz[fila][MAXCOL - 1];
		matriz[fila][MAXCOL - 1] = aux;
	}

	public static void bubbleMatriz(int[][] matriz) {
		int aux;
		for (int f = 0; f < MAXFIL; f++) {
			for (int c = 0; c < MAXCOL; c++) {
				for (int k = 0; k < MAXCOL - 1; k++) {
					if (matriz[f][k] < matriz[f][k + 1]) {
						aux = matriz[f][k];
						matriz[f][k] = matriz[f][k + 1];
						matriz[f][k + 1] = aux;
					}

				}
			}
		}
	}
}
