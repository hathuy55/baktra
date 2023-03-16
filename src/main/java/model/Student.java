package model;


public class Student implements Comparable<Student> {
private long id;
private String full_name;
private int gender;
private int date;
private  String address;
private int phone;
private  String email;
private int gpa;

    public Student() {
    }

    public Student(long id, String full_name, int gender, int date, String address, int phone, String email, int gpa) {
        this.id = id;
        this.full_name = full_name;
        this.gender = gender;
        this.date = date;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.gpa = gpa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student[" +
                "id=" + id +
                ", full_name='" + full_name + '\'' +
                ", gender=" + gender +
                ", date=" + date +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", gpa=" + gpa +
                ']';
    }
    public int compareTo(Student o) {
        if (this.gpa > o.gpa) {
            return 1;
        } else if (this.gpa < o.gpa) {
            return -1;
        }
        return 0;
    }
}
