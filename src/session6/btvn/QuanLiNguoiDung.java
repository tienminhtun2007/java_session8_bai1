package session6.btvn;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuanLiNguoiDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = "";
        String email = "";
        String phone = "";
        String password = "";

        int choice;

        do {
            System.out.println("\n============== QUẢN LÝ NGƯỜI DÙNG ==============");
            System.out.println("1. Nhập thông tin người dùng");
            System.out.println("2. Chuẩn hóa họ tên");
            System.out.println("3. Kiểm tra email hợp lệ");
            System.out.println("4. Kiểm tra số điện thoại hợp lệ");
            System.out.println("5. Kiểm tra mật khẩu hợp lệ");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập họ và tên: ");
                    fullName = sc.nextLine();

                    System.out.print("Nhập email: ");
                    email = sc.nextLine();

                    System.out.print("Nhập số điện thoại: ");
                    phone = sc.nextLine();

                    System.out.print("Nhập mật khẩu: ");
                    password = sc.nextLine();
                    break;

                case 2:
                    fullName = fullName.trim().toLowerCase();
                    String[] name = fullName.split("\\s+");
                    String result = "";
                    for (int i = 0; i < name.length; i++) {
                        result += name[i].substring(0,1).toUpperCase() +  name[i].substring(1);
                        if (i != name.length - 1) {
                            result += " ";
                        }
                    }
                    fullName = result;
                    System.out.print("Tên sau khi đã chuẩn hoá: " + fullName);
                    break;

                case 3:
                    email = email.trim().toLowerCase();
                    String regex = "^[\\w.]+@[0-9a-z.]+\\.[a-z]{2,6}$";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(email);
                    if (matcher.matches()) {
                        System.out.print("Email hợp lệ");
                    } else {
                        System.out.print("Email không hợp lệ");
                    }
                    break;

                case 4:
                    phone = phone.trim();
                    String number = "^0\\d{9}$";
                    Pattern pattern1 = Pattern.compile(number);
                    Matcher matcher1 = pattern1.matcher(phone);
                    if (matcher1.matches()) {
                        System.out.print("Số điện thoại hợp lệ");
                    } else {
                        System.out.print("Số điện thoại không hợp lệ");
                    }
                    break;

                case 5:
                    password = password.trim();
                    String regex1 = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#\\$!%]).{8,}$";
                    Pattern pattern3 = Pattern.compile(regex1);
                    Matcher matcher3 = pattern3.matcher(password);
                    if (matcher3.matches()) {
                        System.out.print("Mật khẩu hợp lệ");
                    } else {
                        System.out.print("Mật khẩu không hợp lệ");
                    }
                    break;

                case 6:
                    System.out.println("Đã thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);
    }
}
