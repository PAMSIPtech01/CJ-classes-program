class Bike {
	private int gear;
	private String color;
	private String bikeNo;
	private String model;
	private String brand;

	public void setgear(int gear){
		if (gear <0 ||gear >5)
			System.out.println("do not show your talent re  \n a bike has only 5 gear re tumri fellow ");
		else
			this.gear = gear;
	}
	public int getgear(){
		return gear;
	}

	public void setcolor(String color){
		this.color = color;
	}
	public String getcolor(){
		return color;
	}

	public void setbikeNo(String bikeNo){
		this.bikeNo = bikeNo;
	}
	public String getbikeNo(){
		return bikeNo;
	}

	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return model;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}

}