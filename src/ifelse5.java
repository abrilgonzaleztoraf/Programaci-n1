import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ifelse5 {

	public static void main(String[] args) {
		//		solicite 3 números e imprima “creciente” si los tres números están en orden
		//		creciente, “decreciente” si están en orden decreciente o “error” si no cumplen
		//		ningún orden.
		Integer num1;
		Integer num2;
		Integer num3;

		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));
			System.out.println("ingrese el num1:");
			num1 = new Integer (entrada.readLine());

			System.out.println("ingrese el num2:");
			num2 = new Integer (entrada.readLine());

			System.out.println("ingrese el num3:");
			num3 = new Integer (entrada.readLine());

			if ((num1 < num2) && (num2 < num3)) {
				System.out.println("creciente owo");

			} else if ((num1 > num2) && (num2 > num3)) {
				System.out.println("decreciente unu");
			} else {
				System.out.println("creciente o decreciente bro elegi bldo");
			}

		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

}
