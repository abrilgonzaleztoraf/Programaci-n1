import java.io.BufferedReader;
import java.io.InputStreamReader;
public class mesaños { //Cambiale el nombre mija

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
						System.out.println("ingrese año del 2000 al 2019");
						Integer año = new Integer(entrada.readLine());
						if ((año > 1999) && (año < 2020)){
							if ((año == 2000) || (año == 2004) || (año == 2008) || (año == 2012) || (año == 2016)) {
								System.out.println("el mes tuvo 29 días");
							}else {
								System.out.println("tuvo 28 días");
							}
						}

					}else {
						System.out.println("El mes tuvo 30 días wachin");
					}
				}else {
					System.out.println("El mes tuvo 31 días");
				}
			}

		} catch (Exception exc) {
			System.out.println(exc);
		}

	}
}

