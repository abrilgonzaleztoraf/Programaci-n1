import java.io.BufferedReader;
import java.io.InputStreamReader;
public class pis {
	public static void main(String[] args) {
		Integer valor;
		Integer resto;
		Integer resto2;
		Integer resto3;
		
		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));
			System.out.println("ingrese su valor");
			valor = new Integer(entrada.readLine());
			
			
			resto = valor % 6;
			resto2 = valor % 7;
			
			System.out.println("El numero es multiplo de 6 y 7? " + ((resto == 0) && (resto2 == 0)));
			
			resto3 = valor % 2;
			
			System.out.println("El numero es mayor a 30 y multiplo de 2, o es menor igual a 30? " + ( ((valor > 30) && (resto3 == 0)) || (valor <= 30)));

		} 
		catch (Exception exc) {

		}

	}
}

