package day12;

public class FinalEx01 {
	//Final
	public static void main(String[] args) {
		/*	final 변수는 상수로 값을 최초 한 번만 할당할 수 있다
		 * 여러 번 할당이 불가능
		 * */
		final int num;
		num = 20; //처음 할당(저장) 하기 때문에 가
		// num = 30; //두번쨰 부터는 불가능
	}
}

class Parent1 {
	public final void print() {
		System.out.println("파이널 메소드 입니다.");
	}
}

class Child1 extends Parent1 {
	//final 메소드는 오버라이드를 할 수 없어서 에러 발생
	/*
	@Override
	public final void print() {
		System.out.println("파이널 메소드를 수정하려고 합니다.");
	}
	*/
}

final class Prent2{
	
}
//final 클래스는 부모 클래스가 될 수 없다
//class Child2 extends Parent2{}