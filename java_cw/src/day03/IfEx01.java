package day03;

public class IfEx01 {
	//if문을 이용한 홀짝 판별 예제
	public static void main(String[] args) {
		int num = 4;
		//num가 홀수이면 홀수라고 출력 // ~면 ...이다 ~ : 조건식 ... : 실행문
		/** 조건식이 거짓이면 실행문 실행X 
		 */
		if(num % 2 != 0) {
			System.out.println("홀수");
		}
		//num가 짝수이면 짝수라고 출력
		if(num % 2 == 0) {
			System.out.println("짝수");
		}
		
		
		

	}

}
