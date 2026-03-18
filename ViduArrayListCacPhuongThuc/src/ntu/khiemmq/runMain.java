package ntu.khiemmq;

public class runMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== HỆ THỐNG QUẢN LÝ SINH VIÊN VỚI ARRAYLIST ===\n");
        QuanLisinhVien qlsv = new QuanLisinhVien();
        
        // --- ĐOẠN ĐÃ ĐƯỢC RÚT GỌN ---
        SinhVien[] duLieuMau = {
            new SinhVien("SV001", "Nguyễn Văn A", 8.5),
            new SinhVien("SV002", "Trần Thị B", 7.2),
            new SinhVien("SV003", "Lê Văn C", 6.8),
            new SinhVien("SV004", "Phạm Thị D", 9.1),
            new SinhVien("SV005", "Hoàng Văn E", 5.5)
        };
        
        for (SinhVien sv : duLieuMau) {
            qlsv.themSinhVien(sv);
        }
        qlsv.hienThiDanhSach();
	}

}
