package d260613;

import java.util.Scanner;

public class Practice13 {
	public static void main(String[] args) {
		square();
	}
	public static void square() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정사각형을 출력합니다.");
		System.out.print("변의 길이: ");
		int sideLength = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < sideLength; i++) {
			System.out.println("*".repeat(sideLength));
		}
	}
}
