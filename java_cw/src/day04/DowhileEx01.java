package day04;

import java.util.Scanner;

public class DowhileEx01 {
		// do-while 문 예제 1
	public static void main(String[] args) {
		//y를 입력하면 종료하는 코드를 작성하세요.
		Scanner scan = new Scanner(System.in);
		char ch;
		do {
			System.out.print("문자 입력 : ");
			ch = scan.next().charAt(0);
		}while(ch != 'y');
		
	
	}

}
