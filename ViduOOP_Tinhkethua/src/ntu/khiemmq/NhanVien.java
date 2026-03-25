package ntu.khiemmq;

public class NhanVien {
	protected String maNV;
	protected String Hoten;
	protected double luongCB;
	
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
	public void httt() {
		System.out.println("mã NV: "+maNV);
		System.out.println("họ tên: "+Hoten);
		System.out.println("Lương cơ bản: "+luongCB);

	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public double getLuongCB() {
		return luongCB;
	}
	public void setLuongCB(double luongCB) {
		this.luongCB = luongCB;
	}

	
}
