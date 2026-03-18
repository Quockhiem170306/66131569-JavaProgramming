package ntu.khiemmq;

import java.util.List;

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
     // Tìm sinh viên
        System.out.println("\n=== TÌM KIẾM SINH VIÊN ===");
        SinhVien sv = qlsv.timTheoMa("SV005");
        System.out.println("Tìm SV003: " + (sv != null ? sv : "Không tìm thấy"));
        System.out.println("\n=== ĐIỂM TRUNG BÌNH LỚP ===");
        System.out.printf("Điểm TB lớp: %.2f\n", qlsv.tinhDiemTrungBinh()); 
        
        // Lọc sinh viên
        System.out.println("\n=== SINH VIÊN CÓ ĐIỂM >= 8.0 ===");
        List<SinhVien> svGioi = qlsv.locSinhVienTheoDiem(8.0);
        if (!svGioi.isEmpty()) {
            svGioi.forEach(System.out::println);
        } else {
            System.out.println("Không có sinh viên nào đạt điểm >= 8.0");
        }
        
        // Sắp xếp
        System.out.println("\n=== DANH SÁCH SAU KHI SẮP XẾP (GIẢM DẦN THEO ĐIỂM) ===");
        qlsv.sapXepTheoDiem();
        qlsv.hienThiDanhSach();
        
        // Xóa sinh viên
        System.out.println("\n=== XÓA SINH VIÊN ===");
        qlsv.xoaSinhVien("SV002");
        qlsv.hienThiDanhSach();
        
        // Sử dụng subList
        System.out.println("\n=== HAI SINH VIÊN ĐẦU TIÊN ===");
        qlsv.hienThiHaiSinhVienDauTien();
	}
}
