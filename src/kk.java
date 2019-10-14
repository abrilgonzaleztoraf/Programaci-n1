import java.io.BufferedReader;
import java.io.InputStreamReader;
public class kk {

	public static void main(String[] args) {
		Integer num1;
		Integer num2;
		Integer num3;

		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));

			System.out.println("num1:");
			num1 = new Integer(entrada.readLine());
			System.out.println("num2:");
			num2 = new Integer(entrada.readLine());
			System.out.println("num3:");
			num3 = new Integer(entrada.readLine());
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);

		}
		catch (Exception exc) {
			
		}
	}

}
