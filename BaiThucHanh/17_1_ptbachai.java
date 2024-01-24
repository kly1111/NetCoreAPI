

import java.util.Scanner;

public class Kly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        do{
            System.out.println("Nhap he so a : ");
            a = sc.nextDouble();
        }while (a == 0);
        System.out.println("Nhap he so b : ");
        double b = sc.nextDouble();
        System.out.println("Nhap he so c : ");
        double c = sc.nextDouble();
        double delta = Math.pow(b,2) - (4*a*c);
        if (delta < 0 ){
            System.out.println("Phuong trinh vo nghiem ! ");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep : x1 = x2 =  " + -b/2*a);
        }else 
            System.out.println("Phuong trinh co 2 nghiem phan biet ! la :");
            System.out.printf("x1 = %.2f \n",(-b + Math.sqrt(delta))/2 *a);
            System.out.printf("x2 = %.2f", (-b - Math.sqrt(delta))/2 *a);
        }
        sc.close();
    }
