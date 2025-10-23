package DTO;

public class DuongBay {
    private String MaDuongBay;
    private String TenDuongBay;
    private String ViTri;

    public DuongBay() {}

    public String getMaDuongBay() {
        return MaDuongBay;
    }

    public void setMaDuongBay(String maDuongBay) {
        MaDuongBay = maDuongBay;
    }

    public String getTenDuongBay() {
        return TenDuongBay;
    }

    public void setTenDuongBay(String tenDuongBay) {
        TenDuongBay = tenDuongBay;
    }

    public String getViTri() {
        return ViTri;
    }

    public void setViTri(String viTri) {
        ViTri = viTri;
    }

    @Override
    public String toString() {
        return "DuongBay [MaDuongBay=" + MaDuongBay + ", TenDuongBay=" + TenDuongBay + ", ViTri=" + ViTri + "]";
    }
}