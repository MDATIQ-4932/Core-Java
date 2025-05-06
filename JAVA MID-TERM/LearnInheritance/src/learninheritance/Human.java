
package learninheritance;


public class Human {
   
   
    
    private String name;
     private int age;
     private String intelligence;

    public Human() {
    }

    public Human(String name, int age, String intelligence) {
        this.name = name;
        this.age = age;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(String intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + ", intelligence=" + intelligence + '}';
    }
     public void details(){
     
         System.out.println("name=" + name +"\n"+ "age=" + age +"\n"+ "intelligence=" + intelligence+"\n");
     
     }
     
}
