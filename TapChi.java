package advance.dev.model;

public class TapChi extends TaiLieu {
    private int sophathanh;
    private int thangphathanh;
    
    public TapChi(String matailieu, String tennhaxuatban, int soluongphathanh, int sophathanh, int thangphathanh) {
    	super(matailieu, tennhaxuatban, soluongphathanh);
    	this.sophathanh = sophathanh;
    	this.thangphathanh = thangphathanh;
    }
    public int getSophathanh() {
    	return sophathanh;
    }
    public void setSophathanh(int sophathanh) {
    	this.sophathanh = sophathanh;
    }
    public int getThangphathanh() {
    	return thangphathanh;
    }
    public void setThangphathanh(int thangphathanh) {
    	this.thangphathanh = thangphathanh;
    }
}
