package session5.btvn;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KiemTraMatKhau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập mật khẩu: ");
        String password = input.nextLine();
        password = password.trim();
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#\\$!%]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.print("Mật khẩu hợp lệ");
        } else {
            System.out.print("Mật khẩu không hợp lệ");
        }
    }
}
