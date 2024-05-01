package secondTry;

import java.util.Objects;

public class Vehicle {
    private String manufacturer;                //variable name begins with lowercase!
    private String model;
    private int yearOfManufacture;

    //constructor1
    public Vehicle(String manufacturer, String model, int yearOfManufacture) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    //Constructor 2: Only with this, it's possible to allow the child class to use only 2 variables!
        public Vehicle(String manufacturer, String model) {
            this.manufacturer = manufacturer;
            this.model = model;
        }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {               //toString doesn't need input in ()!!!
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return yearOfManufacture == vehicle.yearOfManufacture && Objects.equals(manufacturer, vehicle.manufacturer) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, yearOfManufacture);
    }

    public void informationOfVehicle(){
        toString();
    }
}
