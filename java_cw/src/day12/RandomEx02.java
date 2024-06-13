package day12;

import java.util.Random;

public class RandomEx02 {
	public static void main(String[] args) {
		/* 
		 * min ~ max 사이의 랜덤한 수를 만드는 코드를 작성하세요. 
		 * int r = (int)(Math.random()*(max - min + 1) + min */
		int min= 1, max=10;
		Random r = new Random();
		for( int i = 0 ; i < 20 ; i++ ) {
			int num = r.nextInt(max - min + 1) + min ;
			System.out.print(num + " ");
		}
		System.out.println();
		for( int i = 0 ; i < 20 ; i++ ) {
			int num = r.nextInt(min, max+1);
			System.out.print(num + " ");
		}
		
		
		
		
	
	}
}
