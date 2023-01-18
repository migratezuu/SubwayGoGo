package subwayGO;

import java.util.Scanner;

public class Drink {
	static String drinkvalue = "";
	static int choicejuiceNum = 0;

	public static void juiceGo() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {

		System.out.println("==================");
		System.out.println("1. 아메리카노");
		System.out.println("2. 콜라");
		System.out.println("3. 제로콜라");
		System.out.println("4. 사이다");
		System.out.println("5. 환타");
		System.out.println("6. 음료선택안함 ");
		System.out.println("");
		System.out.print("음료를 선택하세요. :");
		int juice = sc.nextInt();
		
	
		String[] juiceName = {"아메리카노", "콜라", "제로콜라", "사이다", "환타"};
		choicejuiceNum = juice;
		
		System.out.println("");
		if(juice == 6) {
			System.out.println("음료가 선택되지 않았습니다.");
			return;
		}else if(juice >= 1 && juice <=6) {
		System.out.println(juiceName[(choicejuiceNum -1)] + "가 선택되었습니다.");
		drinkvalue =  juiceName[(choicejuiceNum -1)];
		return;
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}break;
		}

//		switch(juice) {
//		case 1 : 
//			System.out.println(" ");
//			System.out.println("1. 아메리카노가 선택되었습니다.");
//			return;
//		case 2: 
//			System.out.println(" ");
//			System.out.println("2. 콜라가 선택되었습니다.");
//			return;
//		case 3:
//			System.out.println(" ");
//			System.out.println("3. 제로콜라가 선택되었습니다.");
//			return;
//		case 4: 
//			System.out.println(" ");
//			System.out.println("4. 사이다가 선택되었습니다.");
//			return;
//		case 5:
//			System.out.println(" ");
//			System.out.println("5. 환타가 선택되었습니다.");
//			return;
//		case 6:
//			System.out.println(" ");
//			return;
//
//		default:
//			System.out.println(" ");
//			System.out.println("잘못된 번호를 입력하셨습니다.");
//			System.out.println(" ");
//			break;
//		}
	}

}
