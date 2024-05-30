package day03;

import java.util.Scanner;

public class IfExam06 {
		/* If문 테스트 6
		 * 성적을 입력 받아 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * 90점 이상 ~ 100점 이하 : A
		 * 80점 이상 ~ 90점 미만 : B
		 * 70점 이상 ~ 80점 미만 :	C
		 * 60점 이상 ~ 70점 미만 :	D
		 * 60점 미만 : F
		 * 0보다 작거나 100보다 큰 경우 : 잘못된 성적입니다.
		 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력. : ");
		int score = scan.nextInt();
		/*	조건식이 짧은 대신 순서가 중요하게 하는 방법.
		 * 	성적이 0보다 작거나 100보다 크면 잘못된 성적입니다.' 라고 먼저 출력하고
		 * 	아니면 성적이 90점 이상이면, A라고 출력하고
		 * 	아니면 성적이 80점 이상이면, B라고 출력하고
		 * 	아니면 성적이 70점 이상이면, C라고 출력하고
		 * 	아니면 성적이 60점 이상이면, D라고 출력하고
		 * 	아니면 F라고 출력
		 * */
			if( score < 0 || score > 100) {
				System.out.println("잘못된 성적입니다.");
			}
			//여기까지 왔다면 score는 0이상 100이하
			else if(score >= 90) {
				System.out.println("A");
			}
			//여기까지 왔다면 score는 0이상 90미만
			else if(score >= 80) {
				System.out.println("B");
			}
			//여기까지 왔다면 score는 0이상 80미만
			else if(score >= 70) {
				System.out.println("C");
			}
			//여기까지 왔다면 score는 0이상 70미만
			else if(score >= 60) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
	
		
		
		
			if (score >= 90 && score <= 100) {
				System.out.println("A");
			}
			else if (score >= 80 && score < 90) {
				System.out.println("B");
			}
			else if (score >= 70 && score < 80) {
				System.out.println("C");
			}
			else if (score >= 60 && score < 70) {
				System.out.println("D");
			}
			else if (score >= 0 && score < 60) {
				System.out.println("F");
			}
			else {
				System.out.println("잘못된 성적입니다.");
			}
	}

}
