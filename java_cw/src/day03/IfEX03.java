package day03;

public class IfEx04 {
		// else if 예제
	public static void main(String[] args) {
		int num = 4;
		//num가 0이면 0이라고 출력하고
		if(num == 0) {
			System.out.println("0");
			}
			//num가 0이 아니고 양수이면 양수라고 출력하고
			else if (num > 0) {
				System.out.println(num + "은(는) 양수");
			}
			//num가 0과 양수가 아니면 음수라고 출력하는 코드를 작성하세요.
			else if (num < 0) {
				System.out.println(num + "은(는) 음수");
			}
	

	}

}
