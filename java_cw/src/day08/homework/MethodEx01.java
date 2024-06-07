package day08.homework;

import java.util.Arrays;

public class MethodEx01 {
	/* 정수 n을 입력받아 입력받은 n 크기를 가지는 배열을 생성하는 코드를 작성하세요.
	 * 메서드를 이용 */
	
	
	/* 기능    : 정수 n을 입력받아서 입력받은 n 크기를 가지는 배열을 생성하는 메서드
	 * 매개변수 : 정수 n => int n
	 * 리턴타입 : n 크기를 가진 배열 => int[]
	 * 메서드명 : array
	 * */
	public static int[] array(int n) {
		int answer[] = new int[n];
		return answer;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		System.out.println(Arrays.toString(array(num)));
	}

}
