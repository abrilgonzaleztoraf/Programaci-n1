import java.io.BufferedReader;
import java.io.InputStreamReader;
public class xd {

	public static void main(String[] args) {
		Double num1;
		Double num2;
		Double num3;
		Double resultado;

		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));

			System.out.println("num1:");
			num1 = new Double(entrada.readLine());
			System.out.println("num2:");
			num2 = new Double(entrada.readLine());
			System.out.println("num3:");
			num3 = new Double(entrada.readLine());
			
			resultado = (num1/num2) - num3;
			System.out.println("El resulta3 es: " + resultado);
		}
		catch (Exception exc) {

		}
	}
}
