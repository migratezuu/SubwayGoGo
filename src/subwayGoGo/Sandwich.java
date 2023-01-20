package subwayGoGo;

import java.util.Scanner;

import subwayGO.SandwichDTO;

public class Sandwich{

	private String name;


	public Sandwich(int sandwichmenuNo) {

		switch(sandwichmenuNo) {
		case 1 : 
			name = "로스트치킨";
			break;
		case 2 :
			name = "비엘티";
		break;
		case 3 : 
			name = "에그마요";
		break;
		case 4 :
			name = "참치";
		break;
		case 5 : 
			name = "풀드포크";
		break;
		}
	}


	@Override
	public String toString() {
		return "샌드위치 : " + name ;
	}





}
