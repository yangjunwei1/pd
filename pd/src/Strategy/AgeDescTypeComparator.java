package Strategy;
/**
 * 
 * 按照年纪倒叙排序
 *
 */
public class AgeDescTypeComparator implements TypeComparator {

	@Override
	public int comparatorTo(Object object1, Object object2) {
		DongWu c1 = (DongWu) object1;
		DongWu dw = (DongWu) object2;
		if (c1.getAge() > dw.getAge()) {
			return -1;
		} else if (c1.getAge() < dw.getAge()) {
			return 1;
		}
		return 0;
	}

}
