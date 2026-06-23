package session1.btvn;
import java.util.Scanner;
public class Bai2_ToanTuSoHoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất (firstNumber): ");
        int firstNumber =  sc.nextInt();
        System.out.print("Nhập số thứ 2 (secondNumber): ");
        int secondNumber = sc.nextInt();
        int tong = firstNumber + secondNumber;
        System.out.println("Tổng: " + tong);
        int hieu = firstNumber - secondNumber;
        System.out.printf("Hiệu: %d%n", hieu);
        int thuong = firstNumber / secondNumber;
        System.out.printf("Thương: %d%n", thuong);
        int phanDu = firstNumber % secondNumber;
        System.out.printf("Phần dư: %d", phanDu);
    }
}
