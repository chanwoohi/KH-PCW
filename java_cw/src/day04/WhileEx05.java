package day04;

public class WhileEx05 {
		// while문 예제 5
	public static void main(String[] args) {
		/*	1부터 10까지 짝수 합을 구하는 코드를 작성하세요.
		 * 
		 *  	sum = 0
		 * i=2	sum = sum + i  
		 * i=4	sum = sum + i
		 * ...
		 * i=10	sum = sum + 10
		 * 반복횟수 : i는 1부터 10까지 2씩 증가.
		 * 규칙성 : sum = sum + i 
		 * 반복문 종료 후 : sum 을 출력
		 * */
		int i = 2;
		int sum = 0;
		while( i <= 10 ) {
			sum += i;
			i += 2;
		}
		
		System.out.println("1부터 10까지 짝수 합 : " + sum);
		
		/**
		 * while( i <= 10 ) {
				if(i % 2 == 0) {
				sum += i;
				}
			i++;
			} 내가 한것
		 */ 
	}

}
