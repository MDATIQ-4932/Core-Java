
package annimal;


public class Annimal {

    public static void main(String[] args) {
  
 Annimal[] annimals =new Annimal[3];
      annimals[0] = new Dog();
        annimals[0] = new Cat();
         annimals[0] = new Dog();
        for (Annimal animal : annimals) {
            animal.makeSound(); 
    }
    }  

    private void makeSound() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
