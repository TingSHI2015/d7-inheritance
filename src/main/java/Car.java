public class Car extends Vehicle {
    private int numberOfDoors;     //if there's also a kids-class of Car, here 'protected' instedad of 'private'

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }


    @Override
    public String toString(Car car) {       //if write 'Vehicle car' in (), another meaning
        return "This Car is: " + '\'' +
                "Manufacturer: " + car.manufacturer + '\'' +
                "Model: " + car.model + '\'' +
                "Year of manufacture: " + car.yearOfManufacture + '\'' +
                "Number of doors:" + getNumberOfDoors();
    }





}
