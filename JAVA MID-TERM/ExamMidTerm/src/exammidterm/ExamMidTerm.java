package exammidterm;

import exammidterm.vehicle.truck.truck;

public class ExamMidTerm {

    public static void main(String[] args) {

        truck t = new truck();

        t.setRegularPrice(500000);
        t.setWeight(3000);

        System.out.println(t.getSalePrice());

    }
}
