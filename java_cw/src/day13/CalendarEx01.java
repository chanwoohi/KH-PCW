package day13;

import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR); // 연도를 추출			숫자 1로 표현 가능 cal.get(1)
		int month = cal.get(Calendar.MONTH); // 월을 추출, 0~11, +1을 해줘야 함 // 숫자 2로 표현 가능 cal.get(2)
		int day = cal.get(Calendar.DAY_OF_MONTH); // 일을 추출 	숫자 5로 표현 가능 cal.get(5)
		
		System.out.println(year + "-" + (month+1) + "-" + day);
	

	}

}
