package kly;

import java.util.Scanner;

public class Kly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban : ");
        String ten = sc.nextLine();
        System.out.println("Nhap nam sinh cua ban : ");
        int namSinh = sc.nextInt();
        int tuoi = 2024 - namSinh;
        if(tuoi >= 18 ){
            System.out.println("Ban " + ten + " da gia ");
        }
        else if (tuoi >= 16){
            System.out.println("Ban " + ten + " o do tuoi truong thanh ");
        }
        else if (tuoi < 16){
            System.out.println("Ban " + ten + " o do tuoi vi thanh nien ");
        }
    }
}
