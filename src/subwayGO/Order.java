package subwayGO;

import java.util.Scanner;

public class Order {
	static Scanner sc = new Scanner(System.in);

	SandwichDTO[] order = new SandwichDTO[5];
	static String[] juiceName = new String[5];
	
	private static int index = 0;
	private int drinkIndex = 0;

	static String sandwichvalue = "";
	int choiceNum = 0;

	public void personalOrder(SandwichDTO[] sandwichs) {

		while(true) {
			
			
			System.out.println("================");

			for(int i = 0; i < sandwichs.length; i++) {
				System.out.println((i+1) + ". " + sandwichs[i].getName());
			}
			System.out.println("===============");
			System.out.print("샌드위치를 번호를 선택하세요. : ");
			int choiceSandwich = sc.nextInt();
			choiceNum = choiceSandwich;
			System.out.println("----------------");
			
			
			
			
			//여기를 스위치 짧게 잘 바꿔보자....
			switch(choiceSandwich) {
			case 1 : 
				System.out.println(" ");
				System.out.println(sandwichs[0].getName()+"을 선택하셨습니다.");
				System.out.println("");
				System.out.println(sandwichs[0].getName()+"의 레시피는 ");
				System.out.println(sandwichs[0].getInformation());
				choiceOk(sandwichs);
				return;
			case 2: 
				System.out.println(" ");
				System.out.println(sandwichs[1].getName()+"을 선택하셨습니다.");
				System.out.println("");
				System.out.println(sandwichs[1].getName()+"의 레시피는 ");
				System.out.println(sandwichs[1].getInformation());
				choiceOk(sandwichs);
				return;
			case 3:
				System.out.println(" ");
				System.out.println(sandwichs[2].getName()+"을 선택하셨습니다.");
				System.out.println("");
				System.out.println(sandwichs[2].getName()+"의 레시피는 ");
				System.out.println(sandwichs[2].getInformation());
				choiceOk(sandwichs);
				return;
			case 4: 
				System.out.println(" ");
				System.out.println(sandwichs[3].getName()+"을 선택하셨습니다.");
				System.out.println("");
				System.out.println(sandwichs[3].getName()+"의 레시피는 ");
				System.out.println(sandwichs[3].getInformation());
				choiceOk(sandwichs);
				return;
			case 5:
				System.out.println(" ");
				System.out.println(sandwichs[4].getName()+"을 선택하셨습니다.");
				System.out.println("");
				System.out.println(sandwichs[4].getName()+"의 레시피는 ");
				System.out.println(sandwichs[4].getInformation());
				choiceOk(sandwichs);
				return;
			default:
				System.out.println(" ");
				System.out.println("잘못된 번호를 입력하셨습니다.");
				System.out.println(" ");
				return;
			}
		}



	}
	public void choiceOk(SandwichDTO[] order) {
		System.out.println("");
		System.out.println("샌드위치 메뉴를 결정하시겠습니까? : ");
		System.out.println("1. 결정");
		System.out.println("2. 취소");
		int sandwichOk = sc.nextInt();
	

		if(sandwichOk == 1) {
			System.out.println(order[(choiceNum - 1)].getName()+ "을 주문했습니다.");
			sandwichvalue = order[(choiceNum-1)].getName();
			Kiosk.choiceJuice();

			this.order[index] = new SandwichDTO();
			index++;
		}else {
			return;
		}

	}

	public static void showOrder() {
		while(true) {
			
			System.out.println("주문하신 메뉴입니다.");
			System.out.println(sandwichvalue + ", " + Drink.drinkvalue);
			
			System.out.println();
			
//			for(int i = 0; i < Drink.choicejuiceNum; i++ ) {
//				System.out.println(i);
//			}
//			
//			
			System.out.print("결제하시려면 1번, 처음으로 돌아가시려면 2번을 눌러주세요. : ");
			int payment = sc.nextInt(); 
			
			if (payment == 1) {
				System.out.println("결제가 완료되었습니다.");
				break;
			}else {
				return;
			}

		}

	}
}
