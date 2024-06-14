package day13;

import java.text.MessageFormat;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int num1 = 651, num2 = 50;
		char operator = '-';
		try {
			double res = Test(num1, operator, num2);
			String format = "{0} {1} {2} = {3}";
			System.out.println(MessageFormat.format(format, num1, operator, num2, res));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}


	}
	/** 기능 : 두정수와 산술 연산자가 주어지면 산술 연산 결과를 알려주는 메소드
	 * @param num1 정수1 
	 * @param operator 산술 연산자
	 * @param num2 정수2
	 * @return 산술 연산 결과
	 * @throws ArithmeticException 0으로 나눌 수 없다
	 * @throws IllegalAccessException 잘못된 연산자 : operator
	 * */
	public static double Test(int num1, char operator, int num2){

		double res;
		switch(operator) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			if(num2 == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			res = num1 / (double)num2;
			break;
		case '%':
			if(num2 == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			res = num1 % num2;
			break;
		default: 
			throw new IllegalAccessError(" 잘못된 연산자 : " + operator);
		}
		return res;
	}

}
