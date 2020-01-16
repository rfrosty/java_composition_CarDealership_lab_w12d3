package cars;

import carComponents.Engine;
import carComponents.Tyre;

public abstract class CarVehicle {

    private double price;
    private ColourType colour;
    private Engine engine;
    private Tyre[] tyres;
    private boolean damage;
    private boolean engineStarted;
    private int distanceTravelled;

    public CarVehicle(double price, ColourType colour, Engine engine){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = new Tyre[4];
        this.damage = false;
        this.engineStarted = false;
        this.distanceTravelled = 0;

    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double Price){
        this.price = price;
    }

    public void reevaluatePrice(){
        if (this.damage == true){
            this.price = (this.price * 0.7);
        }
    }

    public ColourType getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre[] getTyres() {
        return tyres;
    }

    public boolean isDamage() {
        return damage;
    }

    public void setDamage(boolean damage) {
        this.damage = damage;
    }

    public void startEngine(){
        this.engineStarted = true;
    }

    public void stopEngine(){
        this.engineStarted = false;
    }

    public void go(int distance){
        if (this.engineStarted == true){
            this.distanceTravelled += distance;
            System.out.println("Driving!");
        }
        System.out.println("Engine isn't started");
    }

}
