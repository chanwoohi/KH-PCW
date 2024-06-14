package day13;

import java.text.MessageFormat;

public class MessageFormatEx01 {

	public static void main(String[] args) {
		
		String format1 = "({0} , {1})";
		int x = 1, y = 10;
		String result1 = MessageFormat.format(format1, x, y);
		System.out.println(result1);
		
		int grade = 1, classNum = 2, num = 3;
		String name = "홍길동";
		String format2 = "{0}학년 {1}반 {2}번 {3}";
		String result2 = MessageFormat.format(format2, grade, classNum, num, name);
		System.out.println(result2);
		
		
		String format3 = "{0}학년 {2}반 {1}번 {3}";  // 0, 1, 2, 3 순서는 상관 없음 밑에서 맞춰주면 됨
		String result3 = MessageFormat.format(format2, grade, num, classNum, name);
		

	}

}
