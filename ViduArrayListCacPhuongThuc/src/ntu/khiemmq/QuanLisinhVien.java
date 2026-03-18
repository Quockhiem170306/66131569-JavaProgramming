package ntu.khiemmq;

import java.util.ArrayList;

public class QuanLisinhVien {
	private ArrayList<SinhVien> danhSach;

    public QuanLisinhVien() {
        danhSach = new ArrayList<>();
    }

    // Hàm thêm sinh viên
    public void themSinhVien(SinhVien sv) {
        danhSach.add(sv);
    }

    // Hàm hiển thị danh sách
    public void hienThiDanhSach() {
        for (SinhVien sv : danhSach) {
            System.out.println(sv.toString());
        }
    }
    public SinhVien timTheoMa(String maSV) {
        for (SinhVien sv : danhSach) {
            if (sv.getMaSV().equals(maSV)) {
                return sv; // Tìm thấy thì trả về sinh viên đó
            }
        }
        return null; // Không thấy trả về null
    }
    public SinhVien timDiemCaoNhat() {
        if (danhSach.isEmpty()) return null;
        
        SinhVien svMax = danhSach.get(0);
        for (SinhVien sv : danhSach) {
            if (sv.getDiem() > svMax.getDiem()) {
                svMax = sv;
            }
        }
        return svMax;
    }
    
}
