package kly;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Javasql {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 0 && b == 0){
            System.out.println("Vo so nghiem");
        }else if(a == 0 && b != 0){
            System.out.println("Vo nghiem");
        }else
            System.out.printf("x = %.2f\n" ,(float)-b/a);
    }
}