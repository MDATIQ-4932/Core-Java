
package learninheritance;


public class Robot extends Human{
 
    private int speed;
    private String ability;

    public Robot() {
    }

    public Robot(int speed, String ability) {
        this.speed = speed;
        this.ability = ability;
    }

    public Robot(int speed, String ability, String name, int age, String intelligence) {
        super(name, age, intelligence);
        this.speed = speed;
        this.ability = ability;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "Robot{" + "speed=" + speed + ", ability=" + ability + '}';
    }

    @Override
    public void details() {
        super.details(); 
        System.out.println("speed=" + speed +"\n"+ "ability=" + ability);
        
    }
    
}
