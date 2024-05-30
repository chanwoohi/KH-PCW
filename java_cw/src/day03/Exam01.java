package day03;

import java.util.Scanner;

	/* 테스트 1
	 * 60점 이상이면 Pass 아니면 Fail	
	*/
public class Exam01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		String result = (score >= 60)? "Pass" : "Fail";
		System.out.print(score + "점은 " + result);
		
	}

}
