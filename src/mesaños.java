import java.io.BufferedReader;
import java.io.InputStreamReader;
public class mesa�os { //Cambiale el nombre mija

	public static void main(String[] args) {
		Integer mes;
		try {
			BufferedReader entrada = new BufferedReader (new
					InputStreamReader (System.in));
			System.out.println("ingrese mes del 1 al 12");
			mes = new Integer (entrada.readLine());

			if ((mes <= 12) && (mes >= 1)) {
				if (mes % 2 == 0) {
					if (mes == 2) {
						System.out.println("ingrese a�o del 2000 al 2019");
						Integer a�o = new Integer(entrada.readLine());
						if ((a�o > 1999) && (a�o < 2020)){
							if ((a�o == 2000) || (a�o == 2004) || (a�o == 2008) || (a�o == 2012) || (a�o == 2016)) {
								System.out.println("el mes tuvo 29 d�as");
							}else {
								System.out.println("tuvo 28 d�as");
							}
						}

					}else {
						System.out.println("El mes tuvo 30 d�as wachin");
					}
				}else {
					System.out.println("El mes tuvo 31 d�as");
				}
			}

		} catch (Exception exc) {
			System.out.println(exc);
		}

	}
}

