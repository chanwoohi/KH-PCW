package day06;

import java.util.Scanner;

public class ArrayEx11 {
	// 배열 예제 11
	public static void main(String[] args) {
		/* 4과목의 성적을 입력받아 배열에 저장하고, 과락(40점 미만)이 없고 평균이 60점이 넘으면 Pass, 아니면 Fail이라고 출력하세요.
		 * */
		//	4개짜리 배열 생성
		int arr [] = new int [4] ;
		/* 성적 4개를 입력
		 * 반복횟수 : i는 0부터 scroe.length보다 작을 때까지 1씩 증가
		 * 실행문 : Scanner를 이용하여 score 배열에 i번지에 값을 입력해서 저장
		 * 반복문 종료 후 : 없음
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		System.out.print( "4과목 성적을 입력하세요 (예 : 40 60 50 90) : ");
		for( i = 0 ; i < arr.length ; i++) {
			arr[i] = scan.nextInt();
		}
		
		/* 입력받은 성적의 총합을 계산
		 * 반복횟수 : 향상된 for문을 이용하여 전체 탐색
		 * 실행문 : 배열에서 가져온 값을 sum에 누적
		 * 반복문 종료 후 : 없음
		 * */ 
		int sum = 0;
		i = 0;
		for( int tmp : arr) {
			sum += tmp;
		}
		
		// 총합을 이용하여 평균을 계산
		double avg = sum / (double)arr.length;
		
		/* 과락여부를 확인하여 변수에 저장
		 * 반복횟수 : 향상된 for문을 이용하여 전체 탐색
		 * 실행문 : 배열에서 가져온 값이 40보다 작으면, 과락 변수를 true로 변경
		 * 반복 종료 후 : 없음
		 * */	
		boolean result = false;
		i = 0;
		for( int tmp : arr ) {
			if( tmp < 40 ) {
				result = true;
				break; // break 없어도 결과는 같지만, 조금이라도 덜 비교하기 위해 쓰는 게 좋음
			}
		}
		//	과락 아니고 평균이 60이상이면 Pass,
		if( !result &&  avg >= 60 ) {
			System.out.println("Pass");
		}
		//	아니면 Fail
		else {
			System.out.println("Fail");
		}
		
	}
}
