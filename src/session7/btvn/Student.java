package session7.btvn;

public class Student {
    String studentId;
    String studentName;
    int age;
    public void displayData() {
        System.out.println("========THÔNG TIN SINH VIÊN========");
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Tuổi: " + age);
    }
}
