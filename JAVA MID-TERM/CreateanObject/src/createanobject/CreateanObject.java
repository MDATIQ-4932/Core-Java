package createanobject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CreateanObject {

    public static void main(String[] args) {

        Map<Integer, Student> stulist = new HashMap<>();

        stulist.put(11, new Student("Atik", 25, "atik@gmail.com", 1287039));
        stulist.put(12, new Student("halima", 24, "atik@gmail.com", 425880));
        stulist.put(13, new Student("shimul", 26, "atik@gmail.com", 425880));
        stulist.put(14, new Student("reja", 26, "atik@gmail.com", 425880));

        System.out.println(stulist);

        
        
        Iterator<Map.Entry<Integer, Student>> li = stulist.entrySet().iterator();

        while (li.hasNext()) {
            Map.Entry<Integer, Student> entry = li.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
