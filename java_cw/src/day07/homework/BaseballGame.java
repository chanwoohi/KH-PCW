package day07.homework;

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
		// 중복되지 않은 3개의 숫자 생성해서 배열에 넣기
		int count = 0;
		int list [] = new int[3];
		int min = 1, max = 9;
		int i;
		while(count < 3) {
			//랜덤한 수 생성
			int random = (int)(Math.random() * (max - min + 1) + min );
			for( i = 0 ; i < count ; i++) {
				for( list[i] == random) {
					
				}
			}
			
			
			
			
			
			
			
			
			
		}
		// 배열에 있는 숫자와 입력된 숫자 비교
		

	}

}
