package day03;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		/* 산술 연산자와 두 정수를 입력받아 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요. (switch 문 으로)
		 * 예 :
		 * 두 정수와 산술 연산자를 입력하세요 ( 예 : 1 + 2 ) : 1 + 2 [엔터]
		 * 1 + 2 = 3
		 * */
		int num1, num2;
		Scanner scan = new Scanner(System.in);
	
		System.out.print("산술연산자와 두 정수를 입력하세요. : ");
		num1 = scan.nextInt();
		char operator = scan.next().charAt(0);
		num2 = scan.nextInt();
		
		switch(operator) {
			case '+':
				int result1 = num1 + num2; 
				System.out.println("" + num1 + operator + num2 + " = " + (int)result1);
				break;
			case '-':
				int result2 = num1 - num2; 
				System.out.println("" + num1 + operator + num2 + " = " + (int)result2);
				break;
			case '*':
				int result3 = num1 * num2; 
				System.out.println("" + num1 + operator + num2 + " = " + (int)result3);
				break;
			case '/':
				double result4 = (double)num1 / num2; 
				System.out.println("" + num1 + operator + num2 + " = " + result4);
				break;
			case '%':
				int result5 = num1 % num2; 
				System.out.println("" + num1 + operator + num2 + " = " + (int)result5);
				break;
			default: 
				System.out.println("잘못된 산술 연산자입니다.");
		}

	}

}
