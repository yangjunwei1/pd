package chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{

	private List<Filter> list = new ArrayList<Filter>();
	public FilterChain addFilter(Filter s) {
		list.add(s);
		return this;
	}
	
	public String doFilter(String s) {
		for (Filter f : list) {
			f.doFilter(s);
		}
		System.out.println("链处理数据1");
		return s;
	}

}
