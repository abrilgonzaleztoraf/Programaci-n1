import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Plantilla { //Cambiale el nombre mija

	public static void main(String[] args) {
		Integer num;
		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));
			System.out.println("ingrese algo");
			num = new Integer (entrada.readLine());
			
			
		} catch (Exception exc) {
			System.out.println(exc);
		}

	}
}

