//Python : Java보다 고급(컴퓨터가 자동적으로 해주는 게 더 많아서)
//         개발자 x
//         int a=10;=>자바
//         자료형은 파이썬이 알아서 판단해
//         a=10;  =>파이썬 변수가 없던거였으면 새로 생성해서 10을 넣은것
//         a=29;  =>a가 29로 바뀜!! 변수가 있었으면 기존의 변수를 변경한 것.
public class FMain3 {
	public static void test(int a) {
		System.out.println(a);
		//자료형을 쓰지 않은 변수는 값을 수정한다는 뜻이다!!!
		//원래 있던 a값 10을 20으로 바꾼거다.~
		a=20;
		System.out.println(a);
		
	}
	
	//단 축 키 ============> 
	public static void main(String[] args) {
		//자료형까지 쓰는 변수선언 :13번째줄 =>변수를 생성할 때 사용
		int a=10;//지역변수, 정수형 변수 a라는 그릇을 만들어서 값을 10으로 저장한다.
		System.out.println(a);
		test(a);
		System.out.println(a);
	}

}
