package bai2;

import java.util.Scanner;

public class tinhtienluong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* so tien luong 1 gio */
        int a = 25000;
        double tongluong = 0;
        System.out.println("so gio lam:");
        int b = scanner.nextInt();
        if (b > 40) {
            tongluong = b * (a * 1.5);
        } else {
            tongluong = a * b;
        }
        System.out.println("so tien luong nhan dc la:" + tongluong + " nghin dong");
    }
}
