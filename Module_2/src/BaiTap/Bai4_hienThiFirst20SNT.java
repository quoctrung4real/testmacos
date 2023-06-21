package BaiTap;

import java.util.Scanner;

public class Bai4_hienThiFirst20SNT {
    public static boolean laSoNguyenTo(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng cần hiển thị: ");
        int numbers = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers) {
            if (laSoNguyenTo(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }

}
