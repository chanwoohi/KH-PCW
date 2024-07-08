package teamproject;

import java.util.Scanner;

import program.Program;

public class TicketManager implements Program{
	private Scanner scan = new Scanner(System.in);
	
	@Override
	public void printMenu() {
		System.out.print("메뉴\r\n"
				+ "1. 영화표 예매(구매)\r\n"
				+ "2. 영화표 환불\r\n"
				+ "3. 영화표 조회\r\n"
				+ "메뉴 선택 : ");
	}

	@Override
	public void runMenu(int menu) throws Exception {
		
	}

	@Override
	public void run() {
		
	}

	

}
