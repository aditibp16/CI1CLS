class Student {
    String name;
    String dob;

    Student(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    void show() {
        System.out.println("Name is: " + name + " and Date of Birth is: " + dob);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "01-01-2000");
        student.show();
    }
}
