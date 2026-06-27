package session2.btvn;
import java.util.Scanner;
public class TimSoNgay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 tháng từ 1 đến 12: ");
        int month = Integer.parseInt(sc.nextLine());
        switch (month) {
            case 1,3,5,7,8,10,12:
                System.out.print("Tháng " + month + " có 31 ngày");
                break;
            case 2:
                System.out.print("Tháng " + month + " có 28 hoặc 29 ngày");
                break;
            case 4,6,9,11:
                System.out.print("Tháng " + month + " có 30 ngày");
                break;
            default:
                System.out.print("Tháng không hợp lệ");
        }
    }
}

