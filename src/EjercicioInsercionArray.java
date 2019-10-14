import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjercicioInsercionArray {
	private static int MAX = 10;

	public static void main(String[] args) {
		Integer num;
		int pos;
		int[] arr = new int[MAX];
		cargarValores(arr);
		arrayPrint(arr);
		num = pedirElem();
		System.out.println("-----------");
		pos = encontrarPosicion(arr, num);
		insertarValor(arr, pos, num);
		arrayPrint(arr);
	}

	public static void cargarValores(int[] arr) {
		int a = 110;
		for (int pos = 0; pos < MAX; pos++) {
			arr[pos] = a;
			a = a - 10;
		}
	}

	public static Integer pedirElem() {
		try {
			Integer numero;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese el valor: ");
			numero = new Integer(entrada.readLine());
			return numero;
		} catch (Exception exc) {
			System.out.println(exc);
		}
		return null;
	}

	public static int encontrarPosicion(int[] arr, Integer num) {
		int pos = 0;
		boolean encontrado = false;
		while ((pos < MAX) && (encontrado == false)) {
			if (arr[pos] > num) {
				pos++;
			}else {
				encontrado = true;
			}
		}
		return pos;
	}
	
	public static void insertarValor(int[] arr, int pos, Integer num) {
			
		}
	
	public static void arrayPrint(int[] arr) {
		for (int i = 0; i < MAX; i++) {
			System.out.println("posición: " + i + " valor: " + arr[i]);
		}
	}
}
