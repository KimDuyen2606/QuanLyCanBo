package advance.dev.model;

public class Sach extends TaiLieu {
    private String tentacgia;
    private int sotrang;
    
    public Sach(String matailieu, String tennhaxuatban, int soluongphathanh, String tentacgia, int sotrang) {
    	super(matailieu, tennhaxuatban, soluongphathanh);
    	this.tentacgia = tentacgia;
    	this.sotrang = sotrang;
    }
    public String getTentacgia() {
    	return tentacgia;
    }
    public void setTentacgiac(String tentacgia) {
    	this.tentacgia = tentacgia;
    }
    public int getSotrang() {
    	return sotrang;
    }
    public void setSotrang(int sotrang) {
    	this.sotrang = sotrang;
    }
}
