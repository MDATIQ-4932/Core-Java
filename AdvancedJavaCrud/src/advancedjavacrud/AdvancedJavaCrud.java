package advancedjavacrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Dbutil;

public class AdvancedJavaCrud {

    static Dbutil du = new Dbutil();
    static PreparedStatement ps;
    static String sql;

    public static void main(String[] args) {

        saveStudent("artik", "abc@gmail.com", "mohammadpur");

        System.out.println("After save");
       
        System.out.println("-------");
         showAllStudent();
        updateStudent(2, "shimul", "atik@gmail.com", "dhaka");
        System.out.println("After update");
        showAllStudent();
        System.out.println("-------");

        deletestudent(1);
        showAllStudent();
        System.out.println("-------");
        
        
        
    }

    public static void saveStudent(String name, String email, String address) {

        sql = "insert into student(name, email, address) values(?,?,?)";

        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);

            ps.executeUpdate();
            ps.close();
            du.getCon().close();
            System.out.println("save data");
            System.out.println("-------");

        } catch (SQLException ex) {
            Logger.getLogger(AdvancedJavaCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllStudent() {

        sql = "select* from student";

        try {
            ps = du.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                System.out.println(" id " + id + " name " + name + " email " + email + " address " + address);

            }
            ps.executeQuery();
            ps.close();
            rs.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvancedJavaCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deletestudent(int id) {
        sql = "delete from student where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();

            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvancedJavaCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateStudent(int id, String name, String email, String address) {

        sql = "update student set name =?,email =?,address =? where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setInt(4, id);

            ps.executeUpdate();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvancedJavaCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
