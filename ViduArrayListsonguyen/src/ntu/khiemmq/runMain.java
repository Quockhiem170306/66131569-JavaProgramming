package ntu.khiemmq;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khai Bao Danh Sach
			ArrayList<Integer> dssonguyen = new ArrayList<Integer>();
			//Nhap 10 phan tu tu ban phim;
			Scanner banPhim = new Scanner(System.in);
			for(int i = 0;i<10; i++) {
				//nhap 1 phan tu
				// In ra 1 huong dan cho nguoi dung
			System.out.print("nhap phan tu thu "+ i);
				// cho user nhap, cat vao bien tam
			Integer tam = banPhim.nextInt();
			dssonguyen.add(tam);
			}
	}

}
