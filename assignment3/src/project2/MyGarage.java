package project2;

import java.util.ArrayList;
import java.util.List;

public class MyGarage implements Garage{

   private List<Car> cars;
  
  
   public MyGarage() {
       super();
       cars = new ArrayList<>();
   }

   @Override
   public boolean add(Car c) {
	   
       if(getCar(c.getReg()) != null) {
           return false;
       }
       cars.add(c);
       return true;
   }

   @Override
   public Car getCar(String reg) {
      
       for(Car car: cars) {
           if(car.getReg().equals(reg)) {
               return car;
           }
       }
       return null;
   }

   @Override
   public Car[] getMake(String make) {
      
       List<Car> ListCarsWithMake = new ArrayList<>();
       for(Car car: cars) {
           if(car.getMake().equalsIgnoreCase(make)) {
               ListCarsWithMake.add(car);
           }
       }
       Car[] carsWithMake = new Car[ListCarsWithMake.size()];
       ListCarsWithMake.toArray(carsWithMake);
       return carsWithMake;
      
   }

   @Override
   public double totalValue() {
       double totalValue = 0.0;
       for(Car car: cars) {
           totalValue += car.getPrice();
       }
       return totalValue;
   }

   @Override
   public boolean changeOwner(String reg, String ow) {
       for(int i = 0;i<cars.size();i++) {
           if(cars.get(i).getReg().equalsIgnoreCase(reg)) {
               cars.get(i).setOwner(ow);
               return true;
           }
       }
       return false;
   }

   @Override
   public boolean changePrice(String reg, double price) {
       for(int i = 0;i<cars.size();i++) {
           if(cars.get(i).getReg().equalsIgnoreCase(reg)) {
               cars.get(i).setPrice(price);
               return true;
           }
       }
       return false;
   }

   @Override
   public void reducePricesBy(double per) {
       double price;
       double reduceBy;
       for(int i = 0;i<cars.size();i++) {
           price = cars.get(i).getPrice();
           reduceBy = price * per;
           price -= reduceBy;
           cars.get(i).setPrice(price);
       }
      
   }
  
   public void display() {
       for(Car car: cars) {
           System.out.println("\nowner=" + car.getOwner() + ", reg=" + car.getReg() + ", make=" + car.getMake() + ", kilometres=" + car.getKilometres()+ ", price=" + car.getPrice());
       }
   }

}