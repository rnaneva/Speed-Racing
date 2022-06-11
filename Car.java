package DefiningClasses.Exc.SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private double distance;

    public Car(String model,double fuelAmount, double fuelCost){
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.distance = 0;
    }

    public boolean hasEnoughFuel ( double fuelCost, double distance, double fuelAmount){
        return  fuelCost * distance <= fuelAmount;
    }

    public void drive (double fuelCost, double distance){
        this.fuelAmount -= fuelCost * distance;
        this.distance += distance;
    }

    @Override
    public String toString(){
        return String.format("%s %.2f %.0f", this.model, this.fuelAmount, this.distance);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(double fuelCost) {
        this.fuelCost = fuelCost;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
