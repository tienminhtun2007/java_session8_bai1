package session5.btvn;

public class SoSanhString {
    public static void main(String[] args) {
        String str1 = "Hello";
        StringBuffer str2 = new StringBuffer("Hello");
        StringBuilder sb = new StringBuilder("Hello");
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            str1 += " World";
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với String: " + (endTime1 - startTime1) + " ms");
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            str2.append(" World");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với StringBuffer: " + (endTime2 - startTime2) + " ms");
        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sb.append(" World");
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với StringBuilder: " + (endTime3 - startTime3) + " ms");

        System.out.println("Nhận xét:");
        System.out.println("- String: Không hiệu quả cho phép nối chuỗi nhiều lần do tạo ra nhiều đối tượng mới.");
        System.out.println("- StringBuilder: Hiệu quả và nhanh chóng, thích hợp cho nhiều thao tác nối chuỗi trong một luồng.");
        System.out.println("- StringBuffer: Tương tự như StringBuilder nhưng an toàn với đa luồng, có thể chậm hơn một chút do đồng bộ hóa.");
    }
}
