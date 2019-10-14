import java.io.BufferedReader;
import java.io.InputStreamReader;
//Hacer un programa que inicialice y luego cargue un arreglo (sin
//orden) de tamaño MAX=10 con números enteros ingresados por
//teclado. Finalmente imprima el arreglo por pantalla. 

public class ArrayEjemplo1 {
	final static int MAX = 10;

	public static void main(String[] args) {
		int[] arregloNombre = new int[MAX];
		Integer num;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

			for (int pos = 0; pos < MAX; pos++) {
				System.out.println("ingrese los valores: ");
				num = new Integer(entrada.readLine());
				arregloNombre[pos] = num;
			}
			for (int pos = 0; pos < MAX; pos++) {
				System.out.println(arregloNombre[pos]);
			}

		} catch (Exception exc) {
			System.out.println(exc);
		}

	}
}
