import java.util.Scanner;

public class baitoanpheptinh {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double a = sc.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double b = sc.nextDouble();

        System.out.println("Kết quả phép tính:");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));

        sc.close();
    }
}
