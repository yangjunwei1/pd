package chainOfResponsibility;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "";
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		FilterChain fc = new FilterChain();
		fc.addFilter(new AFilter())
		  .addFilter(new BFilter())
		  ;
		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new CFilter());
		
		fc.addFilter(fc2);
		mp.setFc(fc);
		String result = mp.process();
		System.out.println(result);
	}

}
