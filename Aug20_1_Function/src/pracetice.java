import java.util.Random;
import java.util.Scanner;
//프로젝트 이름 바꿀 때 f2 
public class pracetice {
	// 랜덤으로 숫자받는 함수 필요
	public static int getNum() {
		Random r = new Random();
		int a = r.nextInt(10) + 1;
		System.out.println(a);
		return a;
	}

//이 숫자가 홀수인지,짝수인지 확인하는 함수 필요=>parameter,3항연산자
	public static String jdegeHG(int b) {
		String HG = (b % 2 == 0) ? "짝" : "홀";
		System.out.println(HG);
		return HG;
	}

//홀수인지 짝수인지 내가 입력하는 함수
	public static String printHG() {
		Scanner k = new Scanner(System.in);
		System.out.println("홀수일까요 짝수일까요");
		String what = k.next();
		return what;
	}

//내가쓴거랑 컴퓨터가 랜덤하게 뽑은숫자랑 같으면 정답 아니면 땡
	public static void findCorrect(String a,String b) {
		String correct=a.equals(b)?"정답":"떙";
		System.out.println(correct);
	}

	public static void main(String[] args) {
		int random = getNum();
		String HG = jdegeHG(random);
		String choose = printHG();
	}
}
