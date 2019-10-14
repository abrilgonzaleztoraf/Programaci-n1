import java.io.BufferedReader;
import java.io.InputStreamReader;
public class mayora1menora10 {

	public static void main(String[] args) {
		Integer num;
		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));
			System.out.println("ingrese numero mayor a 1 y menor a 10");
			num = new Integer (entrada.readLine());
			if ((num < 10) && (num > 1)) {
				System.out.println(num);
				for (int i = 0 ; i <=num ; i++) {
					System.out.println(num - i);
				}
			}
			//			while ((num < 10) && (num > 1)) {
			//				System.out.println("ingrese numero mayor a 1 y menor a 10");
			//				num = new Integer (entrada.readLine());
			//				for 
			//			}

		} catch (Exception exc) {
			System.out.println(exc);
		}

	}
}
