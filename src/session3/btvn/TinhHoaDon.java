package session3.btvn;
import java.util.Arrays;
import java.util.Scanner;
public class TinhHoaDon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========== NHẬP THÔNG TIN HOÁ ĐƠN ==========");
        System.out.print("Nhập họ và tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String productName = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        double productPrice = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập số lượng mua: ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.print("Bạn có phải là thành viên không? (true/false): ");
        Boolean check = Boolean.parseBoolean(sc.nextLine());
        double firstPrice = 0.0;
        double discountPrice = 0.0;
        double VAT = 0.0;
        double finalPrice = 0.0;
        if (check) {
            firstPrice = productPrice * quantity;
            discountPrice = firstPrice * 0.1;
            VAT = firstPrice * 0.08;
            finalPrice = firstPrice - discountPrice + VAT;
        } else {
            firstPrice = productPrice * quantity;
            VAT = firstPrice * 0.08;
            finalPrice = firstPrice - VAT;
        }
        System.out.println("========== HOÁ ĐƠN ============");
        System.out.println("Khách hang: " + name);
        System.out.println("Sản phẩm: " + productName);
        System.out.println("Số lượng: " + quantity);
        System.out.printf("Đơn giá: %.3f VND%n", productPrice);
        System.out.printf("Thành tiền: %.3f VND%n", firstPrice);
        System.out.printf("Giảm giá thành viên (10%%): %.3f VND%n", discountPrice);
        System.out.printf("Tiền VAT (8%%): %.3f VND%n", VAT);
        System.out.printf("Tổng thanh toán: %.3f VND%n", finalPrice);

    }
}
