import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;

public class NhanVienManager {
    
    private List<NhanVien> danhSachNV;
    // Biến để theo dõi ID tiếp theo
    private int nextIdCounter = 1; 

    //khởi tạo danh sách
    public NhanVienManager() {
        this.danhSachNV = new ArrayList<>();
    }
    
    // Getter cho danhSachNV
    public List<NhanVien> getDanhSachNV() {
        return danhSachNV;
    }
    /*----------------------------------------------------------------------*/
    // capNhatIdCounter
    private void capNhatIdCounter() {
        if (danhSachNV.isEmpty()) {
            nextIdCounter = 1;
            return;
        }
        Optional<Integer> maxId = danhSachNV.stream()
            .filter(nv -> nv.getIdNV() != null && nv.getIdNV().matches("NV\\d+"))
            .map(nv -> Integer.parseInt(nv.getIdNV().substring(2)))
            .max(Integer::compare);
        // Đặt biến đếm ID bằng ID lớn nhất + 1
        nextIdCounter = maxId.isPresent() ? maxId.get() + 1 : danhSachNV.size() + 1;
    }

    // ------------------------------------------------------------------
    // hàm này được thay đổi để tạo ID, nên không nhận ID từ bên ngoài nữa
    //thêm một NhanVien vào danh sách 
    public boolean themNhanVien(String hoTenDayDu, String chucVu, String gioiTinh, 
                            String tenDn, String matKhau, String email, String idDuongBay) {
    
    // ID mới
    String newId = String.format("NV%03d", nextIdCounter) ; // Ví dụ: NV001, NV002
    
    // Tách tên đầy đủ HoTen object
    NhanVien.HoTen hoTenObj = new NhanVien.HoTen();
    if (hoTenDayDu != null && !hoTenDayDu.trim().isEmpty()) {
        String[] words = hoTenDayDu.trim().split("\\s+");
        if (words.length > 0) {
            String ten = words[words.length - 1]; 
            String tenDem = "";
            if (words.length > 1) {
                // Dùng StringJoiner cho tên đệm
                StringJoiner sj = new StringJoiner(" ");
                for (int i = 0; i < words.length - 1; i++) {
                    sj.add(words[i]);
                }
                tenDem = sj.toString();
            }
            hoTenObj = new NhanVien.HoTen(tenDem, ten);
        }
    }
    
    NhanVien nv = new NhanVien(newId, hoTenObj, chucVu, idDuongBay, gioiTinh, tenDn, matKhau, email);
    
    danhSachNV.add(nv);
    System.out.println("Đã thêm nhân viên: " + nv.getHoTen().layTenDayDu() + " (ID: " + newId + ")");
    
    // Tăng biến ID
    nextIdCounter++;
    return true;
}

    // ------------------------------------------------------------------
    
    //sửa một NhanVien trong danh sách dựa trên IdNV.
    public boolean suaNhanVien(String idToUpdate, NhanVien newNvData) {
        for (int i = 0; i < danhSachNV.size(); i++) {
            NhanVien nv = danhSachNV.get(i);
            
            if (nv.getIdNV().equals(idToUpdate)) {
                // Cập nhật thông tin của nhân viên tại vị trí i
                if (newNvData.getHoTen() != null) {
                    nv.setHoTen(newNvData.getHoTen()); 
                }
                
                // Cập nhật các trường:
                if (newNvData.getChucVu() != null) nv.setChucVu(newNvData.getChucVu());
                if (newNvData.getGioiTinh() != null) nv.setGioiTinh(newNvData.getGioiTinh());
                if (newNvData.getIdDuongBay() != null) nv.setIdDuongBay(newNvData.getIdDuongBay());
                
                // Cập nhật tài khoản
                if (newNvData.getEmail() != null) nv.setEmail(newNvData.getEmail()); 
                if (newNvData.getTenDn() != null) nv.setTenDn(newNvData.getTenDn());
                if (newNvData.getMatKhau() != null) nv.setMatKhau(newNvData.getMatKhau());
                
                System.out.println("Thông tin nhân viên có ID: " + idToUpdate + " đã được cập nhật");
                return true;
            }
        }
        System.out.println("Lỗi!!! Không tìm thấy nhân viên có ID: " + idToUpdate + " để sửa");
        return false;
    }

    // ------------------------------------------------------------------
    
    // Xóa một NhanVien khỏi danh sách dựa trên IdNV.
    public boolean xoaNhanVien(String idToDelete) {
        boolean removed = danhSachNV.removeIf(nv -> nv.getIdNV().equals(idToDelete));
        
        if (removed) {
            System.out.println("Nhân viên có ID: " + idToDelete + " đã được xóa khỏi danh sách");
            capNhatIdCounter(); 
            return true;
        } else {
            System.out.println("Lỗi!!! Không tìm thấy nhân viên có ID: " + idToDelete + " để xóa");
            return false;
        }
    }
}