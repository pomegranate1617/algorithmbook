package d260611;

public class Practice4 {
	public static void main(String[] args) {
		System.out.println(mid(3,1,2));
		System.out.println(mid(2,3,1));
		System.out.println(mid(1,2,3));
		System.out.println(mid(3,2,1));
	}
	public static int mid(int a, int b, int c) {
		long start = System.nanoTime();
		
		if(a >= b) {
			if(b >= c) {
				long end = System.nanoTime();
				System.out.println("걸린시간 : " + (end - start));
				return b;
			}else if(c >= a) {
				long end = System.nanoTime();
				System.out.println("걸린시간 : " + (end - start));
				return a;
			}else {
				long end = System.nanoTime();
				System.out.println("걸린시간 : " + (end - start));
				return c;
			}
		}else if(a >= c) {
			long end = System.nanoTime();
			System.out.println("걸린시간 : " + (end - start));
			return a;
		}else if(b >= c) {
			long end = System.nanoTime();
			System.out.println("걸린시간 : " + (end - start));
			return c;
		}else {
			long end = System.nanoTime();
			System.out.println("걸린시간 : " + (end - start));
			return b;
		}
		
		
	}
}
