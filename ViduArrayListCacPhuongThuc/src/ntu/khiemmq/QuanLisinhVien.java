package ViduArrayListCacPhuongThuc.src.ntu.khiemmq;

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
}
