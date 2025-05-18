
package learninheritanceVehical;


public class Bike extends Vehical {

private int hasCareerBike;

    public Bike() {
    }

    public Bike(int hasCareerBike) {
        this.hasCareerBike = hasCareerBike;
    }

    public Bike(int hasCareerBike, int speed, String brand) {
        super(speed, brand);
        this.hasCareerBike = hasCareerBike;
    }

    public int getHasCareerBike() {
        return hasCareerBike;
    }

    public void setHasCareerBike(int hasCareerBike) {
        this.hasCareerBike = hasCareerBike;
    }

    @Override
    public String toString() {
        return "Bike{" + "hasCareerBike=" + hasCareerBike + '}';
    }

    @Override
    public void details() {
        super.details(); 
        System.out.println(" hasCareerBike = " + hasCareerBike +"\n" );
    }
    
}
