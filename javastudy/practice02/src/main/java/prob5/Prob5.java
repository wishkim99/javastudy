package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 결정하였습니다. 맞추어 보세요. ");
		System.out.println("1-100");
		
		// 랜덤 값 생성
		Random random = new Random();
		int ansNum = random.nextInt(100) + 1; // 0 - 99까지 에다 +1 씩 : 1-100
//		System.out.println(correctNumber);
		int cnt = 1;

		while (true) {

			System.out.print(cnt + ">> ");
			int num = sc.nextInt(); // 입력 받는 수
			cnt++;
			
			if (num < ansNum) {
				System.out.println("더 높게");
			} else if (num > ansNum) {
				System.out.println("더 낮게");
			} else {
				System.out.println("맞았습니다.");

				// 정답 랜덤하게 만들기 
				random = new Random();
				ansNum = random.nextInt(100)+1;
//				System.out.println(correctNumber);
				
				// 새 게임 여부 확인하기
				System.out.print("다시 하겠습니까(y/n)>>");
				String ans = sc.next();
				if ("y".equals(ans) == false) {
					System.out.println("게임이 종료됩니다.");
					break;
				}else {
					cnt = 1;
				}
			}		
		}
		sc.close();
	}

}