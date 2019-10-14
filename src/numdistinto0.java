import java.io.BufferedReader;
import java.io.InputStreamReader;
public class numdistinto0 {

	public static void main(String[] args) {
		Integer num;
		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));
//			System.out.println("ingrese algo");
//			num = new Integer (entrada.readLine());
			
			do {
				System.out.println("ingrese algo");
				num = new Integer (entrada.readLine());
				System.out.println("El numero ingresado fue: " + num);
				
			}while (num != 0);
			
			
		} catch (Exception exc) {
			System.out.println(exc);
		}

	}
}
