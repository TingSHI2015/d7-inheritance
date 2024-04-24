public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("BMW", "CrazyModel1", 2024);
     //   Car car1 = new Car(4);
        Car car1 = new Car("","",1928,4);

//error: can't directly output with toString()!
//        vehicle1.toString();
//        car1.toString();

        System.out.println(car1);
        System.out.println(vehicle1);


    }
}
