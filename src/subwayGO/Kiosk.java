package subwayGO;

import java.util.Scanner;

public class Kiosk {

	public void sandwichMenu() {
		
		SandwichDTO[] sandwichs = new SandwichDTO[5];
		
		sandwichs[0] = new SandwichDTO("로스트치킨", "플랫브래드", "닭가슴살", "양상추", "칠리");
		sandwichs[1] = new SandwichDTO("비엘티", "허니오트","베이컨", "양상추", "랜치");
		sandwichs[2] = new SandwichDTO("에그마요", "위트","계란", "양상추","마요네즈");
		sandwichs[3] = new SandwichDTO("참치", "하티", "참치","양파","마요네즈");
		sandwichs[4] = new SandwichDTO("풀드포크", "플랫브래드", "바베큐","양파","바베큐");
				
		Order order= new Order();
		order.personalOrder(sandwichs);
		
	}

	public static void choiceJuice() {
		Drink.juiceGo();
	
	}
	
	public static void showAll() {
		Order.showOrder();
	}
	
}
