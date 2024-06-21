package advance.dev.model;

public class Bao extends TaiLieu{
   private int ngayphathanh;
   
   public Bao(String matailieu, String tennhaxuatban, int soluongphathanh, int phatHanh) {
	   super(matailieu, tennhaxuatban, soluongphathanh);
	   this.ngayphathanh = phatHanh;
   }
   public int getNgayphathanh() {
	   return ngayphathanh;
   }
   public void setNgayphathanh(int ngayphathanh) {
	   this.ngayphathanh = ngayphathanh;
   }
}
