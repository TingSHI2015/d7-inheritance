package secondTry;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle1 = new Vehicle("VW", "Model1",2024);
        Vehicle vehicle2 = new Vehicle("BMW", "Model2",2022);

        //-----'System.out.println' can't omit!!! 'toString' can omit!----
        System.out.println(vehicle1.toString());     //error----: vehicle1.toString();
        System.out.println(vehicle2);  //without 'toString' is also ok! 'toString' will be default called!!!

        Car car1 = new Car("c1","Model1",2024, 4);
        Car car2 = new Car("c2","Model5",2020, 6);
        System.out.println(car1.toString());       //error: car1.toString()
        System.out.println(car2);      // toString can omit!


    //bonus---output Motorcycle:----
    Motorcycle motorcycle1 = new Motorcycle("Yamaha","Model200", 1988, "Chopper");
    System.out.println(motorcycle1);
    }

}
