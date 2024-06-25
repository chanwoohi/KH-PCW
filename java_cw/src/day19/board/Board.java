package day19.board;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;

@Data
public class Board implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// 제목, 내용, 작성자, 비번, 조회수 
	private String title;
	private String contents;
	private String id;
	private String pw;
	private int view;
	
	// 게시글 번호
	private int num;
	
	// 게시글 번호를 생성할 때 활용
	private static int count = 0;
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count1) {
		count = count1;
	}
	
	// 이 생성자를 이용할 때만 게시글 번호를 1 증가하도록 함.
	public Board(String title, String contents, String id, String pw) {
		this.title = title;
		this.contents = contents;
		this.id = id;
		this.pw = pw;
		this.num = ++count;
	}
	
	//번호만 있는 생성자, 수정, 삭제에서 번호를 선택했을 때 리스트에 있는 게시글을 쉽게 찾기 위해서 추가
	public Board(int num) {
		this.num = num;
	}
	
	// 번호가 같아야 같은 객체로 판별
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		return num == other.num;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(num);
	}
	
	//제목과 내용을 수정하는 메소드
	public void update(String title, String Contents) {
		this.title = title;
		this.contents = contents;
	}

	@Override
	public String toString() {
		return num + ". " + title + " / " + id + " / " + view;
	}
	
	//조회수 1 증가하고 게시글 상세 조회하는 메소드
	public void print() {
		System.out.println("제목 : " + title);
		System.out.println("작성자 : " + id);
		System.out.println("내용 : " +  contents);
		System.out.println("조회수 : " + ++view);
	}
	//아이디, 비번이 주어지면 게시글의 아이디 비번과 같은지 확인하는 메소드
	public boolean checkWriter(String id, String pw) {
		return this.id.equals(id) && this.pw.equals(pw);
	}
}
