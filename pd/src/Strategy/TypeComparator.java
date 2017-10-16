package Strategy;

/**
 * 
 * 具体的排序接口，和具体的实体类对象无关
 *
 */
public interface TypeComparator  {

	int comparatorTo(Object object1,Object object2);
}
