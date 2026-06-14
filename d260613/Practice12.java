package d260613;

public class Practice12 {
	public static void main(String[] args) {
		addChart();
	}
	
	public static void addChart() {
		System.out.printf("%2s|"," ");
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%3d", i);
		}
		
		System.out.println();
		System.out.printf("%2s+","--");
		System.out.println("--------------------------------------");
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%2d|", i);
			
			for(int j = 1; j < 10; j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
		}
		
	}
}
