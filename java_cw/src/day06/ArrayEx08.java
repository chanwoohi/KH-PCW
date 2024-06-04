package day06;

import java.util.Scanner;

public class ArrayEx08 {
	// 배열 예제 8
	public static void main(String[] args) {
		/* 2단의 결과값인 2,4,6,8, ... ,18을 배열에 저장하고
		 * 배열에 있는 값을 이용하여 구구단 2단을 출력하는 예제
		 * */
		int num = 2;
		int arr [] = new int[9];
		// 배열에 2부터 18까지 저장하는 작업
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = num * (i + 1);
			// 배열에 있는 값을 이용하여 2단을 출력
			System.out.println(num + " X " + (i + 1) + " = " + arr[i]);
		}
		System.out.println();
		
		int i = 0 ;
		while( i < arr.length) {
			System.out.println(num + " X " + (i + 1) + " = " + arr[i]);
			i++;
		}
		// 10개짜리 배열을 만들어서 0번지를 사용하지 않고 1번지부터 사용
		int arr2[] = new int [10];
		
		//배열에 2부터 18까지 저장하는 작업
		for( i = 1 ; i < arr2.length ; i++) {
			arr2[i] = 2 * i ;
		}
		//배열에 있는 값을 이용하여 2단을 출력
		for( i = 1 ; i < arr2.length ; i++ ) {
			System.out.println(num + " X " + i + " = " + arr2[i]);
		}	
		
			
		}

}
