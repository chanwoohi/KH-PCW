package day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateEx01 {
	public static void main(String[] args) throws ParseException { // throws ParseException 예외를 미뤄줌
		Scanner scan = new Scanner(System.in);
		Date date = new Date();
		
		System.out.println(date);
		//날짜 => 문자열
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr = format.format(date);
		System.out.println(dateStr);
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr1 = format1.format(date);
		System.out.println(dateStr1);
		
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String dateStr2 = format2.format(date);
		System.out.println(dateStr2);
		
		// 문자열 => 날짜
		// 포맷이 안 맞는 경우 예외가 발생할 수 있다.
		String dateStr3 = "2024-06-14 09:22";
		SimpleDateFormat format3 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date3 = format3.parse(dateStr3);
		System.out.println(date3);
		
		//이렇게 하는 것임
		SimpleDateFormat format4 = new SimpleDateFormat("yyyy-MM-dd");
		Date date4 = format4.parse(scan.next());
		System.out.println(date4);
		SimpleDateFormat format5 = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr4 = format5.format(date4);
		System.out.println(dateStr4);
		
	}
}
