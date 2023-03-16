package project2;

public class Car{
	private String owner;
	private String reg;
	private String make;
	private int kilometres;
	private double price;
	public Car(String owner, String reg, String make, int kilometres, double price){
	this.owner = owner;
	this.reg = reg;
	this.make = make;
	this.kilometres = kilometres;
	this.price = price;
	}

	public String getOwner(){
	return owner;
	}

	public String getReg(){
	return reg;
	}

	public String getMake(){
	return make;
	}

	public int getKilometres(){
	return kilometres;
	}

	public double getPrice(){
	return price;
	}

	public void setPrice(double price){
	this.price = price;
	}

	public void setOwner(String owner){
	this.owner = owner;
	}

	public void setKil(int kilometres){
	this.kilometres = kilometres;
	}

	public void setMake(String make){
	this.make = make;
	}
	}