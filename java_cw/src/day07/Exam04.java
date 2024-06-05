package day07;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		/* Exam01~03 기능을 하나로 합쳐서 다음 기능을 만드세요 
		 *  메뉴
		 * 1. 추가
		 * 2. 검색
		 * 3. 종료
		 * 메뉴 선택 : 1
		 * ---------
		 * 단어 입력 (종료:-1) : abc
		 * 단어를 추가했습니다. / 단어를 추가하지 못했습니다.
		 * 단어 입력 (종료:-1) : -1
		 * 메뉴로 돌아갑니다.
		 * ---------
		 * 메뉴
		 * 1. 추가
		 * 2. 검색
		 * 3. 종료
		 * 메뉴 선택 : 2
		 * ---------
		 * 단어 입력 (종료:-1) : abc
		 * 있는 단어입니다. / 없는 단어입니다.
		 * 단어 입력 (종료:-1) : -1
		 * 메뉴로 돌아갑니다.
		 * ---------
		 * 메뉴
		 * 1. 추가
		 * 2. 검색
		 * 3. 종료
		 * 메뉴 선택 : 0
		 * ---------
		 * 잘못된 메뉴입니다.
		 * ---------
		 * 메뉴
		 * 1. 추가
		 * 2. 검색
		 * 3. 종료
		 * 메뉴 선택 : 3
		 * ---------
		 * 프로그램을 종료합니다.
		 * ---------
		 * */
		Scanner scan = new Scanner(System.in);
		String word; // 추가 / 검색 기능에서 입력할 단어를 저장하는 변수
		String [] list = new String[2];
		int count = 0; // 추가된 단어의 개수
		boolean result; // 검색할 때 있다 없다를 확인할 변수
		int menu;
		do {
			System.out.println("메뉴");
			System.out.println("1. 추가");
			System.out.println("2. 검색");
			System.out.println("3. 종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			
			switch ( menu ) {
			case 1 :
				System.out.println("---------");
				while(true) {
					System.out.print("단어 입력 (종료:-1) : ");
					word = scan.next();
					if(word.equals("-1")) {
						System.out.println("메뉴로 돌아갑니다.");
						System.out.println("---------");
						break;
					}
					if(count == list.length) {
						System.out.println("단어를 추가하지 못했습니다.");
					}
					else {
						list[count] = word;
						count++;
						System.out.println("단어를 추가했습니다.");
					}
				}
				break;
			case 2 :
				System.out.println("---------");
				while(true) {
					System.out.print("단어 입력 (종료:-1) : ");
					word = scan.next();
					if(word.equals("-1")) {
						System.out.println("메뉴로 돌아갑니다.");
						System.out.println("---------");
						break;
					}
					result = false;
					for( int i = 0 ; i < count ; i++ ) {
						String tmp = list[i];
						if(word.equals(tmp)) {
							result = true;
							break;
						}
					}
					if(result) {
						System.out.println("있는 단어입니다.");
					}
					else {
						System.out.println("없는 단어입니다.");
					}
				}
				
				break;
			case 3 :
				System.out.println("---------");
				System.out.println("프로그램을 종료합니다.");
				System.out.println("---------");
				break;
			default :
				System.out.println("---------");
				System.out.println("잘못된 메뉴입니다.");
				System.out.println("---------");
			}
		} while( menu != 3 );
		
	}

}
