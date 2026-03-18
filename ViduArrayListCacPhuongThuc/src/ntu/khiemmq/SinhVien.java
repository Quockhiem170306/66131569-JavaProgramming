package ViduArrayListCacPhuongThuc.src.ntu.khiemmq;

public class SinhVien {
	private String maSV;
    private String hoTen;
    private double diem;

    // Hàm khởi tạo
    public SinhVien(String maSV, String hoTen, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diem = diem;
    }

    // Hàm để in thông tin sinh viên
    public String toString() {
        return "Mã SV: " + maSV + " | Tên: " + hoTen + " | Điểm: " + diem;
    }
}
