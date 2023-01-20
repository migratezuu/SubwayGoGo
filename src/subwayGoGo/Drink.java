package subwayGoGo;

public class Drink {
	
	private String name;

	
	public Drink(int drinkmenuNum) {
		
		switch(drinkmenuNum) {
		case 1 : 
			name = "아메리카노"; 
		break;
		case 2 : 
			name = "콜라"; 
		break;
		case 3 : 
			name = "제로콜라"; 
		break;
		case 4 : 
			name = "사이다";
		break;
		case 5 : 
			name = "환타"; 
		break;
		}
		
	}

	@Override
	public String toString() {
		return "음료 :" + name;
	}
}
