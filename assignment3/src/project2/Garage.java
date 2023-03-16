package project2;

interface Garage{
public boolean add(Car car);
public Car getCar(String reg);
public Car[] getMake(String make);
public double totalValue();
public boolean changeOwner(String reg, String owner);
public boolean changePrice(String reg, double price);
public void reducePricesBy(double percentage);
}