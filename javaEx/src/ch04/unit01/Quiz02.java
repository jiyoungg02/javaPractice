package ch04.unit01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.print("년도 ? ");
		year = sc.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year + "년도는 윤년입니다.");
		}else {
			System.out.println(year + "년도는 평년입니다.");
		}
		
		sc.close();
	}
}
