package subwayGoGo;

import java.util.ArrayList;
import java.util.List;

import subwayGO.SandwichDTO;

public class Order {
	
	private List<Drink> drinkOrderList;
	private List<Sandwich> sandwichOrderList;
	
	public Order() {
		drinkOrderList = new ArrayList<>();
		sandwichOrderList = new ArrayList<>();
	}

	public List<Drink> getDrinkOrderList() {
		return drinkOrderList;
	}

	public List<Sandwich> getSandwichOrderList(){
		return sandwichOrderList;
	}
	
	@Override
	public String toString() {
		return "주문 목록 \n" + "음료 : " +drinkOrderList  + "\n" +"샌드위치 : "+ sandwichOrderList;
		
	}
	
}



