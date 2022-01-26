//JDK,JRE,JVM
//JDK:JVM,라이브러리 API, 개발 KIT가 모두 포함된 소프트웨어 패키지
//JRE:JVM,라이브러리 API가 포함된 소프트웨어 패키지
//JVM:OS(운영체제)
//JDK < JRE < JVM
//Java Virtual Machine = > Java 프로그램
//WORA(Write once, run anywhere):한번 작성하면, 어디서든 동일하게 동작한다.
//                              :자바의 특징을 잘 나타내는 문구

//알고리즘의 시대 vs 유지보수의 시대
//~알고리즘의 시대: 메모리를 덜 쓰고, 최대한 용량을 줄이고 속도는 빠르게
//              컴퓨터 사양이 좋아지면서 크게 차이가 나지 않아
//~유지보수의 시대: 소스를 정리를 해서 다른사람이 봤을 때 이해하기 쉽게 한다.=>main함수
//              main함수에 소스를 최대한 짧게
//
public class FMain {
	// main함수의 소스를 최대한 짧게 구성하기 위해서 다른 함수 사용
	// 관련이 있는 작업을 묶어서 필요할때마다 main에서 불러서 사용이 가능
	// 다른함수 밖에 구현, 순서는 딱히 상관은 없음
	// public staic 자료형 함수형 (자료형,변수명, 자료형,변수명...)
	// 자동완성->public까지만

	// 함수형 조건= 변수명 조건, 동사스럽게 만드는 것이 특징

	public static void waitWeekend() {
		System.out.println("오늘 금요일이잖아요");
		System.out.println("수업들을 때 힘이나요");
		System.out.println("오늘만 참으면 주말이예용");
		System.out.println("조금만 힘내봅시다.");
	}
	//자기소개 출력:이름,생일,나이,사는곳
	//변수 없이
	public static void inproduceMe() {
		System.out.println("이도윤");
		System.out.println("3월27일");
		System.out.println("23살");
		System.out.println("봉천동 다곰이 집");
	}
	//정수 2개 넣으면 사칙연산 결과 출력하는 함수
	public static void printCal(int a, int b) {
		//계산하는 함수
		//계산이라는 작업을 하려면 숫자가 필요함!
		//함수 parameter(인자): 함수를 실행하는데 필요한 재료!
		int c = a + b;
		int d = a - b;
		System.out.printf("%d + %d = %d\n" , a,b,c);
		System.out.printf("%d - %d = %d ", a,b,d);
	}
	// main함수 :JVM이 main함수를 자동으로 호출.
	public static void main(String[] args) {
		//함수명으로 넘기기 기억해랴
		waitWeekend();
		inproduceMe();
		System.out.println("*************");
		printCal(10,5);
	}
    //함수 접기 ctrl + shift + /(numpad)
	//함수 열기 ctrl + shift + *(numpad)
}