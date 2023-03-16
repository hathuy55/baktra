
import dao.StudentDAO;

import model.Student;

import java.util.List;
import java.util.Scanner;

public class App {
    private static StudentDAO studentDAO = new StudentDAO();

    private static void mainMenu() {
        System.out.println("------- Quản lý thông tin sinh viên ---------");
        System.out.println(" 1.Danh sách sinh viên theo bảng ");
        System.out.println(" 2. Thêm sinh viên ");
        System.out.println(" 3. Xóa một sinh vin theo mã ");
        System.out.println(" 4. Cập nhật thông tin sinh viên ");
        System.out.println(" 5. Tìm một sinh viên theo họ tên ");
        System.out.println(" 6. Sắp sếp sinh viên theo GPA ");
        System.out.println(" 7. In ra tất cả sinh viên nữ HN cps GPA trên 2.5 ");
        System.out.println(" 8. Sắp xếp sinh viên theo họ tên ");
    }

    private static void option1() {
        List<Student> studentList = studentDAO.getAll();
        System.out.printf("%-20s %-20s %-20s %-20s", " Mã SV ", "Tên ", "Giới tính ", "Địa chỉ");
        System.out.println();
        for (int i = 0; i < studentList.size(); i++) {
            Student s = studentList.get(i);
            System.out.printf("%-20d %-20s %-20d %-20s\n", s.getId(), s.getFull_name(), s.getGender(), s.getAddress());
        }
        ;
    }
    private static void option2(Scanner in){
        Student student = new Student();
        System.out.print("Nhập ID Sinh Viên : ");
        student.setId(in.nextInt());
        System.out.print("Nhập Họ Và Tên : ");
        student.setFull_name(in.nextLine());
        System.out.print("Nhập Giới Tính : ");
        student.setGender(in.nextInt());
        System.out.print("Nhập Ngày Sinh : ");
        student.setDate(in.nextInt());
        System.out.print("Nhập Địa Chỉ : ");
        student.setAddress(in.nextLine());
        System.out.print("Nhập Phone Number : ");
        student.setPhone(Integer.parseInt(in.nextLine()));
        System.out.print("Nhập Email : ");
        student.setEmail(in.nextLine());
        System.out.print("Nhập Điểm GPA : ");
        student.setGpa(in.nextInt());
        studentDAO.insert(student);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int option = -1;

        do {
            mainMenu();
            System.out.print("Nhập lựa chọn: ");
            option = Integer.parseInt(in.nextLine());
            // Làm thêm phàn try-catch khi người dùng nhập lỗi
            if (option < 1 || option > 9) {
                System.out.println("Vui lòng nhập lại!");
                continue;
            }

        switch (option) {
            case 1:
                option1();
                break;
            case 2:
                option2(in);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }

    }
        while (option != 0);
        in.close();

}
    }
