import java.util.Scanner;

//원의 넓이를 계산하는 프로그램
//1.반지름 입력받기
//2.넓이 = 3.14*반지름*반지름
//
public class F_yesterday2 {

	public static void main(String[] args) {
		//반지름 입력받기-Scanner
		Scanner k = new Scanner(System.in);
		System.out.println("반지름을 입력하세요 :");
		double r =k.nextDouble();
		//System.out.println(r);
		
		//넓이 math 치고 자동완성, .치고 자동완성
		double width = Math.PI*r*r;
		System.out.printf("이 원의 넓이는 : %.1f",width);
		
	}

}
