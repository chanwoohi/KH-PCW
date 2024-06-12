package day11;

public class InheritanceEx01 {
	//상속 예제
	public static void main(String[] args) {
		HighSchoolStudent std = new HighSchoolStudent();
		std.print();
		std.setAge(10);
		std.print();
		

	}

}

class Student1{

}


class HighSchoolStudent extends Student {
	public void test() {
		// System.out.println(schoolName);  // 접근제어자가 private여서 자식 클래스에서 사용할 수 없다.
		System.out.println(name); // 접근제어자가 proteceted이어서 자식 클래스에서 사용할 수 있다.
		System.out.println(age); // 접근제어자가 기본인데 같은 패키지에서 사용할 수 있다.
		System.out.println(birthday); // 접근제어자가 public이어서 자식 클래스에서 사용할 수 있다.
	}
	
}


