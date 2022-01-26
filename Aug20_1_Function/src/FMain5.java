//오버로딩 : 함수명은 같고, 파라미터가 다른 것(자료형,갯수)
public class FMain5 {
	public static void printSum(int a) {
		System.out.println(a);
	}

	public static void printSum(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void printSum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		printSum(30);
		printSum(10,20);
		printSum(10, 10, 10);
	}
}
