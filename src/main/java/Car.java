public class Car extends Vehicle {
    private int numberOfDoors;     //if there's also a kids-class of Car, here 'protected' instedad of 'private'

    //error
/*    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }*/

    //???? easiest way: write all parameters(also from parentClass in Car)???
    //GPT: Car Constructor that correctly calls the superclass constructor----
    public Car(String manufacturer, String model, int yearOfManufacture, int numberOfDoors) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }


/*    @Override
    public String toString(Car car) {       //if write 'Vehicle car' in (), another meaning
        return "This Car is: " + '\'' +
                "Manufacturer: " + car.manufacturer + '\'' +
                "Model: " + car.model + '\'' +
                "Year of manufacture: " + car.yearOfManufacture + '\'' +
                "Number of doors:" + getNumberOfDoors();
    }*/

    public String toString() {
        return "This Car is: " + '\'' +
                "Manufacturer: " + manufacturer + '\'' +
                "Model: " + model + '\'' +
                "Year of manufacture: " + yearOfManufacture + '\'' +
                "Number of doors:" + getNumberOfDoors();
    }

}
