package kly;

import java.util.Scanner;

public class Kly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number , sum = 0;
        
        do{
            System.out.println("Nhap so nguyen bat ky la : ");
            number = sc.nextInt();
            sum += number;
        }while (sum <= 100 );
        
        System.out.println("Tong cac so nguyen vua nhap la : " + sum);
    }
}
