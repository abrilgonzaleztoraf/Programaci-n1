import java.io.BufferedReader;
import java.io.InputStreamReader;
//Implementar un método que realice un corrimiento a derecha en
//un arreglo ordenado de tamaño MAX=10 a partir de una posición.

public class arregloejemplo2 {
	final static int MAX = 10;

	public static void main(String[] args) {
		int miArreglo[] = new int[MAX];
		cargarArreglo(miArreglo);
		hacerCorrimiento(miArreglo);

	}

	private static void hacerCorrimiento(int[] arr, int posicion) {
		int auxiliar;
		auxiliar = arr[posicion]; 
		arr[posicion] = arr[posicion+1];
		arr[posicion+1] = auxiliar;
	}	
	
	public static void hacerCorrimiento(int[] miArreglo) {
		Integer num;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese posicion para mover a la derecha");
			num = new Integer(entrada.readLine());
			hacerCorrimiento(miArreglo, num);
			arrayPrint(miArreglo);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

	public static void cargarArreglo(int[] arreloco) {
		
		Integer num;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			for (int pos = 0; pos < MAX; pos++) {
				System.out.println("ingrese algo");
				num = new Integer(entrada.readLine());
				arreloco[pos] = num;
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

	public static void arrayPrint(int[] arr) {
		for (int i = 0; i < MAX; i++) {
			System.out.println("posición: " + i + " valor: " + arr[i]);
		}
	}

}
