package day24;

public class Ex04 {

	public static void main(String[] args) {
		int score = 90;
		/* A를 판별하는 코드를 작성했는데, A가 아닌 경우에도 A가 출력
		 * 원인 : || 이라서 한쪽만 만족하는 경우에도 실행문 출력
		 * 해결방안 : &&으로 바꾸기
		 * */
		
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}

	}

}
