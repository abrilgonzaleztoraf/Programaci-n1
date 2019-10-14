import java.io.BufferedReader;
import java.io.InputStreamReader;

public class nombredescriptivo {

	public static void main(String[] args) {
		Integer numnatural = -5;
		//		int contador=1;

		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));

			while (numnatural <= 0) {
				System.out.println("ingrese numero natural");
				numnatural = new Integer (entrada.readLine());
			}


			//			while (contador <= 10) {
			//				//do something
			//				System.out.println(numnatural * contador);
			//				contador = contador + 1;
			////				contador++;
			//			}
			//declara variable INTERNA - pone la condicion - que tiene que hacer en cada ciclo
			for (int contador = 1 ; contador <= 10 ; contador++) {
				System.out.println(numnatural * contador);	
			}

		} catch (Exception exc) {
			System.out.println(exc);
		}

	}
}
