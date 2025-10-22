package DTO;

public class VeBanDTO {
	private String MaVeBan;
	private int SoLuongBan;
	private String ViTriCho;
	private String MaVe;
	private String MaNhanVien;
	private String MaKhachHang;
	
	public VeBanDTO() {}
	
	public String getMaVeBan() {
		return MaVeBan;
	}
	public void setMaVeBan(String maVeBan) {
		MaVeBan = maVeBan;
	}
	public int getSoLuongBan() {
		return SoLuongBan;
	}
	public void setSoLuongBan(int soLuongBan) {
		SoLuongBan = soLuongBan;
	}
	public String getViTriCho() {
		return ViTriCho;
	}
	public void setViTriCho(String viTriCho) {
		ViTriCho = viTriCho;
	}
	public String getMaVe() {
		return MaVe;
	}
	public void setMaVe(String maVe) {
		MaVe = maVe;
	}
	public String getMaNhanVien() {
		return MaNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		MaNhanVien = maNhanVien;
	}
	public String getMaKhachHang() {
		return MaKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		MaKhachHang = maKhachHang;
	}
	@Override
	public String toString() {
		return "VeBanDTO [MaVeBan=" + MaVeBan + ", SoLuongBan=" + SoLuongBan + ", ViTriCho=" + ViTriCho + ", MaVe=" + MaVe
				+ ", MaNhanVien=" + MaNhanVien + ", MaKhachHang=" + MaKhachHang + "]";
	}
	
}
