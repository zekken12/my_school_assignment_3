package project1;

//to convert mutable class to immutable we need to declare class as private
//we put all fields to private and final so it can not be accessed outside and values can't be modified
final class Car {

  final private String owner;
  final private String reg;
  final private String make;
  final private int kilometres;
  final private double price;

  public Car(String owner, String reg, String make, int kilometres, double price) {
      this.owner = owner;
      this.reg = reg;
      this.make = make;
      this.kilometres = kilometres;
      this.price = price;
  }
  public String owner() {
      return owner;
  }

  public String reg() {
      return reg;
  }

  public String make() {
      return make;
  }

  public int kilometres() {
      return kilometres;
  }

  public double price() {
      return price;
  }
}
