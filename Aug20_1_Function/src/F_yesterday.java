import java.util.Random;
import java.util.Scanner;

//홀짝게임
//1.(컴퓨터가)랜덤으로 숫자를 뽑을 수 있어야 함
//2. 홀수 인지 짝수인지 판단
//3. 내가 콘솔창에 홀,짝이라고 입력
//4.(컴) 맞다 , 틀리다 판단
public class F_yesterday {

	public static void main(String[] args) {

			//랜덤으로숫자뽑기
		//괄호안은 0~9까지다
		//Random은 다 대문자야
		Random r= new Random();
		//10까지 하기 위해선 뒤에 +1을 해야한다.
		int a = r.nextInt(10)+1;
		//콘솔창에 확인용
		System.out.println(a);
		
		String answer = (a%2==0) ? "짝":"홀";
		System.out.println(answer);
		
		//키보드 입력받을 때 필요!! 
		Scanner k = new Scanner(System.in);
		
		System.out.print("홀일까요? 짝일까요?");
		String myAnswer = k.next();
		System.out.println(myAnswer);
		
		//확인용
		// "홀"이라는 answer랑 내가 콘솔에 입력한 홀 맞으면 정답
		String result = (answer.equals(myAnswer))?"정답":"땡";
		System.out.println(result);
		
	}

}
