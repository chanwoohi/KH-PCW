package day24;

public class Ex02 {

	public static void main(String[] args) {
		
		int num1 = 1, num2 = 2;
		
		double res = num1 / /*(double)*/num2;
		
		/* 1 / 2 = 0.5가 출력되지 않음
		 * 원인 : 정수형으로 정수형을 나누기를 했을 때 정수형으로 떨어지기 때문
		 * 해결 방법 : 명시적 형변환
		 * */
		
		System.out.println(num1 + " / " + num2 + " = " + res);

	}

}
