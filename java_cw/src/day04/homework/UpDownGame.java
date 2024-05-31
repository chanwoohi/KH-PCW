package day04.homework;

import java.util.Scanner;

public class UpDownGame {
		// day04_homework
	public static void main(String[] args) {
		/* 1~100 사이의 랜덤한 수를 생성하여 해당 숫자를 맞추는 게임을 작성하세요.
		 * 예 (랜덤한 수가 30)
		 * 정수 입력 : 50
		 * DOWN!
		 * 정수 입력 : 20
		 * UP!
		 * 정수 입력 : 30
		 * 정답입니다!
		 * */
		int min = 1, max = 100;
		int random = (int)(Math.random() * (max - min + 1));
		// System.out.println("랜덤한 수 : " + random); // 랜덤한 수 만들어주는 코드
		
		Scanner scan = new Scanner(System.in);
		
		int i;
		for(i = 1 ; i <= 100 ; i++) {
			System.out.print("정답을 입력하세요 : ");
			i = scan.nextInt();
			if(i > random) {
				System.out.println("DOWN!");
			}
			else if(i < random) {
				System.out.println("UP!");
			}
			else {
				System.out.println("정답입니다.");
				break;
			}
		}
	}

}
