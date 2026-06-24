// Person class
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

// Student class inherits Person
class Student extends Person {
    private final String studentId; // final attribute
    protected double gpa;

    public Student(String name, int age, String studentId, double gpa) {
        super(name, age); // call Person constructor
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId +
               ", gpa=" + gpa +
               ", " + super.toString() + "]";
    }
}

// GradStudent class inherits Student
class GradStudent extends Student {
    private String thesis;

    public GradStudent(String name, int age, String studentId,
                       double gpa, String thesis) {
        super(name, age, studentId, gpa); // call Student constructor
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return "GradStudent [thesis=" + thesis +
               ", " + super.toString() + "]";
    }
}

// Main class
public class UniversityDemo {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Rahul",
                24,
                "GS101",
                9.1,
                "Artificial Intelligence");

        System.out.println(gs);

        // Demonstrating IS-A relationship
        Student s = gs; // GradStudent IS-A Student
        Person p = gs;  // GradStudent IS-A Person

        System.out.println("\nIS-A Relationship:");
        System.out.println("gs instanceof GradStudent: "
                           + (gs instanceof GradStudent));
        System.out.println("gs instanceof Student: "
                           + (gs instanceof Student));
        System.out.println("gs instanceof Person: "
                           + (gs instanceof Person));
    }
}