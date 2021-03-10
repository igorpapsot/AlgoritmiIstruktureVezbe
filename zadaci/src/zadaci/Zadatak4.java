package zadaci;

public class Zadatak4 {
	public static void slucaj(int dan) {
		switch(dan) {
			case 1:
				System.out.println("pon");
				break;
			case 2:
				System.out.println("uto");
				break;
			case 3:
				System.out.println("sre");
				break;
			case 4:
				System.out.println("cet");
				break;
			case 5:
				System.out.println("pet");
				break;
			case 6:
				System.out.println("sub");
				break;
			case 7:
				System.out.println("ned");
				break;
		}
		
	}
	
	public static void main(String[] args) {
		slucaj(5);
	}
}
