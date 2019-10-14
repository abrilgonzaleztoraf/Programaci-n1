import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Parcial { //Cambiale el nombre mija

	public static void main(String[] args) {
		Integer num = 1;
		char caracter;
		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));
			
			System.out.println("ingrese un numero");
			num = new Integer (entrada.readLine());
			
			while (num !=0){
				System.out.println("ingrese un char");
				caracter = entrada.readLine().charAt(0);
				if (caracter <= "9".charAt(0) && caracter >= "0".charAt(0)) {
					System.out.println("El caracter es un digito");
					if ((num % 3 == 0) && (num % 5 == 0)) {
						System.out.println("El numero que ingresaste previamente es multiplo de 3 y de 5");
					}else {
						System.out.println("El numero que ingresaste previamente no es multiplo de 3 y de 5");
					}
				}else if ( (caracter == "a".charAt(0))  || (caracter == "e".charAt(0)) || (caracter == "i".charAt(0)) || (caracter == "o".charAt(0)) || (caracter == "u".charAt(0))){
					System.out.println("El caracter es una vocal minuscula");
				}else {
					System.out.println("Es otro tipo de caracter");
				}
				
				System.out.println("ingrese otro numero");
				num = new Integer (entrada.readLine());
			}
			
		} catch (Exception exc) {
			System.out.println(exc);
		}

	}
}

