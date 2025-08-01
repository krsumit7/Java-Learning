import java.util.Scanner;

public class StudentInfo {
    String name;
    int rollNo;
    double mobileNo;
    String email;
    int age;
    String course;
    String state;

    // Constructor
    StudentInfo(String n, int r, double m, String e, int a, String c, String s) {
        this.name = n;
        this.rollNo = r;
        this.mobileNo = m;
        this.email = e;
        this.age = a;
        this.course = c;
        this.state = s;
    }

    // Display student information
    void display() {
        System.out.println("----- Student Information -----");
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNo);
        System.out.println("Mobile No : " + mobileNo);
        System.out.println("Email     : " + email);
        System.out.println("Age       : " + age);
        System.out.println("Course    : " + course);
        System.out.println("State     : " + state);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter mobile number: ");
        double mobileNo = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        System.out.print("Enter state: ");
        String state = sc.nextLine();

        StudentInfo s1 = new StudentInfo(name, rollNo, mobileNo, email, age, course, state);
        s1.display();

        sc.close();
    }
}
