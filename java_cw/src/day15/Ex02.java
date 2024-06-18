package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/* 다음 기능을 가진 프로그램을 작성하세요.
		 * 메뉴
		 * 1. 번호 추가
		 * 2. 번호 삭제
		 * 3. 번호 조회 (sysout(list))로 대체
		 * 4. 종료
		 * */
		final int ADD = 1;
		final int DELETE = 2;
		final int SEARCH = 3;
		final int EXIT = 4;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String> ();
		int menu;
		do {
			printMenu();
			menu = scan.nextInt();
			switch (menu) {
			case ADD :
				System.out.print("번호 입력 : ");
				String number1 = scan.next();
				if(list.contains(number1)) {
					System.out.println("이미 등록된 번호입니다.");
				}
				else {
					System.out.println("번호를 등록했습니다.");
					list.add(number1);
				}
				break;
			case DELETE :
				System.out.print("번호 입력 : ");
				String number2 = scan.next();
				if(list.remove(number2)) {
					System.out.println("번호를 삭제했습니다.");
				}
				else {
					System.out.println("일치하는 번호가 없습니다.");
				}
				break;
			case SEARCH :
				System.out.println(list);
				break;
			case EXIT :
				System.out.println("프로그램을 종료");
				break;
			default :
			}
			
		}
		while(menu != EXIT);
	}
	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 번호 추가");
		System.out.println("2. 번호 삭제");
		System.out.println("3. 번호 조회");
		System.out.println("4. 종료");
		System.out.print("메뉴 선택 : ");
	}
}
