
package learninheritanceVehical;


public class LearnInheritanceCar {

   
    public static void main(String[] args) {
    
        Car c = new Car();
        Bike b = new Bike();
        
        
        c.setBrand("bmw");
        c.setNumberOfDoors(10);
        c.setSpeed(250);
        
        b.setBrand("royal");
        b.setHasCareerBike(5);
        b.setSpeed(200);
        
        b.details();
        c.details();
        
    }
    
}
