package day03;

import java.util.Scanner;

public class NestedIfEx02 {
		//중첩 if문 예제 2
	public static void main(String[] args) {
		
		int num1, num2;
		Scanner scan = new Scanner(System.in);
	
		System.out.print("산술연산자와 두 정수를 입력하세요. : ");
		num1 = scan.nextInt();
		char operator = scan.next().charAt(0);
		num2 = scan.nextInt(); 
	
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
		// num2가 0이면 0으로 나눌 수 없습니다 라고 출력.
		else if(operator == '/') {
			if (num2 != 0) {
				result = (double)num1 / num2;
				System.out.println("" + num1 + " " + operator + " " + num2 + " = " + (result));
			}
			else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
		// num2가 0이면 0으로 나눌 수 없습니다 라고 출력.
		else if(operator == '%') {
			if(num2 != 0) {
				result = num1 % num2;
				System.out.println("" + num1 + " " + operator + " " + num2 + " = " + ((int)result));
			}
			else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
		else {
			System.out.println("는 산술 연산자가 아닙니다.");
		}
	}

}
