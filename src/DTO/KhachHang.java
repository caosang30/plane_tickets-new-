package DTO;

public class KhachHang {
    private String MaKH;
    private String TenKH;
    private String SoDienThoai;
    private String TenDN;
    private String MatKhau;
    private String CCCD;
    private String GioiTinh;
    private String DiaChi;
    private String Email;

    public KhachHang() {}

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String tenKH) {
        TenKH = tenKH;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public String getTenDN() {
        return TenDN;
    }

    public void setTenDN(String tenDN) {
        TenDN = tenDN;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String cCCD) {
        CCCD = cCCD;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "KhachHang [MaKH=" + MaKH + ", TenKH=" + TenKH + ", SoDienThoai=" + SoDienThoai + ", TenDN=" + TenDN
                + ", MatKhau=" + MatKhau + ", CCCD=" + CCCD + ", GioiTinh=" + GioiTinh + ", DiaChi=" + DiaChi
                + ", Email=" + Email + "]";
    }
}