package day05;

public class EnhancedForEx01 {
	// 향상된 for문 예제 1
	public static void main(String[] args) {
		//배열에 1,2,3,4,5 를 저장한 후 향상된 for문을 이용하여 조회하는 예제
		int array [] = new int [] {1,2,3,4,5};
		
		for( int tmp : array ) {
			System.out.println(tmp);
		}
		for(int i = 0 ; i< array.length; i++) {
			int tmp = array[i];
			System.out.println(tmp);
		}
		

	}

}
