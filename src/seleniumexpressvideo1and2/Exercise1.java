package seleniumexpressvideo1and2;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Arun", 20, 9876543210L);
        Student s2 = new Student(102, "Priya", 21, 9876543211L);
        Student s3 = new Student(103, "Kumar", 26, 9876543212L);
        Student s4 = new Student(104, "Divya", 19, 9876543213L);
        Student s5 = new Student(105, "Rahul", 26, 9876543214L);
        Student s6 = new Student(106, "Sneha", 20, 9876543215L);
        Student s7 = new Student(107, "Vijay", 21, 9876543216L);
        Student s8 = new Student(108, "Anitha", 22, 9876543217L);
        Student s9 = new Student(109, "Karthik", 19, 9876543218L);
        Student s10 = new Student(110, "Meena", 26, 9876543219L);

        List<Student> students = Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
         students.stream()
                .filter(student -> student.getAge() >  25)
                .limit(2)
                 .forEach(student -> System.out.println(student.getStudentName()));
    }
}

class Student {

    // Fields
    private int id;
    private String studentName;
    private int age;
    private long phoneNumber;

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(int id, String studentName, int age, long phoneNumber) {
        this.id = id;
        this.studentName = studentName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Display seleniumexpressvideo1and2.Student Details
    public void displayDetails() {
        System.out.println("seleniumexpressvideo1and2.Student ID: " + id);
        System.out.println("seleniumexpressvideo1and2.Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
    }

    // seleniumexpressvideo1and2.Main Method
    public static void main(String[] args) {

        Student student = new Student(101, "John", 21, 9876543210L);

        student.displayDetails();
    }
}

