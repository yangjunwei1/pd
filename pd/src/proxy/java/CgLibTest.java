package proxy.java;

import net.sf.cglib.proxy.Enhancer;

public class CgLibTest {

	public static void main(String[] args) {
		
		UserDao dao = new UserDao();
		
		Enhancer en = new Enhancer();
		en.setSuperclass(dao.getClass());
		en.setCallback(new DaoInterceptor());
		
		UserDao proxyDao = (UserDao) en.create();
		proxyDao.save();
		
	}
}
