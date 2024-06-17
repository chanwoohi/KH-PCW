package day08;

public class MethodEx02 {
	/** 정수 num1가 정수 num2의 약수인지 아닌지를 알려주는 메서드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : num1 을 num2로 나눴을 때 나머지가 0 인지 아닌지 => boolean
	 * 메서드명 : isDivisor
	 * */
	public static boolean isDivisor(long num1, long num2) {
		return num1 % num2 == 0 ;
	}
	
	/*	두 수의 최대 공약수를 구하는 메서드
	 * 	매개변수 : 두 정수 => int num1, int num2
	 * 	리턴타입 : 두 정수의 최대 공약수 => 정수 => int
	 * 	메서드명 : gcd
	 * */
	public static int gcd(int num1, int num2) {
		int i ;
		for( i = num1 ; i <= num1*num2 ; i++ ) {
			if( isDivisor(i,num1) && isDivisor(i,num2) ) {
				return i;
			}
		}
		return i;
	}
	
	/*	두 수의 최소 공배수를 구하는 메서드
	 * 	매개변수 : 두 정수 => int num1, int num2
	 * 	리턴타입 : 두 정수의 최소 공배수 => 정수 => long
	 * 	메서드명 : lcm
	 * */
	public static long lcm(int num1, int num2) {
		long i;
		if(num1 < num2) {
			int tmp = num2;
			num2 = num1;
			num1 = tmp;
		}
		for( i = num1 ; i <= num1*(long)num2 ; i+=num1) {
			if( isDivisor(num1,i)) {
				return i;
			}
		}
		return i;
	}
	/* g : 최대공약수
	 * A : ga, B : gb
	 * l : 최소공배수
	 * l : gab = A * B / g
	 * */
	public static long lcm2(int num1, int num2) {
		return (long)num1 * num2 / gcd(num1, num2);
	}
	public static void main(String[] args) {
		/* 두 수의 최대 공약수(gcd)와 최소 공배수(lcm)를 구하는 코드를 작성하세요. 단, 메서드 이용.*/
		int num1 = 4, num2 = 8;
		System.out.println(num1 + "과 " + num2 + "의 " + "최대공약수는 : " + lcm(num1,num2));
		System.out.println(num1 + "과 " + num2 + "의 " + "최소공배수는 : " + gcd(num1,num2));
	}
}
