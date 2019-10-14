import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ifelse1 {
	public static void main(String[] args) {
		Integer num;
		
		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));
			System.out.println("ingrese numero:");
			num = new Integer (entrada.readLine());
			
			if (num < 0) {
				System.out.println("es negativo");
			
			} else {
				System.out.println("es positivo");
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

}