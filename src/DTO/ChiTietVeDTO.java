package DTO;

public class ChiTietVeDTO {
	private String MaVe;
	private String LoaiVe;
	private float Gia;
	private int SoLuongConLai;
	private String MaChuyenBay;
	
	public ChiTietVeDTO() {}
	@Override
	public String toString() {
		return "ChiTietVeDTO [MaVe=" + MaVe + ", LoaiVe=" + LoaiVe + ", Gia=" + Gia + ", SoLuongConLai=" + SoLuongConLai
				+ ", MaChuyenBay=" + MaChuyenBay + "]";
	}
	public String getMaVe() {
		return MaVe;
	}
	public void setMaVe(String maVe) {
		MaVe = maVe;
	}
	public String getLoaiVe() {
		return LoaiVe;
	}
	public void setLoaiVe(String loaiVe) {
		LoaiVe = loaiVe;
	}
	public float getGia() {
		return Gia;
	}
	public void setGia(float gia) {
		Gia = gia;
	}
	public int getSoLuongConLai() {
		return SoLuongConLai;
	}
	public void setSoLuongConLai(int soLuongConLai) {
		SoLuongConLai = soLuongConLai;
	}
	public String getMaChuyenBay() {
		return MaChuyenBay;
	}
	public void setMaChuyenBay(String maChuyenBay) {
		MaChuyenBay = maChuyenBay;
	}
	
	
}
