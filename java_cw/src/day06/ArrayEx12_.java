package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx12_ {
	// 배열 예제 12
	public static void main(String[] args) {
		/* UpDown 게임에 다음 기능을 추가하세요.
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록 확인
		 * 3. 종료
		 * 메뉴 선택 : 1
		 * (랜덤이 35라고 가정)
		 * 정수 입력 : 50
		 * DOWN!
		 * 정수 입력 : 30
		 * UP!
		 * 정수 입력 : 35
		 * 정답입니다!
		 * 맞힌 횟수는 3회 입니다.
		 * 기록이 등록됩니다.
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록 확인
		 * 3. 종료
		 * 메뉴 선택 : 2
		 * 기록확인
		 * 1. 3회
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록 확인
		 * 3. 종료
		 * */
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		int menu, min = 1, max = 100, random, num, count;
		int sum = 0;
		int [] record = new int [5];
		int recordCount = 0 , i;
		// 선택한 메뉴가 3이 아닐때 실행되는 반복문
		do {
			// 메뉴 출력
			System.out.println("메뉴");
			System.out.println("1. 플레이");
			System.out.println("2. 기록 확인");
			System.out.println("3. 종료");
			//Scanner를 이용하여 메뉴를 입력
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			
			
			switch (menu) {
			case 1 :
				// 1~100 사이의 랜덤한 수를 생성
				random = (int)(Math.random() * (max - min + 1) + min );
				//횟수를 초기화
				count = 0;
				// 입력한 값이 랜덤한 수와 같지 않으면 반복
				do {
					//정수 입력 : 안내문구 출력
					System.out.print("정수 입력 : ");
					//Scanner를 이용하여 정수를 입력
					num = scan.nextInt();
					// 입력한 횟수를 증가
					count++;
					// 입력한 값이 랜덤한 값보다 크면 DOWN이라고 출력하고
					if(num > random) {
						System.out.println("DOWN!");
					}
					// 입력한 값이 랜덤한 값보다 작으면 UP이라고 출력하고
					else if(num < random) {
						System.out.println("UP!");
					}
					// 같으면 정답입니다를 출력하고 입력한 횟수를 클릭
					else {
						System.out.println("정답입니다.");
						System.out.println("맞춘 횟수는 " + count + "회 입니다.");
					}
				}while(random != num);
				
				//	기록의 개수가 5개 미만이면
				if(count < 5) {
					//	기록을 등록
					//	=recordCount 번지에 저장하고 recordCount를 1증가
					record[recordCount++] = count;
				}//	아니면 내 기록이 5등보다 좋은지 비교해서 좋으면 
				else if (count > record[recordCount]){
					//	기록을 등록
					//	=마지막 번지에 내 기록을 등록
					record[4] = count;
				}
				//	기록 정렬
				//	=Arrays.sort를 이용하여 0번지부터 recordCount 번지 전까지 정렬
				//	0번지는 포함, recordCount번지는 포함을 안하고 앞 번지까지
				Arrays.sort(record, 0, recordCount);
				System.out.println(Arrays.toString(record));
				break;
				
			case 2 :
				//record에 있는 기록들을 recordCount개 만큼 순서대로 출력
				/* 반복횟수 : i는 0부터 recordCount보다 작을 때까지 1씩 증가
				 * 규칙성 : i+1 횟수를 출력
				 * 반복문 종료 후 : 없음
				 * */
				if(recordCount == 0) {
					System.out.println("등록된 기록이 없습니다.");
					break;
				}
				System.out.println("기록 확인");
				for(  i = 0 ; i < record.length ; i++) {
					System.out.println((i+1) + "등. " + record[i] + "회");
				}
				break;
			case 3 :
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 정수 입력");
			}			
		} while (menu != 3);

	}

}
