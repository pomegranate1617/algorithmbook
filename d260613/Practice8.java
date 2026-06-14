package d260613;

public class Practice8 {
	public static void main(String[] args) {
		System.out.println(sumof(3,5));
		System.out.println(sumof(6,4));
		System.out.println(sumof(-1,4));
		System.out.println(sumof(1,-4));
		System.out.println(sumof(-5,-1));
		System.out.println(sumof(-1,-5));
		System.out.println(sumof(0,0));
	}
	
	public static int sumof(int a, int b) {
		
		int minusAbs = Math.abs(a - b);
		
		return (a + b) * (minusAbs + 1) / 2;
	}

}
