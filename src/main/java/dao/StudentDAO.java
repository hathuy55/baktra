package dao;
import connection.MyConnection;
import model.Student;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class StudentDAO {
    public List<Student> getAll() {
        final String sql = "SELECT * FROM `students`";
        List<Student> studentList;
        studentList = new ArrayList<>();


        try {
            Connection conn = MyConnection.getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setFull_name(rs.getString("full_name"));
                s.setGender(rs.getInt("gender"));
                s.setDate(rs.getInt("date"));
                s.setAddress(rs.getString("address"));
                s.setPhone(rs.getInt("phone"));
                s.setEmail(rs.getString("email"));
                s.setGpa(rs.getInt("gpa"));
                studentList.add(s);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return studentList;
    }

    public Student getById(long id) {
        final String sql = "SELECT * FROM `student` WHERE  `id` = " + id;
        Student s = null;

        try {
            Connection conn = MyConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                s.setId(rs.getInt("id"));
                s.setFull_name(rs.getString("full_name"));
                s.setGender(rs.getInt("gender"));
                s.setDate(rs.getInt("date"));
                s.setAddress(rs.getString("address"));
                s.setPhone(rs.getInt("phone"));
                s.setEmail(rs.getString("email"));
                s.setGpa(rs.getInt("gpa"));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
    public void insert(Student s) {
        final String sql = String.format("INSERT  INTO `Student` VALUES ( NULL,'%s','%d','%s','%s','%d','%s','%d' ) ",
                s.getId(), s.getFull_name(), s.getGender(), s.getDate(), s.getAddress(), s.getPhone(),s.getEmail(),s.getGpa()
        );
        try {
            Connection conn = MyConnection.getConnection();
            Statement stmt = conn.createStatement();
            long rs = stmt.executeUpdate(sql);

            if (rs == 0) {
                System.out.println("Thêm thất bại");
            }

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

