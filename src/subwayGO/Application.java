package subwayGO;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner sc = new Scanner(System.in);

		Kiosk kiosk = new Kiosk();
		
		while(true) {
			System.out.println(" ");
			System.out.println("======서브웨이======");
			System.out.println("");
			System.out.println("1. 샌드위치 메뉴 선택");
			System.out.println("2. 음료 선택");
			System.out.println("3. 주문 목록 확인");
			System.out.println("");
			System.out.print("메뉴를 선택하세요.  :  ");
			int choice =sc.nextInt();

			switch(choice) {
			case 1:
				kiosk.sandwichMenu();
				break;
			case 2:
				Kiosk.choiceJuice();
				break;
			case 3:
				Kiosk.showAll();
				break;

			default:
				System.out.println("다시 선택하세요.");
				break;


			}
		}
	}
}
