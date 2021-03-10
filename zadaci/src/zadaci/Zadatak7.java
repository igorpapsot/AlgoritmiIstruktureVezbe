package zadaci;

public class Zadatak7 {
	public static void main(String[] args) {
		
		int suma = 0;
		int sr = 0;
		int[] niz = {1, 23, 43, 12};
		int max = niz[0];
		int min = niz[0];
		int tmp = 0;
		for(int i = 0; i <niz.length;i++) {
			tmp = niz[i];
			suma += tmp;
			if(niz[i] < min) {
				min = niz[i]; 
			}
			if(niz[i] > max) {
				max = niz[i]; 
			}
		}
		
		
		sr = suma/(niz.length);
		System.out.println(suma);
		System.out.println(sr);
		System.out.println("min je: " + min);
		System.out.println("max je: " + max);
	}
}
