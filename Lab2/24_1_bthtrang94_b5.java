package kly;

import java.util.Scanner;

public class Kly {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
         int sum = 0, number;
         while(sum <= 100){
             System.out.print("Nhap 1 so bat ki : ");
             number = sc.nextInt();
             sum += number;
         }
         System.out.println("Tong cac so vua nhap la : " + sum);
         sc.close();
    }
}
