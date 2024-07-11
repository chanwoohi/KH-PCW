package teamproject;

import java.util.Scanner;

import lombok.Data;
import program.Program;

@Data
public class TicketManager implements Program{
	private Scanner scan = new Scanner(System.in);
	
	@Override
	public void printMenu() {
		System.out.print("메뉴\r\n"
				+ "1. 영화표 예매(구매)\r\n"
				+ "2. 영화표 환불\r\n"
				+ "3. 영화표 조회\r\n"
				+ "4. 프로그램 종료\r\n"
				+ "메뉴 선택 : ");
	}

	@Override
	public void runMenu(int menu) throws Exception {
		int buyMenu;
		switch(menu) {
		case 1 :
			do {
			System.out.print("영화표 예매(구매)"
					+ "1. 영화 이름 선택\r\n"
					+ "2. 영화 상영관 선택\r\n"
					+ "3. 영화 시간 선택"
					+ "4. 프로그램 종료"
					+ "메뉴 선택 : ");
			buyMenu = scan.nextInt();
			switch(buyMenu) {
			case 1 :
				break;
			case 2 :
				break;
			case 3 :
				break;
			default:
			}
			break;
			}while( buyMenu != 4);
		case 2 :
			System.out.println("영화표 환불");
			break;
		case 3 :
			System.out.println("영화표 조회");
			break;
		case 4 :
			System.out.println("프로그램 종료");
			break;
		default :
			System.out.println("잘못된 번호 입력");
		}
	}
	@Override
	public void run() {
		int menu = 1;
		Scanner scan = new Scanner(System.in);
		do {
			printMenu();
			menu = scan.nextInt();
			try {
				runMenu(menu);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}while(menu != 4);
	}

	

}
