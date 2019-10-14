import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Parcial2019 {
		public static void main(String[] args) {
			Integer num;
			char caracter;
			try {
				BufferedReader entrada = new BufferedReader (new
						InputStreamReader (System.in));
				System.out.println("ingrese NUM");
				num = new Integer (entrada.readLine());
				
				if ((num % 7 == 0) && (num % 11 == 0)) {
					for (int i=0 ; i<= num ; i++) {
						System.out.println("ingrese un caracter");
						caracter = entrada.readLine().charAt(0);
						
						if ( (caracter >= "a".charAt(0)) && (caracter <="z".charAt(0)) ) {
							System.out.println("Letra minuscula");
						}
						else if ( (caracter >= "A".charAt(0)) && (caracter <="Z".charAt(0)) ) {
							System.out.println("Letra mayuscula");
						}
						else if ( (caracter >= "0".charAt(0)) && caracter<="9".charAt(0)) {
							System.out.println("Digito");
						}else {
							System.out.println("Otro");
						}
					}
				}
				
			} catch (Exception exc) {
				System.out.println(exc);
			}

		}

}
