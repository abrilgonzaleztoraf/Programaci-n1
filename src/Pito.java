import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Pito {

	public static void main(String[] args) {
		String nombre;
		Integer edad;
		Float altura;
		String ocupaci�n;

		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));
			System.out.println("ingrese nombre:");
			nombre = entrada.readLine();
			System.out.println("ingrese edad:");
			edad = new Integer(entrada.readLine());
			System.out.println("ingrese altura:");
			altura = new Float (entrada.readLine());
			System.out.println("ingrese ocupacion:");
			ocupaci�n = entrada.readLine();
			System.out.println("nombre: " + nombre);
			System.out.println("edad: " + edad);
			System.out.println("altura: " + altura);
			System.out.println("ocupacion: " + ocupaci�n);

		}
		catch (Exception exc) {
			System.out.println(exc);
		}
	}

}
