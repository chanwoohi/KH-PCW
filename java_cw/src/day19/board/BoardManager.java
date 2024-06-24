package day19.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import program.Program;

public class BoardManager implements Program{

	private Scanner scan = new Scanner(System.in);
	private List<Board> list = new ArrayList<Board>();

	private String fileName = "src/day19/board/data.txt";

	private final int INSERT = 1;
	private final int UPDATE = 2;
	private final int DELETE = 3;
	private final int SEARCH = 4;
	private final int EXIT = 5;



	public void printBar() {
		System.out.println("------------------------");
	}



	@Override
	public void printMenu() {
		System.out.print("------------------------\r\n"
				+ "메뉴\r\n"
				+ "1. 게시글 등록\r\n"
				+ "2. 게시글 수정\r\n"
				+ "3. 게시글 삭제\r\n"
				+ "4. 게시글 검색\r\n"
				+ "5. 프로그램 종료\r\n"
				+ "------------------------\r\n"
				+ "메뉴 선택 : ");
	}


	@Override
	public void run() {
		int menu;
		load(fileName);
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = scan.nextInt();
			printBar();
			//선택한 메뉴 실행
			try {
				runMenu(menu);
			} catch (Exception e) {
				System.out.println("예외가 발생했습니다.");
				e.printStackTrace();
			}
		}while(menu != EXIT);

		save(fileName);
	}


	@Override
	public void save(String fileName) {

	}
	
	@Override
	public void load(String fileName) {

	}

	@Override
	public void runMenu(int menu) throws Exception {

		switch(menu) {
		case INSERT:
			insertBoard();
			System.out.println(list);
			break;
		case UPDATE:
			updateBoard();
			break;
		case DELETE:
			deleteBoard();
			break;
		case SEARCH:
			searchBoard();
			break;
		case EXIT:
			exit();
			break;
		default:
		}
	}

	private void exit() {
		printBar();
		System.out.println("프로그램을 종료합니다.");
		printBar();
		
	}
	private void insertBoard() {
		//게시글 정보를 입력
		//입력한 정보를 이용해서 게시글 객체를 생성
		Board board = inputBoard();

		//생성한 게시글 객체를 리스트에 추가
		list.add(board);

		//알림문구를 출력
		printBar();
		System.out.println(board.getNum() + "번 게시글이 등록 되었습니다.");

	}

	private Board inputBoard() {
		System.out.print("제목 : ");
		scan.nextLine();//공백 처리
		String title = scan.nextLine(); // nextLine인 이유? 공백도 포함시키려고 
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		System.out.print("작성자 : ");
		String id = scan.next();
		System.out.print("비번 : ");
		String pw = scan.next();

		return new Board(title, contents, id, pw);
	}

	private void updateBoard() {
		printBar();
		//수정할 게시글 번호를 입력
		System.out.print("수정할 게시글 번호 입력 : ");
		int num = scan.nextInt();
		printBar();

		Board board = selectBoard(num);
		if(board == null) {
			return;
		}
		printBar();
		//같으면 새 제목과 내용을 입력
		scan.nextLine();
		System.out.print("제목 : ");
		String title = scan.nextLine();
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		//가져온 객체의 제목과 내용을 입력받은 제목과 내용으로 수정
		board.update(title, contents);
		//안내문구 출력
		printBar();
		System.out.println(board.getNum() + "번 게시글이 수정되었습니다.");

	}

	private Board selectBoard(int num) {
		//입력한 게시글 번호를 이용하여 게시글 객체를 생성
		Board board = new Board(num);
		//리스트에서 생성한 객체가 몇번지에 있는지 번지를 가져옴
		int index = list.indexOf(board);
		//일치하는 객체가 없으면(가져온 번지가 0보다 작으면) 알림문구 출력 후 종료
		if((index) < 0) {
			printBar();
			System.out.println("등록되지 않거나 삭제된 게시글입니다. ");
			return null;
		}
		//아이디, 비번을 입력 받음
		System.out.print("아이디 : ");
		String id = scan.next();
		System.out.print("비번 : ");
		String pw = scan.next();
		//가져온 객체의 아이디와 비번이 입력받은 아이디와 비번과 같은지 확인해서
		//같지 않으면 안내문구 출력 후 종료
		board = list.get(index);
		if(!board.checkWriter(id, pw)) {
			printBar();
			System.out.println("아이디 또는 비번이 일치하지 않습니다.");
			return null;
		}
		return board;
	}
	private void deleteBoard() {
		printBar();
		//삭제할 게시글 번호를 입력
		System.out.print("삭제할 게시글 번호 입력 : ");
		int num = scan.nextInt();
		printBar();
		Board board = selectBoard(num);
		if(board == null) {
			return;
		}
		printBar();
		//리스트에서 게시글을 삭제
		list.remove(board);
		System.out.println(board.getNum() + "번 게시글이 삭제되었습니다.");
	}

	private void searchBoard() {
		//검색어 입력
		System.out.print("검색어 입력 : ");
		String search = scan.nextLine();
		
		//게시글에서 검색어가 제목 또는 내용에 들어간 게시글 리스트를 가져옴
		List<Board> searchList = new ArrayList<Board>();
		searchList.contains(search);
		System.out.println(search);
		//게시글 리스트가 비어 있으면 안내문구 출력 후 종료
		
		//가져온 게시글 리스트를 출력
		
		//게시글을 확인할건지 선택
		
		//확인하지 않겠다고 하면 종료
		
		//확인하면 게시글 번호를 입력
		
		//입력받은 게시글 번호로 객체를 생성
		
		//검색 리스트에서 생성된 객체와 일치하는 번지를 확인
		
		//번지가 유효하지 않으면 안내문구 출력 후 종료
		
		//번지에 있는 게시글을 가져옴
		
		//가져온 게시글을 출력
		
		//메뉴로 돌아가려면... 문구 출력
		
		//엔터를 입력받도록 처리
		
	}
}