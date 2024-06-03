package day05;

public class StarEx02 {
	// 별 예제 2
	public static void main(String[] args) {
		/* *을 하나씩 출력해서 다음과 같이 출력되도록 중첩 반복문을 이용하여 작성하세요.
		 * *		i=1,	*=
		 * **		i=2,    *=
		 * ***		i=3, 	*=
		 * ****		i=4,	*=
		 * *****	i=5,	*=
		 * 반복횟수 :	i는 1부터 5까지 1씩 증가
		 * 규칙성 : *을 i개 출력 후 엔터
		 * 		 => 반복횟수 : j는 1부터 i까지 1씩 증가
		 * 			규칙성 : *을 출력
		 * 			반복문 종료 후 : 엔터 출력
		 * 반복문 종료 후: 
		 * */
		//5줄 반복
		int i, j;
		for( i = 1 ;  i <= 5 ; i++ ){
			for( j = 1 ; j <= i ; j++ ){
					System.out.print("*");
			}
			System.out.println("");//또는 System.out.print("\n");
		}
		
		
		int [] arr = new int[]{1,2,3,4,5}; // 향상된 포문 예제
		for(int tmp : arr){
			System.out.println(tmp);
		}
	}
}
