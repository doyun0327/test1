//정수 두개를 넣으면(재료->파라미터) 그 중에 큰 숫자를 출력하는 함수

public class FMain6 {
	
	public static int printBig(int a,int b) {
		//삼항연산자할때 String big=(a>b)?"a":"b"->이렇게 큰 따옴표는 string
		//그냥 숫자는 int big=(a>b)?a:b; 뒤에 따옴표 안씀
		int big=(a>b)?a:b;
		System.out.printf("a:%d , b:%d\n",a,b);
		System.out.println(big+"가 더 커요");
		//main함수에 int로 나온 값을 결과물로 보냄!
		//public static void ->void부분을 리턴할 형태 int로 바꿔줘야 함!
		return big*1000;
	}
	
	//실수 두개 를 넣으면 큰 숫자를 구해서 *100한 숫자를 출력하는 함수
	public static void su(double a,double b) {
		double back1 =(a>b)?a:b;
		System.out.println(back1*=100);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		printBig(10, 20);
		//return값을 넣을 그릇을 만들어 줘야지 활용이 가능함
		int lala=printBig(1, 2);
		Thread.sleep(lala);

		//su(1.0,2.0);
		
		
		
	}
}
