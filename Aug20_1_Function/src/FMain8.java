import java.util.Random;
import java.util.Scanner;

//홀짝- 함수 버전
//return, parameter
public class FMain8 {
	// 랜덤한 숫자를 받는 함수 필요!
	// 랜덤으로 숫자만 받기때문에 파라미터()안에는 채울 필요가 없당!
	public static int getNum() {
		Random r = new Random();
		// 10까지 하기 위해선 뒤에 +1을 해야한다.
		int a = r.nextInt(10) + 1;
		System.out.println(a);
		return a;
	}

	// 이 숫자가 홀수인지,짝수인지 확인하기!->paramter필요,3항연산자
	public static String judgeHJ(int b) {
		String HG = (b % 2 == 0) ? "짝수" : "홀수";
		System.out.println(HG);

		// 리턴
		return HG;
	}

	// 홀,짝인지 내가 입력하는 함수
	public static String printHG() {
		Scanner k = new Scanner(System.in);
		System.out.print("홀수일까요? 짝수일까요?");
		String what = k.next();
		System.out.println(what);
		
		return what;
	}
	
	// 내가쓴거랑 컴퓨터가 랜덤하게 뽑은 숫자랑 같으면 정답! 다르면 땡!
	// 다른 곳에서 활용하지않기 때문에 return 하지 않는다.
	public static void findCorrect(String a,String b) {
	String correct=(a.equals(b))?"정답":"떙";
	System.out.println(correct);
	
	}
	
	
	public static void main(String[] args) {
		int ran = getNum();
		String HG = judgeHJ(ran);
		String choose = printHG();
		findCorrect(HG, choose);
	}
}
