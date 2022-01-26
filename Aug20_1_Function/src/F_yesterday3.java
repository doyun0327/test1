import java.util.Scanner;

//사각형의 둘레, 넓이
//가로,세로 숫자 스캐너로 받기
//둘레;(가로+세로)*2 
//넓이:가로*세로
public class F_yesterday3 {

	public static void main(String[] args) {

		//스캐너 생성
		Scanner k = new Scanner(System.in);
		//가로 숫자 받기
		System.out.print("가로 : ");
		double garo = k.nextDouble();
		//System.out.println(garo);
		
		//세로 숫자받기
		System.out.print("세로 : ");
		double saero = k.nextDouble();
		//System.out.print(saero);
		
		//둘레
		double dul = (garo+saero)*2;
		System.out.printf("둘레 :%.1fcm\n",dul);
		
		//넓이
		double width = garo*saero;
		System.out.printf("넓이 :%.1fcm\n ", width);
		
		//항상 차근차근 생각하기!!!!!
		
	}

}
