public class Motorcycle extends Vehicle {
//    private int numberOfWheels;
    private String type;

    public Motorcycle(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

/*    @Override
    public String toString(Motorcycle motorcycle){
        return "This Motocycletype is: " + motorcycle.type;
    }*/

    @Override
    public String toString(){
        return "This Motocycletype is: " + type;
    }
}
