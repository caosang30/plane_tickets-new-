package DTO;

public class ChuyenBay {
    private String MaChuyenBay;
    private String NgayDi;
    private String GioBay;
    private String ThoiGianDuKien;
    private String DiemDi;
    private String DiemDen;
    private String MaMayBay;
    private String MaDuongBay;

    public ChuyenBay() {}

    public String getMaChuyenBay() {
        return MaChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        MaChuyenBay = maChuyenBay;
    }

    public String getNgayDi() {
        return NgayDi;
    }

    public void setNgayDi(String ngayDi) {
        NgayDi = ngayDi;
    }

    public String getGioBay() {
        return GioBay;
    }

    public void setGioBay(String gioBay) {
        GioBay = gioBay;
    }

    public String getThoiGianDuKien() {
        return ThoiGianDuKien;
    }

    public void setThoiGianDuKien(String thoiGianDuKien) {
        ThoiGianDuKien = thoiGianDuKien;
    }

    public String getDiemDi() {
        return DiemDi;
    }

    public void setDiemDi(String diemDi) {
        DiemDi = diemDi;
    }

    public String getDiemDen() {
        return DiemDen;
    }

    public void setDiemDen(String diemDen) {
        DiemDen = diemDen;
    }

    public String getMaMayBay() {
        return MaMayBay;
    }

    public void setMaMayBay(String maMayBay) {
        MaMayBay = maMayBay;
    }

    public String getMaDuongBay() {
        return MaDuongBay;
    }

    public void setMaDuongBay(String maDuongBay) {
        MaDuongBay = maDuongBay;
    }

    @Override
    public String toString() {
        return "ChuyenBay [MaChuyenBay=" + MaChuyenBay + ", NgayDi=" + NgayDi + ", GioBay=" + GioBay
                + ", ThoiGianDuKien=" + ThoiGianDuKien + ", DiemDi=" + DiemDi + ", DiemDen=" + DiemDen + ", MaMayBay="
                + MaMayBay + ", MaDuongBay=" + MaDuongBay + "]";
    }
}