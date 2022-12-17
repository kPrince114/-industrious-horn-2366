package Model;

public class Engineer {
	private int id;
	private String username;
	private int password;
	private int complainId;
	private String categri;
	public Engineer(int id, String username, int password, int complainId, String categri) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.complainId = complainId;
		this.categri = categri;
	}
	public Engineer() {
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getComplainId() {
		return complainId;
	}
	public void setComplainId(int complainId) {
		this.complainId = complainId;
	}
	public String getCategri() {
		return categri;
	}
	public void setCategri(String categri) {
		this.categri = categri;
	}
	
	
	@Override
	public String toString() {
		return "Engineer [my id=" + id + ", my username=" + username + ", my password=" + password + ", complainId=" + complainId
				+ ", categri=" + categri + "]";
	}

}
