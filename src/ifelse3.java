import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ifelse3 {

	public static void main(String[] args) {
		Integer numeritouwu;
		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));
			System.out.println("ingrese el numerito:");
			numeritouwu = new Integer (entrada.readLine());

			if (numeritouwu == 1) {
				System.out.println("lunes");

			}else if (numeritouwu == 2) {
				System.out.println("martes");

			}else if (numeritouwu == 3) {
				System.out.println("miercoles");

			}else if (numeritouwu == 4) {
				System.out.println("jueves");

			}else if (numeritouwu == 5) {
				System.out.println("viernes");

			}else if (numeritouwu == 6) {
				System.out.println("sabado");

			}else if (numeritouwu == 7) {
				System.out.println("domingo");
			}else {
				System.out.println("poneme un numero del 1 al 7 la re concha de tu vieja uwu");
			}
		}catch (Exception exc) {
			System.out.println(exc);
		}


	}
}
