package BaiTap;

import java.util.Scanner;
public class Bai3_ChuyenDoiTienTe {
    public static void main (String[]args){
        long usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số tiền USD cần chuyển đổi: ");
        usd = scanner.nextLong();
        long result = usd*23000;
        System.out.print("Giá tiền sau khi chuyển đồi là: " + result + "VND");

    }
}
