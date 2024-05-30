package day03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		/* 월을 입력받아 입력받은 월의 계절을 출력 하세요.(switch문 이용하여)
		 * 3, 4, 5 : 봄
		 * 6, 7, 8 : 여름
		 * 9, 10, 11 : 가을
		 * 12, 1, 2 : 겨울
		 * 그 외 : 잘못된 월
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력하세요. : ");
		int month = scan.nextInt();

		
		switch(month) {
		case 3, 4, 5 :
		//case 3: case 4: case 5:
			System.out.println(month + "월은 봄");
			break;
		case 6, 7, 8 :
			System.out.println(month + "월은 여름");
			break;
		case 9, 10, 11 :
			System.out.println(month + "월은 가을");
			break;
		case 12, 1, 2 :
			System.out.println(month + "월은 겨울");
			break;
		default:
			System.out.println("잘못된 월");
		}
		
		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		}
		else if (month >= 6 && month <= 8) {
			System.out.println("여름");
		}
		else if (month >= 9 && month <= 11 ) {
			System.out.println("가을");
		}
		else if (month == 12 || (month >= 1 && month <= 2) ) {
			System.out.println("겨울");
		} 
		else {
			System.out.println("잘못된 월");
		}
	}

}
