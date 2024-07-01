package day24;

public class Ex03 {

	public static void main(String[] args) {
		int num = 2;
		
		/* 짝수라고 판별해야 하는데 짝수, 홀수 모두 출력이 됨
		 * 원인 : if 조건문 이후에 ; < 이 있어서 아래 if 문의 조건문은 끝났기 떄문
		 * 해결 방법 : ; 지우기
		 * */
		
		if(num % 2 == 0); {
			System.out.println("짝수");
		}
		
		if(num % 2 != 0); {
			System.out.println("홀수");
		}
	}

}
