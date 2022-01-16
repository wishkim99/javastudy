package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int arr[]=new int[10];
		
		int num = scanner.nextInt();
		System.out.println("금액: "+num);
		
		for(int i=0; i<10; i++) {
			arr[i]=num/MONEYS[i]; //갯수(몫)
			money=num%MONEYS[i]; //나머지
			System.out.println(MONEYS[i]+"원 권"+arr[i]+"개");
		}
		
		scanner.close();
 	}
}