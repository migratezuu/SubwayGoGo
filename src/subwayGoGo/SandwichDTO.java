package subwayGoGo;

public class SandwichDTO {
	
	private String name;
	private String bread;
	private String mainingredient;
	private String vegetable;
	private String sauce;
	
	public SandwichDTO() {}

	public SandwichDTO(String name, String bread, String mainingredient, String vegetable, String sauce) {
		super();
		this.name = name;
		this.bread = bread;
		this.mainingredient = mainingredient;
		this.vegetable = vegetable;
		this.sauce = sauce;
	}
 
	public String getName() {
		return name;
	}

	public String getBread() {
		return bread;
	}

	public String getMainingredient() {
		return mainingredient;
	}

	public String getVegetable() {
		return vegetable;
	}

	public String getSauce() {
		return sauce;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setBread(String bread) {
		this.bread = bread;
	}

	public void setMainingredient(String mainingredient) {
		this.mainingredient = mainingredient;
	}

	public void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	
	

}
