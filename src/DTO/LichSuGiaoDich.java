package DTO;

import java.util.Date;

public class LichSuGiaoDich {
    private String MaGiaoDich;
    private String MaKhachHang;
    private String LoaiGiaoDich; 
    private double SoTien;
    private Date NgayGiaoDich;
    private String MoTa;

    public LichSuGiaoDich() {}

    public String getMaGiaoDich() {
        return MaGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        MaGiaoDich = maGiaoDich;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        MaKhachHang = maKhachHang;
    }

    public String getLoaiGiaoDich() {
        return LoaiGiaoDich;
    }

    public void setLoaiGiaoDich(String loaiGiaoDich) {
        LoaiGiaoDich = loaiGiaoDich;
    }

    public double getSoTien() {
        return SoTien;
    }

    public void setSoTien(double soTien) {
        SoTien = soTien;
    }

    public Date getNgayGiaoDich() {
        return NgayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        NgayGiaoDich = ngayGiaoDich;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    @Override
    public String toString() {
        return "LichSuGiaoDich [MaGiaoDich=" + MaGiaoDich + ", MaKhachHang=" + MaKhachHang + ", LoaiGiaoDich="
                + LoaiGiaoDich + ", SoTien=" + SoTien + ", NgayGiaoDich=" + NgayGiaoDich + ", MoTa=" + MoTa + "]";
    }
}
