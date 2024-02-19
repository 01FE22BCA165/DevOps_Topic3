public class student {
    public String name;
    public String dept;
    public String program;

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Program: " + program);
    }

    public void displaydept() {

    }

    public static void main(String[] args) {
        studentcourseinfo s = new studentcourseinfo();
        s.name = "Aishwarya Koppad";
        s.dept = "MCA";
        s.program = "BCA";
        s.display();
        s.displayStudentMarks();
        s.totalStudentMarks();
        s.LessThan40();
    }
}