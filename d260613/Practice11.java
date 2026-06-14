package d260613;

public class Practice11 {
	public static void main(String[] args) {
		multiple();
	}
	public static void multiple() {
		
		System.out.print("  | ");
		
		for(int i = 1; i < 10; i++) {
			
			System.out.printf("%3d", i);
//			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("--+------------------");
		
		for(int i = 1; i < 10; i++) {
			
			System.out.print( i + " | ");
			
			for(int j = 1; j < 10; j++) {
				//자릿수 맞추기 필요
				System.out.printf("%3d", i * j );
//				System.out.print(i * j + " ");
			}
			
			System.out.println();
		}
	}
}
