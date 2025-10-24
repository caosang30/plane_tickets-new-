package DTO;

import java.util.Date;

public class HoaDon {
    private String MaHoaDon;
    private String MaKhachHang;
    private String MaChuyenBay;
    private double TongTien;
    private String PhuongThucThanhToan;
    private Date NgayThanhToan;

    public HoaDon() {}

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        MaHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        MaKhachHang = maKhachHang;
    }

    public String getMaChuyenBay() {
        return MaChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        MaChuyenBay = maChuyenBay;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double tongTien) {
        TongTien = tongTien;
    }

    public String getPhuongThucThanhToan() {
        return PhuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        PhuongThucThanhToan = phuongThucThanhToan;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        NgayThanhToan = ngayThanhToan;
    }

    @Override
    public String toString() {
        return "HoaDon [MaHoaDon=" + MaHoaDon + ", MaKhachHang=" + MaKhachHang + ", MaChuyenBay=" + MaChuyenBay
                + ", TongTien=" + TongTien + ", PhuongThucThanhToan=" + PhuongThucThanhToan + ", NgayThanhToan="
                + NgayThanhToan + "]";
    }
}
