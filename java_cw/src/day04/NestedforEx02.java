package day04;
	
public class NestedforEx02 {
	// 중첩 for 문 예제 2
	public static void main(String[] args) {
		/* num가 소문인지 아닌지 판별하는 코드를 이용하여 100이하의 소수를 출력하는 코드를 작성하세요
		 * 반복횟수 : num는 2부터 100까지 1씩 증가
		 * 규칙성 : num가 소수인지 아닌지 판별하는 코드를 활용해서 소수이면 num를 출력, 아니면 아무것도 안함
		 * 반복문 종료 후 : 없음
		 * */
		
		int i, count;
		for(int num = 2 ; num <= 100 ; num++) {
			//num가 소수인지 아닌지 판별하는 코드
			;
			for(i = 1, count = 0; i <= num; i++) {
				if(num % i == 0) {
					count++;
				}
			}
			if(count == 2){
				System.out.print(num + " ");
			}
		}
	}

}
