import java.io.BufferedReader;
import java.io.InputStreamReader;
public class quincepracticoiteraciones { 
	public static void main(String[] args) {
		Integer num;
		Integer cantidadnegativos = 0;
		Integer cantidadmultiplosquince = 0;
		Integer valorpares= 0;
		
		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));
			
			for (int i = 0 ; i < 10  ; i++) {
				System.out.println("ingrese numero");
				num = new Integer (entrada.readLine());
				if (num % 15 == 0) {
					cantidadmultiplosquince = cantidadmultiplosquince + 1;
				}
				if (num <= 0) {
					cantidadnegativos = cantidadnegativos + 1;
				}
				
				if (num % 2 == 0) {
					valorpares = num + valorpares;
					
				} 
				
//				System.out.println("ingrese numero");
//				num = new Integer (entrada.readLine());
				
			}
			System.out.println( "cantidad de multiplos de quince: " + cantidadmultiplosquince + "\n cantidad de numeros negativos: " + cantidadnegativos + "\n suma de valores pares: " + valorpares);
			
		} catch (Exception exc) {
			System.out.println(exc);
		}

	}
}
