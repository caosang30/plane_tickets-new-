package DTO;

public class MayBay {
    private String MaMayBay;
    private String TenMayBay;
    private int SoCho;
    private String HangSanXuat;

    public MayBay() {}

    public String getMaMayBay() {
        return MaMayBay;
    }

    public void setMaMayBay(String maMayBay) {
        MaMayBay = maMayBay;
    }

    public String getTenMayBay() {
        return TenMayBay;
    }

    public void setTenMayBay(String tenMayBay) {
        TenMayBay = tenMayBay;
    }

    public int getSoCho() {
        return SoCho;
    }

    public void setSoCho(int soCho) {
        SoCho = soCho;
    }

    public String getHangSanXuat() {
        return HangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        HangSanXuat = hangSanXuat;
    }

    @Override
    public String toString() {
        return "MayBay [MaMayBay=" + MaMayBay + ", TenMayBay=" + TenMayBay + ", SoCho=" + SoCho + ", HangSanXuat="
                + HangSanXuat + "]";
    }
}