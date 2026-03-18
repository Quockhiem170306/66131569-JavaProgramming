package ViduArrayListSonguyen.src.ntu.khiemmq;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> dssonguyen = new ArrayList<Integer>();
		
		Scanner BanPhim = new Scanner(System.in);
		
		for(int i =0;i<10;i++) {
			//System.out.print("nhap phan tu thu:" + i);
			System.out.print("a["+i+ "]= " );
			
			Integer tam = BanPhim.nextInt();
			dssonguyen.add(tam);
			
		}
		System.out.print("danh sach vua nhap la: ");
		for(int i =0; i < dssonguyen.size();i++) {
			Integer tam = dssonguyen.get(i);
			System.out.printf(tam+ " ");
		}
		int soluongptuchan= 0;
		for(int i= 0;i < dssonguyen.size();i++) {
			Integer tam = dssonguyen.get(i);
			if(tam % 2 == 0) soluongptuchan = soluongptuchan+1;
		}
		System.out.print("\n so luong phan tu chan la: "+ soluongptuchan);
	}

}
