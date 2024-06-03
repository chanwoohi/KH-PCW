package day05;

public class RandomEx01 {
	// 랜덤 코드 1
	public static void main(String[] args) {
		/* min ~ max 사이의 정수를 랜덤으로 만드는 코드 설명 예제
		 * Math.rnadom()은 0이상 1미만의 랜덤한 실수를 생성해 줌
		 * 
		 * 0 <= r < 1 
		 * 위 식에서 각 항에 0보다 큰 (max - min + 1)로 곱해줌.
		 * 0 * (max - min + 1) <= r * (max - min + 1) < 1 * (max - min + 1) 
		 * 0 <= r * (max - min + 1) < max - min + 1
		 * 위 식에서 각 항에 min을 더해줌
		 * min <= r * (max - min + 1) + min < max + 1
		 * 위 식은 min 이상 max + 1 이하의 실수가 랜덤으로 생성, 위 식에서 가운데에 int로 자료형변환 하면
		 * min <= (int)(r * (max - min + 1)) < max + 1
		 * 위 식은 min 이상 max + 1 미만의 정수 => min 이상 max 이하의 정수
		 * */
		int min = 1, max = 7;
		int random = (int)(Math.random() * (max - min + 1) + min );
		System.out.println("랜덤한 수 : " + random);
	}

}
