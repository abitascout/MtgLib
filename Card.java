public class Card{

private String name, Type, CMC;
private double Price;
private boolean inStock;

public Card(){
	name = Type = CMC = null;
	Price = 0.1;
	inStock = false;
	
}
public void setName(String n)
{
	this.name = n;
}
public String getName()
{
	return this.name;
}

public void setType(String n)
{
	this.Type = n;
}
public String getType()
{
	return this.Type;
}
public void setCmc(String n)
{
	this.CMC = n;
}
public String getCmc()
{
	return this.CMC;
}

public void setPrice(double n)
{
	this.Price = n;
}
public double getPrice()
{
	return this.Price;
}
public void setStock(boolean n)
{
	this.inStock = n;
}
public boolean getStock()
{
	return this.inStock;
}
public String toString()
{
	String temp = this.name +"\t"+ this.Type +"\t"+ this.CMC +"\t"+ this.Price +"\t"+ this.inStock;
	return temp;
}
}