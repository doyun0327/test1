import java.util.Scanner;

//public static A  B  (C)
//내용
//RETURN a;
//A:main으로 보낼만한 것이 있을 때 변수명에 해당하는 자료형(함수에서 작업한 결과를 호출)
//B:기능이 대충 파악이 가능하게 ->동사스러운 작명
//C:MAIN에서 가져올만한(재료)가 있을 때
//a:main으로 보내고 싶은 것의 변수명


//키를 입력받고 =>return 받아 main에서 호출
//몸무게를 입력받고 =>return
//표준체중을 구하고 (키-100)*0.9
//비만도를 구하고  (몸무게/표준체중)*100
//비만 안비만     =>비만도가 120 안넘으면 안비만, 넘으면 비만
public class FMain7 {
	//키를 입력받는 함수
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("키:");
		double height = k.nextDouble();
		//System.out.println(height);
		
		return height;
	}
//몸무게 받기
	public static double getweight() {
		Scanner k = new Scanner(System.in);
		System.out.print("몸무게 :");
		double weight = k.nextDouble();
		//System.out.println(weight);
		
		return weight;
	}
	
	public static void main(String[] args) {
		//return 받은 변수 저장할 그릇생성->h,w
		double h = getHeight();
		double w=  getweight();
		
		System.out.println("*************");
		//표준체중 구하기
		//height말고 리턴 받은 값 h를 써야함 !
		double stdweight=(h-100)*0.9;
		System.out.printf("표준체중 : %.2f\n",stdweight);
		
		//비만도 구하기
		
		 double biman=(w/stdweight)*100;
		 System.out.printf("비만도 : %.2f\n",biman);
		 System.out.println("*************");
		 
		 //비만인지 안비만인지
		//비만도가 120 안넘으면 안비만, 넘으면 비만
		 String result=(biman>120)?"비만":"안비만";
		 System.out.printf("당신은 [%s] 입니다", result);
		 System.out.println("*************");
		
		
	}
}
