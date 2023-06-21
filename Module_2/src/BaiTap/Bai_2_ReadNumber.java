package BaiTap;

import java.util.Scanner;

public class Bai_2_ReadNumber {
    private static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String convertToWord(int number) {
        if (number == 0) {
            return "zero";
        }
        if (number < 0 || number > 999) {
            return "Số nhập vào không đúng điều kiện, vui lòng nhập vào số có giá trị tối đa 3 chữ số";
        }
        if (number < 20) {
            return units[number];
        }
        if (number < 100) {
            return tens[number/10] + units[number % 10];
        }
        return units[number / 100] + " hundred and " + convertToWord(number % 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số có tối đa 3 chữ số: ");
        int number = scanner.nextInt();
        String result = convertToWord(number);
        System.out.println(result);
    }
}
