package zadaci;
import java.lang.Math;

public class Zadatak2 {
	public static int zapremina(int r) {
		int z = (int) (4/3 * Math.PI * Math.pow(r, 3));
		return z;
	}
	public static int povrsina(int r) {
		int z = (int) (4 * Math.PI * Math.pow(r, 2));
		return z;
	}
	
	public static void main(String[] args) {
		System.out.println(zapremina(3));
		System.out.println(povrsina(3));
	}
}
