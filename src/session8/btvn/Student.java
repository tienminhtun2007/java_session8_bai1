package session8.btvn;

public class Student {
    int id;
    String name;
    int age;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Student student1 = new Student(1, "A", 15);
        System.out.println("ID: " + student1.id + ", Name: " + student1.name + ", Age: " + student1.age);
    }
}
