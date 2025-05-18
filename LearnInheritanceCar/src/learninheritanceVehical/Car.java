
package learninheritanceVehical;


public class Car extends Vehical{
    
    private int numberOfDoors;
    
 public Car() {
    }
    
    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(int numberOfDoors, int speed, String brand) {
        super(speed, brand);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car{");
        sb.append("numberOfDoors=").append(numberOfDoors);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void details() {
        super.details();
        System.out.println(numberOfDoors);
    } 
    
}
