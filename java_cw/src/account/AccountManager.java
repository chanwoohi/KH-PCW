package account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import program.Program;

public class AccountManager implements Program{
	//스캐너 생성
	private Scanner scan = new Scanner(System.in);
	//리스트 생성
	List<Account> list = new ArrayList<Account>();

	@Override
	public void printMenu() {
		System.out.print("메뉴\r\n"
				+ "	 * 1. 내역 입력\r\n"
				+ "	 * 2. 내역 수정\r\n"
				+ "	 * 3. 내역 삭제\r\n"
				+ "	 * 4. 내역 조회\r\n"
				+ "	 * 5. 종료\r\n"
				+ "  *--------------------\r\n"
				+ "	 * 메뉴 선택 : ");
	}

	@Override
	public void runMenu(int menu) throws Exception {
		switch(menu) {
		case 1 :
			insert();
			break;
		case 2 :
			update();
			break;
		case 3 :
			delete();
			break;
		case 4 :
			search();
			break;
		case 5 :
			break;
		default :
			System.out.println("잘못된 메뉴 입력 !");
			break;
		}
	}

	public void printBar() {
		System.out.println("--------------------");
	}
	
	private void insert() {
		printBar();
		System.out.println("날짜 : ");
		scan.nextLine();
		String date = scan.nextLine();
		
	}

	private void update() {
		printBar();
	}

	private void delete() {
		printBar();
	}

	private void search() {
		
	}

	@Override
	public void run() {
		int menu = 1;
		do {
			printMenu();
			menu = scan.nextInt();
			try {
				runMenu(menu);
			} catch (Exception e) {
			}
		}while(menu != 5);
	}

}
