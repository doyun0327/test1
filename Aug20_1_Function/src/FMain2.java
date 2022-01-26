//변수를 만든다=>메모리를 사용한다
//변수를 만들지 않는다=>메모리를 사용하지 않는다.

public class FMain2 {

	public static void test(int b) {
		
		int a =123;
		System.out.println(b);
		System.out.println(a+b);
		System.out.println("*******************");
		
		
	}
	public static void main(String[] args) {
		int a = 10; //지역함수
		           //해당함수내에서만 사용이 가능
		int b =20;
		
		int c=30;//일회성으로 변수를 만들어 사용하는 것은 비추한다.
		
		test(c);
		test(30);//일회성으로 사용할 땐 이방법 추쳔!!
		
		//main함수의 b와 test함수의 b는 다르다.
		//test함수의 재료로 사용되는 parameter int b에 
		//main함수의 int c가 재료로 들어갔고
		//main 함수의 int c가 test함수의 parameter값인 int b가 된 것이다.
		
		

}}
