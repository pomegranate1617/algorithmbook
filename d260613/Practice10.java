package d260613;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		digitPrint();
	}
	
	public static void digitPrint() {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			num = sc.nextInt();
		}while(num <= 0);
		
		sc.close();
		
		int digit = String.valueOf(num).length();
		
		System.out.println("그 수는 " + digit + "자리입니다.");
	}
}
