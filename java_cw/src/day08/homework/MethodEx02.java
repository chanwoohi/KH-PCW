package day08.homework;

import java.util.Arrays;

public class MethodEx02 {
	/* 1~9사이의 랜덤한 수를 배열에 저장하여 콘솔에 출력하는 코드를 작성하세요
	 * 메서드를 이용
	 * */
	/**
	 * 기능    : 입력한 정수 n 크기만큼의 배열에 1~9 사이의 랜덤한 수를 생성하여 저장하는 메서드
	 * 매개변수 : 크기 정수 n => int n 
	 * 리턴타입 : n 크기만큼의 배열  => int []
	 * 메서드명 : random
	 * */
	public static int[] random(int n) {
		int answer[] = new int[n];
		// i는 0부터 n-1 만큼의 번지만큼 랜덤한 수 저장
		int min = 1, max = 9;	
		for( int i = 0 ; i < n ; i++ ) {
			answer[i] = (int)(Math.random() * (max - min + 1) + min );
		}
		return answer;
	}
	
	public static int random( int min , int max ) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		int random = (int)(Math.random() * ( max - min + 1 ) + min );
		return random;
	}
	
	public static int[] createRandomArray( int size , int min, int max) {
		if( size < 0 ) {
			return null;
		}
		int [] arr = new int [size];
		for( int i = 0 ; i < size ; i++ ) {
			arr[i] = random(min, max);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int size = 5;
		int []arr = createRandomArray(size, 1, 9);
		System.out.println(Arrays.toString(arr));

	}

}
