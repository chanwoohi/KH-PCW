package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/* 숫자 야구 게임을 구현 하세요.
		 * S : 숫자가 있고 위치가 같은 경우
		 * B : 숫자가 있고 위치가 다른 경우
		 * O : 일치하는 숫자가 하나도 없는 경우 */

		// 중복되지 않은 1~9사이의 3개의 숫자를 생성
		Scanner scan = new Scanner(System.in);

		int min = 1 , max = 9;
		HashSet<Integer> game = new HashSet<Integer>();
		int s, b;
		while(game.size() != 3) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			game.add(random);
		}
		// 중복되지 않은 3개의 숫자 생성 이후, 리스트에 저장 후 셔플
		ArrayList<Integer> listGame = new ArrayList<Integer>();
		listGame.addAll(game);
		Collections.shuffle(listGame);
		System.out.println(listGame);
		//반복문
		do {
			s = 0 ;  b = 0 ;
			// 입력 안내문구 출력
			System.out.print("입력 : ");
			// 3개를 입력
			// 사용자가 숫자 3개를 중복되지 않게 1~9사이의 값을 입력
			ArrayList<Integer> listUser = new ArrayList<Integer>();
			while(listUser.size()!=3) {
				listUser.add(scan.nextInt());
			}
			System.out.println(listUser);

			// 결과 판별 후 출력
			// 스트라이크 또는 볼로 판별
			// 위치가 같으면 스트라이크의 개수를 다르면 볼의 개수를 증가
			for( int i = 0 ; i < listGame.size() ; i++) {
				for( int j = 0 ; j < listUser.size() ; j++ ) {
					if (listGame.get(i) == listUser.get(j)) {
						if( i == j ) {
							s++;
						}
						else {
							b++;
						}
					}
				}
			}

			//입력한 값과 랜덤 값을 이용하여 결과를 출력
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

		}while(s != 3);
		System.out.println("정답입니다.");
	}
}