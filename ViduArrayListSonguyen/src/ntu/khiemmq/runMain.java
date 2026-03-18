package ViduArrayListSonguyen.src.ntu.khiemmq;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> dssonguyen = new ArrayList<Integer>();
		
		Scanner BanPhim = new Scanner(System.in);
		
		for(int i =0;i<10;i++) {
			System.out.print("nhap phan tu thu:" + i);
			System.out.print("a["+"]=" );
			
			Integer tam = BanPhim.nextInt();
			dssonguyen.add(tam);
			
		}
	}

}
