package day24;

public class Ex06 {

	public static void main(String[] args) {
		
		/* 1부터 10까지 출력하는 코드를 작성하려고 했다
		 * 원인 : 증감식이 존재 하지 않아서 무한루프에 빠짐
		 * 해결방법 : ( int i = 1 ; i <= 10 ; i++ ) 로 바꿔야함 
		 * */
		for(int i = 0 ; i <=10 ;) {
			System.out.println(i);
		}

	}

}
