abstract class InstitutionMember {
    public abstract String getRole();
}

class Person extends InstitutionMember {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getRole() {
        return "Person";
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age + " ";
    }
}

class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public String toString() {
        return super.toString() + "Role: " + getRole();
    }
}

public class UniManagement {
    public static void main(String[] args) {
        Student student = new Student("Borna", 23);
        System.out.println(student.toString());
    }
}
