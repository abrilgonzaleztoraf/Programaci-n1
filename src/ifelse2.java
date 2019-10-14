import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ifelse2 {

	public static void main(String[] args) {
		//		solicite un número e imprima “grande” si es mayor a 100 y
		//		“chico “ si es menor.
		Integer num;

		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));
			System.out.println("ingrese numero:");
			num = new Integer (entrada.readLine());
			
			if (num > 100) {
				System.out.println("senpai yameteee es muy grande uwu");
			
			}else if (num < 100) {
				System.out.println("etto es chico onii-chan owo");
			}else {
			System.out.println("es igual a 100 onii-san ewe");	
			}
		}

		catch (Exception exc) {
			System.out.println(exc);
		}

	}
}
