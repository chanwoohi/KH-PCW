package day03;
		/* if문 테스트 4
		 * 정수를 입력 받아 3의 배수인지 아닌지 판별하는 코드를 작성하세요.
		 */
import java.util.Scanner;

public class IfExam04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력. : ");
		int num = scan.nextInt();
		//num를 3으로 나누었을 때 나머지가 0과 같다면 3의 배수라고 출력하고
		if(num % 3 == 0) {
			System.out.println(num + "3의 배수 입니다.");
		}
		// 아니면 3의 배수가 아닙니다 라고 출력.  << '~면' 아니니까 그냥 else로 끝내기
		else {
			System.out.println(num + "3의 배수가 아닙니다.");
		}
		
	}

}
