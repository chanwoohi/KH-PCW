package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx01 {
	// 배열 예제 1
	public static void main(String[] args) {
		/* 3명의 학생의 국어, 영어, 수학 성적을 입력받고
		 * 각 학생의 평균을 구하는 코드를 작성하세요.
		 * */
		// 스캐너 생성
		Scanner scan = new Scanner(System.in);
		// 학생(i + 1)의 성적을 입력하세요(국어, 영어, 수학 순) : 
		int [] kor, eng, math;
		int studentCount = 3;
		kor = new int[studentCount];
		eng = new int[studentCount];
		math = new int[studentCount];
		for( int i = 0 ; i < studentCount ; i++ ) {
			System.out.print("학생" + (i + 1) + "의 성적을 입력하세요(국어, 영어, 수학 순) : ");
			kor[i] = scan.nextInt();
			eng[i] = scan.nextInt();
			math[i] = scan.nextInt();
		}

		// 학생1의 평균 : 
		// 학생2의 평균 :
		// 학생3의 평균 : 
		for( int i = 0 ; i < studentCount ; i++ ) {
			double avg = (kor[i] + eng[i] + math[i]) / (double)3.0;
			System.out.println("학생" + (i + 1) + "의 평균 : " + avg );
		}
		/* 각 과목의 평균을 구하는 코드를 작성하세요.
		 * 국어 평균 :
		 * 영어 평균 :
		 * 수학 평균 :
		 * */
		int sum = 0;
		for( int tmp : kor ) {
			sum += tmp;
		}
		System.out.println("국어 평균 : " + sum / (double)studentCount );
		sum = 0;
		for( int tmp : eng ) {
			sum += tmp;
		}
		System.out.println("영어 평균 : " + sum / (double)studentCount );
		sum = 0;
		for( int tmp : math ) {
			sum += tmp;
		}
		System.out.println("수학 평균 : " + sum / (double)studentCount );

	}
}
