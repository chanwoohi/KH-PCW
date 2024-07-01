package day24;

public class Ex07 {

	public static void main(String[] args) {
		/* 1부터 10까지의 합을 구하려고 했다.
		 * 원인 : for문의 조건식 뒤에 ;이 있어서 i만 증가하고 증가한 i가 밖에서 11만 출력 
		 * 해결방법 : ; 지우기
		 * */
		
		int i;
		int sum = 0;
		for( i = 1; i<=10;i++){
			sum+=i;
		}
		System.out.println("1부터 10까지의 합 : " + sum );
	}

}
