package bai2;

import java.util.Scanner;

public class timx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("tim nghiem x theo cong thuc ax + b =0 ");
        System.out.println("nhap a:");
        int a = scanner.nextInt();
        System.out.println("nhap b:");
        int b = scanner.nextInt();
        x = (0 - b) / a;
        System.out.println("nghiem x = " + x);
    }
}
