package BUS;
import java.util.ArrayList;
import java.util.Scanner;

import DTO.VeBanDTO;


public class ChucNangVe implements ChucNang <VeBanDTO> {
	ArrayList<VeBanDTO> v1 = new ArrayList<VeBanDTO>();
	static Scanner sc = new Scanner (System.in);

	public void them(VeBanDTO T) {
		// TODO Auto-generated method stub
		v1.add(T);
		
	}

	 public  void suaTheoMa(String x) {
		VeBanDTO t=new VeBanDTO();
		System.out.println("Nhap Ma ve Moi");
		t.setMaVe(sc.nextLine());
		System.out.println("Nhap soluong moi");
		t.setSoLuongBan(sc.nextInt());
		System.out.println("Nhap vitricho moi");
		t.setViTriCho(sc.nextLine());
		System.out.println("");
		// TODO Auto-generated method stub
		for(VeBanDTO t1 :v1 ) {
			if(t1.getMaVe()==x) {
				
			}
		}
		
	}

	@Override
	public void xoaTheoDoiTuong(VeBanDTO T) {
		// TODO Auto-generated method stub
		
	}


	

	
	
	
	
	
	
	
}
