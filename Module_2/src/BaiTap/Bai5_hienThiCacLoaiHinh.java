package BaiTap;

import java.util.Scanner;

public class Bai5_hienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triagle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }while(choice !=4);
    }
    public static void printRectangle(){
        for(int i = 0; i<4;i++){
            for(int j = 0; j<15; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void printSquareTriangle(){
        for(int i=0; i<5;i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void printIsoscelesTriangle(){
        for(int i=5;i>=1;i-- ){
            for( int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
