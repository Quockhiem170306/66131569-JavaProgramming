package bai2;
import java.util.Scanner;

public class quydoitiente {
    public static void main(String[] args) {
        double DV = 23500;
        double RD = 27000;
        double tongtienDV;
        double tongtienRV;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien(USD): ");
        double USD = scanner.nextDouble();
        tongtienDV = USD * DV;
        System.out.println("nhap so tien(EUR): ");
        double eur = scanner.nextDouble();
        tongtienRV = eur * RD;
        System.out.println("tong so tien USD sang VND la:" + tongtienDV + " VND");
        System.out.println("tong so tien EUR sang VND la:" + tongtienRV + " VND");
    }
}