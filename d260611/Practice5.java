package d260611;

public class Practice5 {
	public static void main(String[] args) {
		System.out.println(med3(3,2,1));
		System.out.println(med3(2,1,3));
		System.out.println(med3(3,1,2));
	}
	
	public static int med3(int a, int b, int c) {
		long start = System.nanoTime();
		
		if((b >= a && c <= a) || (b <= a && c >= a)) {
			long end = System.nanoTime();
			System.out.println("걸린 시간 : " + (end - start));
			return a;
		}else if((a > b && c < b) || (a < b && c < b)) {
			long end = System.nanoTime();
			System.out.println("걸린 시간 : " + (end - start));
			return b;
		}
		long end = System.nanoTime();
		System.out.println("걸린 시간 : " + (end - start));
		return c;
	}
}
