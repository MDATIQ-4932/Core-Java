package exammidterm.vehicle.truck;

import exammidterm.vehicle.vehicle;

public class truck extends vehicle {

    public int weight;

    public truck() {
    }

    public truck(int weight) {
        this.weight = weight;
    }

    public truck(int weight, int speed, double regularPrice, String color, double getPrice) {
        super(speed, regularPrice, color, getPrice);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getGetPrice() {
        return getPrice;
    }

    public void setGetPrice(double getPrice) {
        this.getPrice = getPrice;
    }

   
    
    @Override
    public double getSalePrice() {
        double result = 0;

        final double dis = 0.10;

        if (weight > 2000) {

            result = regularPrice - (regularPrice * dis);

        } else {

            result = regularPrice;

        }

        return result;
    }

}
