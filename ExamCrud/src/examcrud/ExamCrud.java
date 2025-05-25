package examcrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class ExamCrud {

    static DbUtil du = new DbUtil();
    static PreparedStatement ps;
    static String sql;

    public static void main(String[] args) {

        saveStuent("atik", "ask@gmail.com", "dhaka");

        System.out.println(" After save");

        System.out.println("------------------");

        showAllStudent();
        updateStudent(2, "imran", "imran@gmail.com", "mohammadpur");
        System.out.println(" After update");
        showAllStudent();

        System.out.println("----------");

        deleteStudent(2);
        showAllStudent();
        System.out.println("---------------");

    }

    public static void saveStuent(String name, String email, String address) {

        sql = "insert into student(name, email, address) values(?,?,?)";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);

            ps.executeUpdate();
            ps.close();
            du.getCon().close();

            System.out.println("Save Data");
            System.out.println("-------------");

        } catch (SQLException ex) {
            Logger.getLogger(ExamCrud.class.getName()).log(Level.SEVERE, null, ex);
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
                System.out.println("id " + id + "name " + name + "email " + email + "address " + address);

            }
            ps.executeQuery();
            ps.close();
            rs.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(ExamCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteStudent(int id) {
        sql = "delete from student where id=?";

        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(ExamCrud.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ExamCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
