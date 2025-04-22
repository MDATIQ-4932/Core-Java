package student.student;

public class student {

    private String name;
    private String email;
    private int id;
    private String courseName;
    private String centerName;
    private String address;
    private int contact;

    public student() {
    }

    public student(String name, String email, int id, String courseName, String centerName, String address, int contact) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.courseName = courseName;
        this.centerName = centerName;
        this.address = address;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCenterName() {
        return centerName;
    }

    public String getAddress() {
        return address;
    }

    public int getContact() {
        return contact;
    }

    public student(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", email=" + email + ", id=" + id + ", courseName=" + courseName + ", centerName=" + centerName + ", address=" + address + ", contact=" + contact + '}';
    }
      
}
