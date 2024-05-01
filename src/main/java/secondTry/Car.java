package secondTry;

public class Car extends Vehicle{
    private int numberOfDoors;

    //Constructor
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

//error edition: output information will be with 'Vehicle'------
/*    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                "} " + super.toString();
    }*/

//error edition! 'super.manufacturer' is wrong! 'super.getManufacturer()'is right!
/*    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                    "manufacturer='" + super.manufacturer + '\'' +
                    ", model='" + super.model + '\'' +
                    ", yearOfManufacture=" + super.yearOfManufacture + '}';
    }*/

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                "manufacturer='" + super.getManufacturer() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", yearOfManufacture=" + super.getYearOfManufacture() + '}';
    }

}
