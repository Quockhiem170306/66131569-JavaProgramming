package ntu.khiemmq;

public class NVvanphong extends NhanVien {
	private double soGioLamThem;
	private double luongThemMoiGio;
	public NVvanphong(String maNV, String hoten, double luongCB, double soGioLamThem, double luongThemMoiGio) {
		super(maNV, hoten, luongCB);
		this.soGioLamThem = soGioLamThem;
		this.luongThemMoiGio = luongThemMoiGio;
	}
	@Override
	public double Tinhluong() {
		return super.getLuongCB() + soGioLamThem*luongThemMoiGio;
	}
	@Override
	public void httt() {
		super.httt();
		System.out.println("so gio lam them: "+ soGioLamThem);
		System.out.println("luong cho moi gio lam them: "+ luongThemMoiGio);
		System.out.println("luong dc nhan: "+ Tinhluong());

	}
	@Override 
	public String toString() {
		String chuoiXuat= super.toString();
		chuoiXuat = chuoiXuat + "\nso gio lam them: "+ soGioLamThem;
		chuoiXuat = chuoiXuat + "\nluong cho moi gio lam them:"+ luongThemMoiGio;
		chuoiXuat = chuoiXuat + "\nluong dc nhan: "+ Tinhluong();
		return chuoiXuat;
	}
}
