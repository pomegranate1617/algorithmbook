package d260611;

public class Practice3 {
	public static void main(String[] args) {
		System.out.println(min4(3,2,1,4));
	}
	
	public static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		if(d < min) {
			min = d;
		}
		
		return min;
	}
}
