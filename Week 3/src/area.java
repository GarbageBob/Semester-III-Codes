import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double l,b;
		System.out.println("Enter length and breadth :");
		l = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println("Area = " + l*b);
	}
}