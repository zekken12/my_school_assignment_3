package project1;

public class test {

    public static void main(String[] args) {

        //create object c1
        Car c1 = new Car("A", "AVZ4HTEF", "BMW", 2000, 20000);
        System.out.println("Owner: " + c1.owner());
        System.out.println("Reg: " + c1.reg());
        System.out.println("Make: " + c1.make());
        System.out.println("KM: " + c1.kilometres());
        System.out.println("Price: $" + c1.price());

        // try to modify the values of object      
        Modifyvalue(c1.owner(), c1.reg(), c1.make(), c1.kilometres(), c1.price());
        System.out.println("After modification: ");
        System.out.println("Owner: " + c1.owner());
        System.out.println("Reg: " + c1.reg());
        System.out.println("Make: " + c1.make());
        System.out.println("KM: " + c1.kilometres());
        System.out.println("Price: $" + c1.price());

    }

    private static void Modifyvalue(String owner, String reg, String make, int kilometres, double price) {
        owner = "B";
        reg = "HEDFTGR5";
        make = "Opel";
        kilometres = 2500;
        price = 10000;
    }
}