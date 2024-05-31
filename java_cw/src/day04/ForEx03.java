package day04;

import java.util.Scanner;

public class ForEx03 {
		//for 문 예제3
	public static void main(String[] args) {
		/* 문자를 입력 받고 입력받은 문자가 y이면 종료하는 코드를 작성하세요. (for문 이용)
		 * */
		char ch;
		Scanner scan = new Scanner(System.in);
		for( ch = 'a' ; ch != 'y' ; ) {
			System.out.print("문자 입력. : ");
			 ch = scan.next().charAt(0);
		}
		
	}

}
