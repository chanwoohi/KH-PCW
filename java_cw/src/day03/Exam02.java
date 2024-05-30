package day03;

import java.util.Scanner;

public class Exam02 {
	/*	테스트 2
	 *	학생 3명의 성적을 입력받아 총점과 평균을 구하는 코드를 작성하세요.
	 *	예시 
	 *	과목1 성적 입력 : 80
	 *	과목2 성적 입력 : 80
	 *	과목3 성적 입력 : 90
	 *	총점 : 250점 평균 : 83.3333333
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생1 성적 입력 : ");
		int score1 = scan.nextInt();
		
		System.out.print("학생2 성적 입력 : ");
		int score2 = scan.nextInt();
		
		System.out.print("학생3 성적 입력 : ");
		int score3 = scan.nextInt();
		
		int sum = score1 + score2 + score3;
		float avg = sum / 3F; /// double avg = sum / 3.0; <<= 도 가능
		System.out.print("총점 :" + sum + "점 평균 :" + avg);
		
		
		
		

	}

}
