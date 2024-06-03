package day05;

public class StarEx03 {
	// 별 예제 3
	public static void main(String[] args) {
		/* *을 하나씩 출력해서 다음과 같이 출력되도록 중첩 반복문을 이용하여 작성하세요.
		 *     *	i=1,	공백=4,	*=1
		 *    **	i=2,    공백=3,	*=2
		 *   ***	i=3, 	공백=2,	*=3
		 *  ****	i=4,	공백=1,	*=4
		 * *****	i=5,	공백=0,	*=5
		 * 					공백=5-i,	*=i
		 * 반복횟수 :	i는 1부터 5까지 1씩 증가
		 * 규칙성 : 공백을 5-i개 출력하고 *을 i개 출력 후 엔터
		 *  	 => 반복횟수 : j는 1부터 5-i까지 1씩 증가
		 * 			규칙성 : 공백을 출력
		 * 			반복문 종료 후 : 없음
		 * 		 => 반복횟수 : j는 1부터 i까지 1씩 증가
		 * 			규칙성 : *을 출력
		 * 			반복문 종료 후 : 엔터 출력
		 * 반복문 종료 후: 없음
		 * */
		//5줄 반복
		int i, j;
		for( i = 1 ;  i <= 5 ; i++ ){
			for(j = 1 ; j <= ( 5 - i ) ; j++ ) {
				System.out.print(" ");
			}
			for( j = 1 ; j <= i ; j++ ){
				System.out.print("*");
			}
				System.out.println("");//또는 System.out.print("\n");
		}
		
	}
}
