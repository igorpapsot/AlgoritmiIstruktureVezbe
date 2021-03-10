package zadaci;

public class Zadatak3 {
	public static int ocenjivanje(int x) {
		int ocena = 0;
		if(x > 0) {
			ocena = 5;
		}
		if(x > 51) {
			ocena = 6;
		}
		if(x > 61) {
			ocena = 7;
		}
		if(x > 71) {
			ocena = 8;
		}
		if(x > 81) {
			ocena = 9;
		}
		if(x > 91) {
			ocena = 10;
		}
		return ocena;
	}
	
	public static void main(String[] args) {
		System.out.println(ocenjivanje(54));
	}
}
