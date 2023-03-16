package project2;

public class Test {

	   public static void display(Car car) {

	       System.out.println("owner=" + car.getOwner() + ", reg=" + car.getReg() + ", make=" + car.getMake() + ", kilometres=" + car.getKilometres()+ ", price=" + car.getPrice());
	   }
	   public static void main(String[] args) {
	       MyGarage garage = new MyGarage();
	      
	       garage.add(new Car("Mercedes","Reg1","one",200,100000));
	       garage.add(new Car("Alfa Romeo","Reg2","one",100,200000));
	       garage.add(new Car("Lamborgini","Reg3","two",150,300000));
	       garage.add(new Car("BMW","Reg4","three",170,4000000));
	      
	       Car car = garage.getCar("Reg1");
	       if(car != null) {
	           System.out.println("\nCar found with Reg1");
	           display(car);
	       }else {
	           System.out.println("\nError no Reg1 found");
	       }
	      
	       Car[] ListCarsWithMake = garage.getMake("one");
	       if(ListCarsWithMake.length == 0) {
	           System.out.println("\nNo Cars with Make one in Garage");
	       }else {
	           System.out.println("\nCars with Make one in Garage");
	           for(int i = 0;i<ListCarsWithMake.length;i++) {
	               display(ListCarsWithMake[i]);
	           }
	       }
	       System.out.println(String.format("\nTotal Value of Cars in Garage : %.2f",garage.totalValue()));

	      
	       garage.reducePricesBy(0.20);
	       System.out.println("\nCars after reducing price by 20%");
	       garage.display();
	   }
	}

