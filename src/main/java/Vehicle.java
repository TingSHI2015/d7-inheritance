public class Vehicle {

    //Variables
    //as a parentClass, protected instead of private!
    protected String manufacturer;      //private String manufacturer;
    protected String model;
    protected int yearOfManufacture;

    //Constructor
    public Vehicle(String manufacturer, String model, int yearOfManufacture) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    //Getter & Setter
    public String getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override           //???if no this annotation, also works???
    public String toString(Vehicle vehicle){
        return "This Vehicle is: " + '\'' +
                "Manufacturer: " + vehicle.manufacturer+ '\'' +
                "Model: " + vehicle.model + '\'' +
                "Year of manufacture: " + vehicle.yearOfManufacture;
    }

}
