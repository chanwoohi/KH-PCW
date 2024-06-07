package day07.homework;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		/* 숫자 야구 게임을 구현하세요.
		 * 규칙
		 * - 중복되지 않은 1 ~ 9 사이의 랜덤한 수를 생성
		 * - 스트라이크 : 해당 숫자가 있고, 위치도 같은 경우
		 * - 볼 : 숫자가 있지만, 위치가 다른경우
		 * - 아웃 : 일치하는 숫자가 하나도 없는 경우
		 * 예시
		 * (3 9 7)
		 * 입력 : 1 2 3
		 * 1B
		 * 입력 : 5 6 7
		 * 1S
		 * 입력 : 4 5 6
		 * O
		 * 입력 : 3 7 9
		 * 1S2B
		 * 입력 : 3 9 7
		 * 3S
		 * 정답입니다.
		 * */
		// 중복되지 않은 3개의 랜덤한 숫자 생성해서 배열에 넣기
		int count = 0;
		int list [] = new int[3];
		int min = 1, max = 9;
		int random;
		int i, s = 0 , b = 0 ;;
		Scanner scan = new Scanner(System.in);
		while(count < 3) {
		//랜덤한 수 생성
			random = (int)(Math.random() * (max - min + 1) + min );
			for( i = 0 ; i < count ; i++) {
				if( list[i] == random) {
					break;
				}
			}
			if(i == count) {
				list[count] = random;
				count++;
			}
		}
		System.out.println(Arrays.toString(list));
		int [] user = new int [3];
		// 반복문을 이용하여 정수 3개를 입력 받은 후 판별 (다 맞출 때 까지)
		do {
			s = 0 ;  b = 0 ;
			// 입력 안내문구 출력
			System.out.print("입력 : ");
			// 3개를 입력
			for( i = 0 ; i < user.length ; i ++) {
				user[i] = scan.nextInt();
			}
			// 결과 판별 후 출력
			// 스트라이크 또는 볼로 판별
			// 위치가 같으면 스트라이크의 개수를 다르면 볼의 개수를 증가
			
			for( i = 0 ; i < list.length ; i++) {
				for( int j = 0 ; j < user.length ; j++ ) {
					if (list[i] == user[j]) {
						if( i == j ) {
							s++;
						}
						else {
							b++;
						}
					}
				}
			}
			
			// 스트라이크와 볼의 개수를 이용하여 결과를 출력
			if( s != 0 ) {
				System.out.print(s + "S");
			}
			if( b != 0 ) {
				System.out.print(b + "B");
			}
			if( s == 0 && b == 0) {
				System.out.print("O");
			}
			System.out.println();
		} while ( s != 3 );
		System.out.println(" 정답입니다. ");
	}

}
