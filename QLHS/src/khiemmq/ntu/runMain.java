package khiemmq.ntu;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {
	public static void main(String[] arg) {
		Hocsinh hs1 = new Hocsinh();
		String tenHS1= "Tran Van A";
		hs1.setTenHS(tenHS1);
		short tuoiHS1 = 14;
		hs1.setTuoiHS(tuoiHS1);
		String lopHS1 = "6C";
		hs1.setLopHS(lopHS1);
		Hocsinh hs2 = new Hocsinh("Nguyen Phuc K",(short) 12,"8J");
		
		System.out.println(hs1.toString());
		System.out.println(hs2.toString());
		
		//======================================================================a
		Hocsinh hs3 = new Hocsinh();
		Scanner banphim = new Scanner(System.in);
		System.out.println("Nhap ten Hoc sinh thu 3: ");
		String tenHS3= banphim.nextLine();
		hs3.setTenHS(tenHS3);	
		System.out.println("Nhap tuoi Hoc sinh thu 3: ");
		short tuoiHS3= banphim.nextShort();
		hs3.setTuoiHS(tuoiHS3);
		banphim.nextLine();
		System.out.println("Nhap lop Hoc sinh thu 3: ");
		String lopHS3= banphim.nextLine();
		hs3.setLopHS(lopHS3);
		
		System.out.println(hs3.toString());
		
		ArrayList<Hocsinh> dsHocsinh = new ArrayList<Hocsinh>();
		Scanner point = new Scanner(System.in);
		System.out.println("cho biet so luong hoc sinh can nhap: ");
		int N = point.nextInt();
		point.nextLine();
		for (int i = 0;i<N;i++) {
			Hocsinh hsi = new Hocsinh();
			
			System.out.println("Nhap ten Hoc sinh thu: "+i);
			String tenHSi= point.nextLine();
			hsi.setTenHS(tenHSi);	
			System.out.println("Nhap tuoi Hoc sinh thu: "+i);
			short tuoiHSi= point.nextShort();
			hsi.setTuoiHS(tuoiHSi);
			point.nextLine();
			System.out.println("Nhap lop Hoc sinh thu: "+i);
			String lopHSi= point.nextLine();
			hsi.setLopHS(lopHSi);
			
			dsHocsinh.add(hsi);
		}
		for(int i = 0;i<N;i++) {
			System.out.println(dsHocsinh.get(i).toString());
		}
		Hocsinh hsthem = new Hocsinh();
		Scanner b1 = new Scanner(System.in);
		System.out.println("Nhap ten Hoc sinh them: ");
		String hsthem1= b1.nextLine();
		hs3.setTenHS(hsthem1);	
		System.out.println("Nhap tuoi Hoc sinh them: ");
		short hsthem2= b1.nextShort();
		hs3.setTuoiHS(hsthem2);
		b1.nextLine();
		System.out.println("Nhap lop Hoc sinh them: ");
		String hsthem3= b1.nextLine();
		hs3.setLopHS(hsthem3);
		dsHocsinh.add(hsthem);
		
		for(int i =0;i<N;i++) {
			System.out.println(dsHocsinh.get(i).toString());
		}
		for(int i = 0;i<N;i++) {
			Hocsinh hstim = dsHocsinh.get(i);
			if (hstim.getTenHS() == "k") {
				dsHocsinh.remove(hstim);
				break;
			}
		}
		for(int i =0;i<N;i++) {
			System.out.println(dsHocsinh.get(i).toString());
		}
	}
}