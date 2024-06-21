package advance.dev.model;

public class TaiLieu {
     private String matailieu;
     private String tennhaxuatban;
     private int soluongphathanh;
     
     public TaiLieu(String matailieu, String tennhaxuatban, int soluongphathanh) {
    	 this.matailieu = matailieu;
    	 this.tennhaxuatban = tennhaxuatban;
    	 this.soluongphathanh = soluongphathanh;
    	 
     }
    	 public String getMatailieu() {
    		 return matailieu; 
     }
    	 public void setMatailieu(String matailieu) {
    		 this.matailieu = matailieu;
    	 }
    	 public String getTennhaxuatban() {
    		 return tennhaxuatban;
    	 }
    	 public void setTennhaxuatban(String tennhaxuatban) {
    		 this.tennhaxuatban = tennhaxuatban;
    	 }
    	 public int getSoluongphathanh() {
    		 return soluongphathanh;
    	 }
    	 public void setSoluongphathanh(int soluongphathanh) {
    		 this.soluongphathanh = soluongphathanh;
    	 }
}
