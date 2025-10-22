import java.util.Objects;
import java.util.StringJoiner; // Cần thiết cho việc xây dựng chuỗi tên đệm

public class NhanVien {
    public static class HoTen {
        private String tenDem; 
        private String ten;    

        public HoTen() {}

        public HoTen(String tenDem, String ten) {
            this.tenDem = tenDem;
            this.ten = ten;
        }

        // Getters và Setters
        public String getTenDem() { return tenDem; }
        public void setTenDem(String tenDem) { this.tenDem = tenDem; }

        public String getTen() { return ten; }
        public void setTen(String ten) { this.ten = ten; }

        // Phương thức tiện ích để lấy tên đầy đủ
        public String layTenDayDu() {
            if (ten == null || ten.trim().isEmpty()) {
                return "";
            }
            if (tenDem == null || tenDem.trim().isEmpty()) {
                return ten.trim();
            }
            return tenDem.trim() + " " + ten.trim();
        }
        
        @Override
        public String toString() {
            return layTenDayDu();
        }
        
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            HoTen hoTen = (HoTen) o;
            return Objects.equals(tenDem, hoTen.tenDem) && Objects.equals(ten, hoTen.ten);
        }

        @Override
        public int hashCode() {
            return Objects.hash(tenDem, ten);
        }
    } // HẾT CLASS HoTen
    
    /*---------------------------------------------------------------- */
    // Nhan Vien
    private String idNV;
    private HoTen hoTen;
    private String chucVu;
    private String idDuongBay;
    private String gioiTinh;
    private String tenDn; 
    private String matKhau;
    private String email;

    // Constructor mặc định (Giữ nguyên)
    public NhanVien() {
    }

    // Constructor mới: Nhận Tên đầy đủ (String) và tự động tách tên đệm
    // Giả định: TỪ CUỐI CÙNG là Tên, các từ còn lại là Tên đệm.
    
    public NhanVien(String idNV, String hoTenDayDu, String chucVu, String idDuongBay, String gioiTinh) {
        this.idNV = idNV;
        this.chucVu = chucVu;
        this.idDuongBay = idDuongBay;
        this.gioiTinh = gioiTinh;
    
        
        // Logic Tách Tên
        this.hoTen = new HoTen();
        if (hoTenDayDu != null && !hoTenDayDu.trim().isEmpty()) {
            String[] words = hoTenDayDu.trim().split("\\s+");
            if (words.length > 0) {
                String ten = words[words.length - 1]; 
                String tenDem = "";
                if (words.length > 1) {
                    // Dùng StringJoiner cho hiệu suất tốt hơn StringBuilder
                    StringJoiner sj = new StringJoiner(" ");
                    for (int i = 0; i < words.length - 1; i++) {
                        sj.add(words[i]);
                    }
                    tenDem = sj.toString();
                }
                this.hoTen = new HoTen(tenDem, ten);
            }
        }
    }
    // Constructor với tài khoản đăng nhập 
    public NhanVien(String tenDn, String matKhau) {
        this.tenDn = tenDn;
        this.matKhau = matKhau;
    }
    //  Constructor đầy đủ tất cả các trường
    public NhanVien(String idNV, HoTen hoTenDayDu, String chucVu, String idDuongBay, String gioiTinh, String tenDn, String matKhau, String email) {
        this.idNV = idNV;
        this.chucVu = chucVu;
        this.idDuongBay = idDuongBay;
        this.gioiTinh = gioiTinh;
        this.tenDn = tenDn;
        this.matKhau = matKhau;
        this.email = email;
        // Logic Tách Tên
        this.hoTen = hoTenDayDu;
    }
    /*------------- */
    // ----- Getter và Setter
    public String getIdNV() { return idNV; }
    public void setIdNV(String idNV) { this.idNV = idNV; }

    public HoTen getHoTen() { return hoTen; } 
 
    public void setHoTen(HoTen hoTen) { this.hoTen = hoTen; }

    public String getChucVu() { return chucVu; }
    public void setChucVu(String chucVu) { this.chucVu = chucVu; }
    
  
    public String getIdDuongBay() { return idDuongBay; }
    public void setIdDuongBay(String idDuongBay) { this.idDuongBay = idDuongBay; }
    public String getGioiTinh() { return gioiTinh; }
    public void setGioiTinh(String gioiTinh) { this.gioiTinh = gioiTinh; }
    public String getTenDn() { return tenDn; }
    public void setTenDn(String tenDn) { this.tenDn = tenDn; }
    public String getMatKhau() { return matKhau; }
    public void setMatKhau(String matKhau) { this.matKhau = matKhau; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // --- equals() và hashCode() ---
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        NhanVien other = (NhanVien) obj;
        return Objects.equals(idNV, other.idNV);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNV);
    }

    // in thông tin đối tượng
    @Override
    public String toString() {
       
        String tenDayDu = (hoTen != null) ? hoTen.layTenDayDu() : "N/A";
        
        return "NhanVien{" +
                "idNV='" + idNV + '\'' +
                ", hoTen='" + tenDayDu + '\'' + 
                ", chucVu='" + chucVu + '\'' +
                ", idDuongBay='" + idDuongBay + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", tenDn='" + tenDn + '\'' +
                ", email='" + email + '\'' + '}';
    }
}