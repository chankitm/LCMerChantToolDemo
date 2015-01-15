package utiol;

import java.text.RuleBasedCollator;
import java.util.Comparator;

import model.ProductSortContent;

public class ProductStringComparable implements Comparator<ProductSortContent>{
 
	private RuleBasedCollator collationKey;
	
    public ProductStringComparable(RuleBasedCollator collationKey) {
		super();
		this.collationKey = collationKey;
	}


	@Override
    public int compare(ProductSortContent o1, ProductSortContent o2) {
		//return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));
		//(collationKey.compare(productKeys.get(j), productKeys.get(i)) >= 0)
        
//		return collationKey.compare(o1, o2);
		int result = collationKey.compare(o1.getProductKey(), o2.getProductKey());
		//return (result>0?-1:(result == 0?0:1));//desc
		return (result>0?1:(result == 0?0:-1));//asc
		
    }
}
