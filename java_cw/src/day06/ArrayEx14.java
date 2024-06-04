package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx14 {
	// 배열 예제 4
	public static void main(String[] args) {
		String [] list = {"dog", "cat", "java", "cup", "computer"};
		//문자열을 입력받아 입력받은 문자열이 있는지 없는지 알려주는 코드를 작성하세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");
		String voca = scan.next();

		
		boolean result = false;
		for( int i = 0 ; i < list.length ; i++ ) {
			if( voca.equals(list[i]) ) {
				result = true;
				break;
			}
		}
		if(result) {
			System.out.println("문자열이 있습니다.");
		}
		else {
			System.out.println("문자열이 없습니다.");
		}
		
		
		
		
		
	}

}
