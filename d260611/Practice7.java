package d260611;

public class Practice7 {
	public static void main(String[] args) {
		System.out.println(gausAdd(10));
		System.out.println(gausAdd(11));
	}
	
	public static int gausAdd(int n) {
		
		if(n % 2 == 0) {
			
			int half = n / 2;
			
			return (1 + n)*half; 
		}else {
			
			int half = n / 2;
			int midValue = half + 1;
			
			return (1 + n)*half + midValue;
		}
	}
}
