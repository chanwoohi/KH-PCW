package day05;

import java.util.Scanner;

public class ArrayEx05 {
	//배열 예제 5
	public static void main(String[] args) {
		/* 1~10사이의 랜덤한 수 3개를 저장하고 출력하는 예제
		 * 예시 랜덤으로 생성한 숫자가 1 3 2
		 * */
		int numbers[] = new int[3];
		for( int i = 0 ; i < numbers.length ; i++ ) {
			int min = 1, max = 10;
			int random = (int)(Math.random() * (max - min + 1) + min );
			numbers[i] = random;
		}
		for(int i = 0 ; i < numbers.length ; i ++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		//정수 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
	
		//숫자를 입력해서 입력한 숫자가 랜덤한 수에 있는지 확인하는 예제
		//8을 입력하면 8은 없습니다. 라고 출력
		//2를 입력하면 2는 있습니다. 라고 출력
		/* 방법 1
		 * 정수 3개가 있는데 내가 찾으려는 정수의 위치가 어딘지 확인.
		 * 중간에 찾았으면 1~3사이에 위치할테고 없으면 3보다 크다
		 * => 중간에 찾았으면 0~2번지 사이에 있을테고 없으면 번지가 3이다.
		 * 반복횟수 : i는 0번지부터 배열의 크기보다 작을 때까지 1씩 증가
		 * 규칙성 : 배열 i 번지에 있는 값과 입력받은 값이 같으면 반복문을 종료
		 * 반복문 종료 후 : i가 배열의 크기보다 작으면 ~은 있습니다. 라고 출력하고 같으면 ~은 없습니다. 라고 출력
		 * */
		int i;
		for( i = 0 ;i < numbers.length ; i++ ) {
			if(numbers[i] == num) {
				break;
			}
		}
		if( i < numbers.length) {
			System.out.println(num + "는 있습니다.");
		}
		else if ( i == numbers.length) {
			System.out.println(num + "는 없습니다.");
		}
		
		/* 방법 2
		 * 반복횟수 : 향상된 for문을 이용하여 전체 탐색
		 * 규칙성 : 배열의 값과 입력받은 값이 같으면, boolean result를 true로 변경하고, 반복문을 종료
		 * 반복문 종료 후 : result가 true이면 ~ 은 있습니다. 라고 출력하고 아니면 ~ 은 없습니다 라고 출력
		 * */
		boolean result = false;
		for( int tmp : numbers ) {
				if(tmp == num) {
					result = true;
					break;
				}
		}
		if( result ) {
			System.out.println(num + "는 있습니다.");
		}
		else{
			System.out.println(num + "는 없습니다.");
		}
		
			
	}	
		
		

}
