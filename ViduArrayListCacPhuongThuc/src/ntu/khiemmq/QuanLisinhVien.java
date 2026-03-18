package ntu.khiemmq;

import java.util.ArrayList;
import java.util.List;

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
    public double tinhDiemTrungBinh() {
        if (danhSach.isEmpty()) return 0;
        
        double tongDiem = 0;
        for (SinhVien sv : danhSach) {
            tongDiem += sv.getDiem();
        }
        return tongDiem / danhSach.size();
    }
    public List<SinhVien> locSinhVienTheoDiem(double diemSanh) {
        List<SinhVien> dsLoc = new ArrayList<>();
        for (SinhVien sv : danhSach) {
            if (sv.getDiem() >= diemSanh) {
                dsLoc.add(sv);
            }
        }
        return dsLoc;
    }
    public void sapXepTheoDiem() {
        danhSach.sort((sv1, sv2) -> Double.compare(sv2.getDiem(), sv1.getDiem()));
        
    }
    public void xoaSinhVien(String maSV) {
        danhSach.removeIf(sv -> sv.getMaSV().equals(maSV));
    }
    public void hienThiHaiSinhVienDauTien() {
        if (danhSach.size() >= 2) {
            List<SinhVien> subList = danhSach.subList(0, 2);//dung danh sach con de lay 2 sinh viwn dau tien
            for (SinhVien sv : subList) {
                System.out.println(sv.toString());
            }
        } else {
            hienThiDanhSach(); // Nếu ít hơn 2 người thì in hết
        }
    }
}
