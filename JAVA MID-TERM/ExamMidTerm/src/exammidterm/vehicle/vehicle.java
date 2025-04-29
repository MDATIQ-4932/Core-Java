package exammidterm.vehicle;

public class vehicle {

    public int speed;
    public double regularPrice;
    public String color;
    public double getPrice;

    public vehicle() {
    }

    public vehicle(int speed, double regularPrice, String color, double getPrice) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
        this.getPrice = getPrice;

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

    public double getSalePrice() {

        return regularPrice;
    }

}
