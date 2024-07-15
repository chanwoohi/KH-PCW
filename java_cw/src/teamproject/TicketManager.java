package teamproject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import lombok.Data;
import program.Program;

@Data
public class TicketManager implements Program{
	private Scanner scan = new Scanner(System.in);
	
	private List<Movie> list = new ArrayList<Movie>();	// 상영중인 영화 리스트
	private List<String> bookList = new ArrayList<String>(); // 예약 리스트
	
	@Override
	public void printMenu() {
		printBar();
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
			Movie movie1 = new Movie("", null, null)
				
			System.out.print("---영화표 예매(구매)---\r\n"
					+ "1. 영화 이름 선택\r\n"
					+ "2. 영화 상영관 선택\r\n"
					+ "3. 영화 시간 선택\r\n"
					+ "4. 이전 메뉴\r\n"
					+ "메뉴 선택 : ");
			scan.nextLine(); // 공백처리
			buyMenu = scan.nextInt();
			switch(buyMenu) {
			case 1 :
				// 상영중인 영화 리스트 출력
				// 이름 선택
				// 영화 리스트에 이름 있는지 확인 후
				// 없으면 잘못된 영화 선택 출력
				// 있으면 예약리스트에 추가 후 예약되었습니다 출력
				break;
			case 2 :
				// 상영중인 영화 리스트 출력
				// 상영관 선택
				// 영화 리스트에 이름 있는지 확인 후
				// 없으면 잘못된 영화 선택 출력
				// 있으면 예약리스트에 추가 후 예약되었습니다 출력
				break;
			case 3 :
				// 상영중인 영화 리스트 출력
				// 시간 선택
				// 영화 리스트에 이름 있는지 확인 후
				// 없으면 잘못된 영화 선택 출력
				// 있으면 예약리스트에 추가 후 예약되었습니다 출력
				break;
			default:
			}
			break;
			}while( buyMenu != 4);
		case 2 :
			System.out.println("영화표 환불");
			break;
		case 3 :
			// 전체 조회
			System.out.println(list);
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
		
		do {
			printMenu();
			menu = nextInt();
			printBar();
			try {
				runMenu(menu);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}while(menu != 4);
	}

	public int nextInt() {
		try {
			return scan.nextInt();
		}catch(InputMismatchException e) {
			scan.nextLine();
			return Integer.MIN_VALUE;
		}
	}
	
	public void printBar() {
		System.out.println("----------------");
	}
}
