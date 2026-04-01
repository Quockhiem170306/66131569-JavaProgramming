package khiemmq.ntu;

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
	}
}