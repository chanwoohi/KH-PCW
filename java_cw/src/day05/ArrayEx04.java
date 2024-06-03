package day05;

import java.util.Scanner;

public class ArrayEx04 {
	// 배열 예제 4
	public static void main(String[] args) {
		/* 3개의 정수를 입력을 받아 배열에 저장하고, 역순으로 출력하는 코드를 작성하세요
		 * */
		
		Scanner scan = new Scanner(System.in);
		int array[] = new int[3];
		
		for(int i=0 ; i < array.length; i++) {
			System.out.print("정수를 입력 하세요 : ");
			array[i] = scan.nextInt();
		}
		for(int i=0 ; i < array.length; i++) {
			// i=0 => 2번지
			// i=1 => 1번지
			// i=2 => 0번지
			//        2 - i번지 => 배열의 길이 - 1 - i번지
			System.out.print(array[array.length - i  -1] + " ");
		}
		System.out.println();
		//역순으로 출력
		for(int i=array.length -1 ; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

}
