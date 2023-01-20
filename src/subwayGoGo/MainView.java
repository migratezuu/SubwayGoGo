package subwayGoGo;

import java.util.Scanner;

import subwayGO.SandwichDTO;

public class MainView {
	
	public void showMainMenu() {
		
		Scanner sc = new Scanner(System.in);
		Order order = new Order();
		
		while(true) {
			
			System.out.println(" ");
			System.out.println("======서브웨이======");
			System.out.println("");
			System.out.println("1. 샌드위치 메뉴 선택");
			System.out.println("2. 음료 선택");
			System.out.println("3. 주문 목록 확인");
			System.out.println("");
			System.out.print("메뉴를 선택하세요.  :  ");
			int no = sc.nextInt();
		
			switch(no) {
			case 1 :
				sandwichMenu(order);
				break;
			case 2 :
				drinkMenu(order);
				break;
			case 3 :
				System.out.println(order);
				break;
			}
			
		}
		
	}



	private void drinkMenu(Order order) {
		
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
			int no = sc.nextInt();
			
			
			switch(no) {
			case 1 :
				order.getDrinkOrderList().add(new Drink(1));  
				break;
			case 2 :
				order.getDrinkOrderList().add(new Drink(2));  	
			break;	
			case 3 :
				order.getDrinkOrderList().add(new Drink(3)); 	
				break;
				case 4 :
				order.getDrinkOrderList().add(new Drink(4));  	
				break;
			case 5 :
				
				order.getDrinkOrderList().add(new Drink(5)); 
				break;
				
			case 6 : return;
			}
			
			
		}

		
	}
	
	private void sandwichMenu(Order order) {
		
		
		SandwichDTO[] sandwichs = new SandwichDTO[5];
		
		sandwichs[0] = new SandwichDTO("로스트치킨", "플랫브래드", "닭가슴살", "양상추", "칠리");
		sandwichs[1] = new SandwichDTO("비엘티", "허니오트","베이컨", "양상추", "랜치");
		sandwichs[2] = new SandwichDTO("에그마요", "위트","계란", "양상추","마요네즈");
		sandwichs[3] = new SandwichDTO("참치", "하티", "참치","양파","마요네즈");
		sandwichs[4] = new SandwichDTO("풀드포크", "플랫브래드", "바베큐","양파","바베큐");
		
	
		order.getSandwichOrderList();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("================");
		
		while(true) {
		
		for(int i = 0; i < sandwichs.length; i++) {
			System.out.println((i+1) + ". " + sandwichs[i].getName());
		}
		System.out.println("6. 샌드위치 선택 종료");
		System.out.println("===============");
		System.out.print("샌드위치를 번호를 선택하세요. : ");
		int no= sc.nextInt();
		System.out.println("----------------");
		
		switch(no) {
		case 1 : 
			order.getSandwichOrderList().add(new Sandwich(1));
			break;
		case 2 : 
			order.getSandwichOrderList().add(new Sandwich(2));
			break;
		case 3 : 
			order.getSandwichOrderList().add(new Sandwich(3));
			break;
		case 4 : 
			order.getSandwichOrderList().add(new Sandwich(4));
			break;
		case 5 : 
			order.getSandwichOrderList().add(new Sandwich(5));
			break;
		case 6 :
			return;
	
		}
		
	}
	}
}
