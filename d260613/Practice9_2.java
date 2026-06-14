package d260613;

import java.util.Scanner;

public class Practice9_2 {
	public static void main(String[] args) {
		bMinusA();
	}
	
	public static void bMinusA() {//중복코드를 줄이는게 꼭 좋은것만은 아니다...
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a값: ");
		int a = sc.nextInt();
		int b;
		
		int loopCnt  = 0;
		
		do {
			if(loopCnt != 0) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}
			
			System.out.print("b값: ");
			b = sc.nextInt();
			loopCnt++;
		}while(b <= a);
		
		sc.close();
		
		System.out.println("b - a는 " + (b - a) + "입니다.");
		
	}
}
