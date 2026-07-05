package session5.btvn;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KiemTraEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập địa chỉ email: ");
        String email = input.nextLine();
        email = email.trim().toLowerCase();
        String regex = "^[\\w.]+@[0-9a-z.]+\\.[a-z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.print("Email hợp lệ");
        } else {
            System.out.print("Email không hợp lệ");
        }
    }
}
