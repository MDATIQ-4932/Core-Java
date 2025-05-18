
package learninheritanceVehical;


public class Vehical {
  
 private int speed;
 private String brand;

    public Vehical() {
    }

    public Vehical(int speed, String brand) {
        this.speed = speed;
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehical{" + "speed=" + speed + ", brand=" + brand + '}';
    }
    
   public void details(){
       System.out.println(" speed "+ speed +" brand "+ brand +"\n");
   
   }
 
}
