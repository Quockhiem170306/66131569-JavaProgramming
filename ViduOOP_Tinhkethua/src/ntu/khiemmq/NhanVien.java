package ntu.khiemmq;

public class NhanVien {
	private String maNV;
	private String Hoten;
	private double luongCB;
	
	public NhanVien(String maNV, String hoten,double luongCB) {
		super();
		this.maNV = maNV;
		this.Hoten = hoten;
		this.luongCB = luongCB;
	}
	public NhanVien() {
		super();
	}
	public double Tinhluong() {
		return luongCB;
	}
	@Override
	public String toString() {
		return "NhanVien \nmaNV=" + maNV + " \nHoten= " + Hoten + "\nluongCB=" + luongCB;
		
	}
}
