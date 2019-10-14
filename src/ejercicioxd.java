
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicioxd{ //Cambiale el nombre mija

	public static void main(String[] args) {
		Integer num1;
		Integer num2;
		Integer num3;
		Integer total;
		
		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));
			System.out.println("ingrese el numero 1:");
			num1 = new Integer (entrada.readLine());
			System.out.println("ingrese el numero 2:");
			num2 = new Integer (entrada.readLine());
			System.out.println("ingrese el numero 3");
			num3 = new Integer (entrada.readLine());
			
			total = (num1 / num2);
			total = (total - num3);
			
			System.out.println("el resultado es: " + total);
			
		} catch (Exception exc) {
			System.out.println(exc);
		}

	}
}


