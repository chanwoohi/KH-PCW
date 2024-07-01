package day24;
//잘못된 코드 수정하기 예제 1
public class Ex01 {
	
	public static void main(String[] args) {
		int num1 = 4;
		double num2 = num1;
		
		/* 에러 발생
		 * 원인 : 변수 형이 맞지 않아서
		 * 해결 방법 : 강제 형변환 or 실수형 변수에 저장
		 * */
		int num3 = (int)num2;
	}
}
