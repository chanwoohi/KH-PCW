package day24;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/* 문자열을 입력받아 exit가 아니면 입력한 문자열을 출력하고, exit이면 종료하는 코드를 작성하려고 했다.
		 * 원인 1 : res가 처음부터 false로 선언 되어있어서 while문이 시작도 안함
		 * 해결방법 1 : res를 true로 선언
		 * 원인 2: if문의 조건을 만족해도 종료되지 않음
		 * 해결방법 2: continue가 아니라 break 사용
		 * 원인 3: 문자열을 ==로 비교함
		 * 해결방법 3: ==를 equals로 수정
		 * */
		Scanner scan = new Scanner(System.in);
		boolean res = false;
		while(res) {
			System.out.print("문자열 입력 : ");
			String str = scan.next();
			if(str == "exit") {
				continue;
			}
			System.out.println(str);
		}
		
	}

}
