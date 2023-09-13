package test;

public enum Cars {
	Figo(900),Alto(600),Dezire(800);
	public int price;
	private Cars(int price)
	{
	this.price=price;
	}
	public int getPrice()
	{
	return price;
	}


}
