package session6.btvn;
import java.util.Scanner;
import java.util.Arrays;
public class QuanLiDiemSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] score = null;
        int n = 0;
        boolean running = true;
        while (running) {
            System.out.println("*******************QUẢN LÝ ĐIỂM SV********************");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số lượng sinh viên đạt và trượt");
            System.out.println("6. Sắp xếp điểm tăng dần");
            System.out.println("7. Thống kê số lượng sinh viên giỏi và xuất sắc");
            System.out.println("8. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập số sinh viên: ");
                    n  = Integer.parseInt(sc.nextLine());
                    score = new double[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
                        score[i] = Double.parseDouble(sc.nextLine());
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Danh sách điểm:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("SV" + (i + 1) + ":" + score[i]);
                    }
                    break;
                case 3:
                    double sum = 0.0;
                    for (int i = 0; i < n; i++) {
                        sum += score[i];
                    }
                    double avg = sum / n;
                    System.out.printf("Điểm trung bình của các sinh viên là: %.f", avg);
                    break;
                case 4:
                    double max = 0.0;
                    double min = 0.0;
                    for (int i = 0; i < n; i++) {
                        if (score[i] > max) {
                            max = score[i];
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        if (score[i] < min) {
                            min = score[i];
                        }
                    }
                    System.out.println("Điểm cao nhất là: " + max);
                    System.out.print("Điểm thấp nhất là" + min);
                    break;
                case 5:
                    int count = 0;
                    int count1 = 0;
                    for (double num : score) {
                        if (num >= 5.0) {
                            count++;
                        } else {
                            count1++;
                        }
                    }
                    System.out.println("Số sinh viên đạt là: " + count);
                    System.out.print("Số sinh viên trượt là: "+ count1);
                    break;
                case 6:
                    Arrays.sort(score);
                    System.out.print("Danh sách sau khi sắp xếp: " + score);
                    break;
                case 7:
                    int count2 = 0;
                    int count3 = 0;
                    for (double num : score) {
                        if (num >= 8.0) {
                            count2++;
                        }
                    }
                    System.out.println("Số sinh viên giỏi và xuất sắc là: " + count2);
                    break;
                default:
                    System.out.print("Đã thoát chương trình");
                    running = false;
            }
        }
    }
}
