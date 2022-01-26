
public class FMain4 {
	// 같은 범위 내(같은 class)에 있는 곳에서 함수명 중복 안됨!!
	// 오버로딩(overloading)
	// parameter가 다르면 함수명이 같아도 된당.~!
	// 함수명은 같게, 파라미터는 다르게 함수작업
	// 호출할 때 어떤 값을 넣었느냐에 따라서 함수가 불러지게 하는 기술

	public static void printMenu() {
		System.out.println("오늘 점심은 돈까스");
	}

	public static void printMenu(String s) {
		System.out.println("오늘 점심은 국밥");
	}

	public static void printMenu(int a) {
		System.out.println("오늘 점심은 라면에 김밥");
	}
 
   //정수 2개를 넣으면 합을 출력하는 함수(함수명:printsum)
	//이 함수에서 필요한 재료가 정수 2개 ->파라미터에 정수 두개 넣어줘야한다는 뜻
	
	public static void printSum(int a, int b) {
		System.out.println(a + b);
	
		
	}

	// 실수 3개를 넣으면 합을 출력하는 함수(함수명:printsum)
	public static void printsum(double a, double b, double c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		printMenu();
		printMenu("국수");
		printMenu(55);
		printSum(1, 3);
		printsum(100, 1.0, 2.0);
	}
}
