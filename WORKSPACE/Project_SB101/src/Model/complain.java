package Model;

public class complain {
	private int cid;
	private String description;
	private int eid;
	private String satus;
	private int id;
	private String attend;
	
	
	

	public int getCid() {
		return cid;
	}


	public complain(int cid, String description, int eid, String satus, int id, String attend) {
		super();
		this.cid = cid;
		this.description = description;
		this.eid = eid;
		this.satus = satus;
		this.id = id;
		this.attend = attend;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getSatus() {
		return satus;
	}


	public void setSatus(String satus) {
		this.satus = satus;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAttend() {
		return attend;
	}


	public void setAttend(String attend) {
		this.attend = attend;
	}


	public complain() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "complain [compalain id=" + cid + ", problem description=" + description + ",Empoly id=" + eid + ", satus of problem=" + satus
				+ ", attend or not attend  =" + attend + "]";
	}
	

}
