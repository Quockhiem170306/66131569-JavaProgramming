package ntu.khiemmq;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1 = new NhanVien("001","Nguyen Van T",360000 );
		System.out.println(nv1.toString());
		
		NVvanphong nvvp1 = new NVvanphong("002","Nguyễn Phúc Khang", 30000, 3, 10);
		System.out.println(nvvp1.toString());
//			nvvp1.httt();
	}

}
