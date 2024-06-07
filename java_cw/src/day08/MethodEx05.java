package day08;

public class MethodEx05 {
	/* 정수 배열이 주어지면 배열에 정수 num가 있는지 없는지 알려주는 메서드
	 * 매개변수 : 원하는 정수, 정수 배열 => int num1, int num2[]
	 * 리턴타입 : 있는지 없는지 => boolean
	 * 메서드명 : contains
	 * */
	public static boolean contains(int num, int arr[]) {
		//	배열이 null이면 false를 리턴	
		if(arr == null) {
			return false;
		}
		//	반복문을 이용하여 배열전체를 탐색
		for(int tmp : arr ) {
			// 배열에서 꺼낸 값과 num과 같으면 true를 리턴
			if( num == tmp ) {
				return true;
			}
		}
		//반복문이 끝날 때 까지 못찾으면 false를 리턴
		return false;
	}

	public static void main(String[] args) {
		/* 정수 배열이 주어지고 주어진 배열에 원하는 정수가 있는지 없는지 확인하는 코드를 작성하세요.
		 * 단, 메서드를 이용하여 
		 * */
		int num1 = 1;
		int [] arr = new int [] {1,2,3,4,5};
		if(contains(num1,arr)) {
			System.out.println(num1 + "이 있습니다.");
		}
		else {
			System.out.println(num1 + "이 없습니다.");
		}

	}

}
