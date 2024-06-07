package day08.homework;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx03 {
	/* 배열에 랜덤으로 1~9 사이의 중복되지 않은 배열을 생성하고 콘솔에 출력하는 코드를 작성하세요.
	 * 단, 메서드 이용
	 * day08.homework.MethodEx01 day08.homework.MethodEx01 day08.MethodEx05를 합친 예제
	 * */
	public static void main(String[] args) {
		int num = 8;
		System.out.println(Arrays.toString(random(num)));

	}
	/**기능 	  : 입력한 정수 n의 크기만큼 배열에 랜덤으로 1~9 사이의 중복되지 않은 배열을 생성하는 메서드
	 * 매개변수 : 크기를 결정하는 정수 n => int n
	 * 리턴타입 : n만큼의 크기를 가지고 1~9까지의 수 중 중복되지 않은 숫자를 저장한 배열 => int[]
	 * 메서드명 : random
	 */
	public static int[] random(int n) {
		//입력한 n 만큼의 크기를 가진 배열 생성
		int [] answer = new int [n];
		// 각 번지에 중복되지 않게 1~9 사이의 랜덤한 수 넣기
		int count = 0; // 저장된 숫자의 개수
		int i; 
		int min = 1, max = 9;
		int random;
		boolean result = false;
		while(count < n) {
			random = (int)(Math.random() * (max - min + 1) + min );
			for( i = 0 ; i < count ; i++) {
				// 중복된 수가 나오면 break로 빠져 나가면서 랜덤한 수 다시 생성
				if( answer[i] == random) {
					break;
				}
			}
			if(i == count) {
				answer[count] = random;
				count++;
			}
		}
		return answer;
	}
}
