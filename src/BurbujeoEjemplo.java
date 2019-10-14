
public class BurbujeoEjemplo {
	private static int MAX = 5;

	public static void main(String[] args) {
		int [] arr = new int[MAX];
		rellenar(arr);
		arrayPrint(arr);
		System.out.println("---------Ordenado---------");
		burbujeo(arr);
		arrayPrint(arr);
	}
	
	public static void rellenar(int[] arr) {
		for (int i = 0 ; i<MAX ; i++) {
			arr[i] = (int)(Math.random() * 50);
		}
	}
	
	public static void arrayPrint(int[] arr) {
		for (int i = 0; i < MAX; i++) {
			System.out.println("posición: " + i + " valor: " + arr[i]);
		}
	}
	
	public static void burbujeo(int[] arr) {
		int temp;
		for (int i = 1; i < MAX; i++) {
			for (int j = 0; j < MAX - 1; j++) {
				if (arr[j] > arr[j + 1]) { //si al if le pones un mayor se ordena de forma creciente.
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
	}
}
