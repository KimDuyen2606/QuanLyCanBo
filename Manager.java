package advance.dev.dao;
import advance.dev.model.TaiLieu;
import advance.dev.dao.IManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class Manager implements IManager{
	private List<TaiLieu> tailieus = new ArrayList<>();
	@Override
	public void add(TaiLieu tl) {
		tailieus.add(tl);
	}
	@Override
	public void print() {
		for(TaiLieu tl : tailieus) {
			System.out.println(tl.getMatailieu()+tl.getTennhaxuatban()+tl.getSoluongphathanh());
		}
	}
	@Override
	public void sortByName(int order) {
		Collections.sort(tailieus, new Comparator<TaiLieu>() { 
			@Override
			public int compare(TaiLieu t1, TaiLieu t2) {
				return order == 1 ?
			  t1.getTennhaxuatban().compareTo(t2.getTennhaxuatban()) : t2.getTennhaxuatban().compareTo(t1.getTennhaxuatban());
			}
		});
	}
}
                                                                                      