package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx13 {
	// 배열 예제 13
	public static void main(String[] args) {
		/* 문자열을 최대 5개 저장할 수 있는 배열을 선언하고,
		 * 문자열을 5개 입력하여 저장 한 후, 저장한 문자열을 출력하는
		 * 예제를 작성하세요.
		 * */
		String text [] = new String [5];
		Scanner scan = new Scanner(System.in);
		for( int i = 0 ; i < text.length ; i++ ) {
			System.out.print("문자열을 입력하세요 : ");
			text[i] = scan.next();
		}
		for(String tmp : text){
			System.out.println(tmp);
		}
		
		
		
	}

}
