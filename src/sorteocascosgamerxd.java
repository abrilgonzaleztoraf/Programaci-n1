import java.io.BufferedReader;
import java.io.InputStreamReader;
public class sorteocascosgamerxd { //Cambiale el nombre mija

	public static void main(String[] args) {
		Integer num;
		char caracter;
		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));
			System.out.println("ingrese numero:");
			num = new Integer (entrada.readLine());
			while (num != 0) {
				System.out.println("ingrese un caracter:");
				caracter = entrada.readLine().charAt(0);
				
				if ((caracter >= 0) && (caracter <= 9)) {
					System.out.println("digito");
					if ((num % 3 == 0) && (num % 5 == 0)) {
						System.out.println("es multiplo de 3 y 5");
					}
				}else if ((caracter == "a".charAt(0)) || (caracter == "e".charAt(0)) || (caracter == "i".charAt(0)) || (caracter == "o".charAt(0)) || (caracter == "u".charAt(0))) {
					System.out.println("es vocal minuscula");
					
				
				}else{
					System.out.println("otro");
		
				}System.out.println("ingrese numero:");
				num = new Integer (entrada.readLine());
			}

		} catch (Exception exc) {
			System.out.println(exc);
		}

	}
}

