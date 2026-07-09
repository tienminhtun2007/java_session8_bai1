package session8.btvn;

public class CurrencyConverter {
    private static double rate = 0;
    public static void setRate(double r) {
        if (r < 0) {
            System.out.println("Tỉ giá phải lớn hơn 0");
        } else {
            rate = r;
            System.out.println("Đã cập nhật tỉ giá thành công");
        }
    }
    public static double getRate() {
        return rate;
    }
    public static double toUSD(int vnd) {
        if (rate == 0) {
            System.out.println("Hãy thiết lập tỉ giá trước khi chuyển đổi");
            return 0;
        }
        if (vnd < 0) {
            System.out.println("Số dư không được phép âm");
            return 0;
        }
        return vnd / rate;
    }
}
