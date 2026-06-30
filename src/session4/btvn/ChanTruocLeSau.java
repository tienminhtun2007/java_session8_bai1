package session4.btvn;

import java.util.Scanner;

public class ChanTruocLeSau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int elementNumber = Integer.parseInt(input.nextLine());
        int[] numbers = new int[elementNumber];
        int[] numbers2 = new int[elementNumber];
        int position = 0;
        if (elementNumber == 0) {
            System.out.print("Mảng không có phần tử");
            return;
        } else {
            for (int i = 0; i < elementNumber; i++) {
                System.out.print("Phần tử thứ " + (i + 1) + ": ");
                numbers[i] = Integer.parseInt(input.nextLine());
                if (numbers[i] % 2 == 0) {
                    numbers2[position] = numbers[i];
                    position++;
                }
            }
            for (int i = 0; i < elementNumber; i++) {
                if (numbers[i] % 2 != 0) {
                    numbers2[position] = numbers[i];
                    position++;
                }
            }
        }
        System.out.println("Các phần tử sau khi đã sắp xếp là: ");
        for (int number : numbers2) {
            System.out.print(number + " ");
        }
    }
}
