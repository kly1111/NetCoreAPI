package kly;

import java.util.Scanner;

public class Kly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap so n : ");
           n = sc.nextInt();
        }while (n < 0);
        int tong = 0;
        while (n != 0){
            int x = n % 10;
            tong += x;
            n /= 10;
        }
        System.out.println(tong);
    }
}
