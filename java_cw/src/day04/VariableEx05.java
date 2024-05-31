package day04;

public class VariableEx05 {

	public static void main(String[] args) {
			//	실수 소수점 유효범위 확인하는 예제
			float num1 = 0.12345678f;
			double num2 = 0.123456789012345678;
			
			System.out.printf("%.20f\n" , num1);	// printf << "%.(소수점 자릿수)f\n", 변수이름
			System.out.printf("%.20f\n" , num2);	
			
			// sysout 해보면 항상 오차가 보이는 모습
			// float 은 8자리, double은 15자리까지 뒤에는 오차 존재
	}

}
