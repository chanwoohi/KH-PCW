package day03;

import java.util.Scanner;

public class IfExam03 {
	/* If 문 테스트 3
	 * 산술 연산자와 두 정수를 입력받아 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요.
	 * 예 :
	 * 두 정수와 산술 연산자를 입력하세요 ( 예 : 1 + 2 ) : 1 + 2 [엔터]
	 * 1 + 2 = 3
	 * */
	public static void main(String[] args) {
		//Scanner를 이용하여 두 정수와 산술연산자를 입력
		// 산술 연산자를 문자로 입력
			int num1, num2;
			Scanner scan = new Scanner(System.in);
		
			System.out.print("산술연산자와 두 정수를 입력하세요. : ");
			num1 = scan.nextInt();
			char operator = scan.next().charAt(0);
			num2 = scan.nextInt(); // 순서대로 하는게 좋음.
			
			
			
		/*	연산자가 + 이면 두 정수의 합을 출력하고
		 * 	아니면 연산자가 - 이면 두 정수의 차를 출력하고
		 *  아니면 연산자가 * 이면 두 정수의 곱을 출력하고
		 *  아니면 연산자가 / 이면 두 정수의 나눈 결과를 출력하고
		 *  아니면 연산자가 % 이면 두 정수의 나머지 결과를 출력하고
		 *  아니면 잘못된 연산자입니다라고 출력하는 코드
		 * */
			double result;
			if(operator == '+') {
				result = num1 + num2;
				System.out.println("" + num1 + " " + operator + " " + num2 + " = " + ((int)result));
			}
			else if(operator == '-') {
				result = num1 - num2;
				System.out.println("" + num1 + " " + operator + " " + num2 + " = " + ((int)result));
			}
			else if(operator == '*') {
				result = num1 * num2;
				System.out.println("" + num1 + " " + operator + " " + num2 + " = " + ((int)result));
			}
			else if(operator == '/') {
				result = (double)num1 / num2;
				System.out.println("" + num1 + " " + operator + " " + num2 + " = " + (result));
			}
			else if(operator == '%') {
				result = num1 % num2;
				System.out.println("" + num1 + " " + operator + " " + num2 + " = " + ((int)result));
			}
			else {
				System.out.println("는 산술 연산자가 아닙니다.");
			}
	}

}
