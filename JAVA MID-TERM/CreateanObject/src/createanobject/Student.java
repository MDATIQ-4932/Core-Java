package createanobject;

public class Student {

    private String name;
    private int age;
    private String email;
    private int id;

    public Student() {
    }

    public Student(String name, int age, String email, int id) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 
  
}
