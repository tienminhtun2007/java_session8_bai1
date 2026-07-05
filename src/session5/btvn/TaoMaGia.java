package session5.btvn;
import java.util.Random;
import java.util.Scanner;
public class TaoMaGia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số nguyên n (1 <= n <= 1000): ");
        int n = Integer.parseInt(input.nextLine());
        if (n < 1 || n > 1000) {
            System.out.print("Số không hợp lệ");
            return;
        }
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            int randomIndex = rnd.nextInt(characters.length());
            sb.append(characters.charAt(randomIndex));
        }
        System.out.print("Chuỗi ngẫu nhiên được tạo ra là: " + sb.toString());
    }
}
