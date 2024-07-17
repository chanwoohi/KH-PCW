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
	private List<Movie> bookList = new ArrayList<Movie>(); // 예약 리스트
	
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
				printBar();
				System.out.print("영화표 예매(구매)\r\n"
						+ "1. 영화 이름 선택\r\n"
						+ "2. 영화 상영관 선택\r\n"
						+ "3. 영화 시간 선택\r\n"
						+ "4. 이전 메뉴\r\n"
						+ "메뉴 선택 : ");
				buyMenu = nextInt();
				switch(buyMenu) {
				case 1 :
					// 상영중인 영화 리스트 출력
					printBar();
					System.out.println("상영중인 영화 목록");
					for(int i = 0 ; i < list.size() ; i++) {
						System.out.println(list.get(i));						
					}
					// 이름 선택
					scan.nextLine();
					System.out.print("영화 제목 입력 : ");
					String movieName = scan.nextLine();
					// 영화 리스트에 이름 있는지 확인하기 위해 반복문으로 입력받은 movieName 을 포함하는 객체를 찾아서
					int count = 0;
					// 예약 되었을 시에 출력할 String 선언
					String str = "";
					for(int i = 0 ; i < list.size(); i++) {
						if(list.get(i).getMovieName().contains(movieName)) {
							// count 증가시키고, 예약 리스트에 해당 리스트 객체 저장
							count++;
							bookList.add(list.get(i));
							str = list.get(i).getMovieName();
						}
					}
					// count 0 보다 크면, 예약되었습니다 출력
					if(count > 0) {
						printBar();
						System.out.println( str + " 예약되었습니다");
					}
					// 아니면 잘못된 영화 입력
					else {
						printBar();
						System.out.println("잘못된 영화 제목 입력");
					}
					break;
				case 2 :
					// 상영중인 영화 리스트 출력
					printBar();
					System.out.println("상영중인 영화 목록");
					for(int i = 0 ; i < list.size() ; i++) {
						System.out.println(list.get(i));						
					}
					// 상영관 선택
					scan.nextLine();
					System.out.print("상영관 입력 : ");
					String movieTheater = scan.next();
					// 영화 리스트에 상영관 있는지 확인 후
					count = 0;
					str = "";
					for(int i = 0 ; i < list.size(); i++) {
						if(list.get(i).getTheater().contains(movieTheater)) {
							// count 증가시키고, 예약 리스트에 해당 리스트 객체 저장
							count++;
							bookList.add(list.get(i));
							str = list.get(i).getMovieName();
						}
					}
					// count 0 보다 크면, 예약되었습니다 출력
					if(count > 0) {
						printBar();
						System.out.println(str + " 예약되었습니다");
					}
					// 아니면 잘못된 상영관 입력 출력
					else {
						printBar();
						System.out.println("잘못된 상영관 입력");
					}
					break;
				case 3 :
					// 상영중인 영화 리스트 출력
					printBar();
					System.out.println("상영중인 영화 목록");
					for(int i = 0 ; i < list.size() ; i++) {
						System.out.println(list.get(i));						
					}
					// 시간 선택
					scan.nextLine();
					System.out.print("영화 시간 입력 : ");
					String movieTime = scan.nextLine();
					// 영화 리스트에 해당 영화 시간 있는지 확인 후
					count = 0;
					str = "";
					for(int i = 0 ; i < list.size(); i++) {
						if(list.get(i).getDate().contains(movieTime)) {
							// count 증가시키고, 예약 리스트에 해당 리스트 객체 저장
							count++;
							bookList.add(list.get(i));
							str = list.get(i).getMovieName();
						}
					}
					// count 0 보다 크면, 예약되었습니다 출력
					if(count > 0) {
						printBar();
						System.out.println(str + " 예약되었습니다");
					}
					// 아니면 잘못된 영화 입력
					else {
						printBar();
						System.out.println("잘못된 영화 제목 입력");
					}
					break;
				default:
				}
			}while( buyMenu != 4 );
			break;
		case 2 :
			System.out.println("영화표 환불 구현 예정입니다");
			break;
		case 3 :
			// 예약 전체 조회 // 예약리스트 반복문 이용해서 깔끔하게
			printBar();
			for(int i = 0 ; i < bookList.size() ; i ++) {
				System.out.println(bookList.get(i));				
			}
			break;
		case 4 :
			System.out.println("프로그램을 종료합니다");
			break;
		default :
			System.out.println("잘못된 번호 입력입니다");
		}
	}
	@Override
	public void run() {
		/*
		 * 세이브 로드 도입하면 바꿔야함
		 * */
		Movie movie1 = new Movie("인사이드아웃2", "1관", "12:00 ~ 13:00");
		Movie movie2 = new Movie("탈주", "2관", "13:30 ~ 14:30");
		Movie movie3 = new Movie("핸섬가이즈", "3관", "15:00 ~ 16:00");
		Movie movie4 = new Movie("하이재킹", "4관", "17:00 ~ 18:00");

		list.add(movie1);
		list.add(movie2);
		list.add(movie3);
		list.add(movie4);
		int menu = 1;
		
		do {
			printMenu();
			menu = nextInt();
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
