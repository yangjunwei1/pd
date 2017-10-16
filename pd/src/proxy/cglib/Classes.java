package proxy.cglib;

import java.io.Serializable;
import java.util.Set;

public class Classes implements Serializable{
	private Long cid;
	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	private String cname;
	private String description;

}
