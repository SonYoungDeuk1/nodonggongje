package nodonggongje.jsp.nodong.model;

public class User {
	private int idx;
	private String user_id;
	private String user_pw;
	private String user_pw_old;
	private String user_name;
	private String user_gender;
	private String user_birthday;
	private String user_phone;
	private String regdate;
	private String editdate;
	private int admin;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_pw_old() {
		return user_pw_old;
	}
	public void setUser_pw_old(String user_pw_old) {
		this.user_pw_old = user_pw_old;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public String getUser_birthday() {
		return user_birthday;
	}
	public void setUser_birthday(String user_birthday) {
		this.user_birthday = user_birthday;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getEditdate() {
		return editdate;
	}
	public void setEditdate(String editdate) {
		this.editdate = editdate;
	}
	public int getAdmin() {
		return admin;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "User [idx=" + idx + ", user_id=" + user_id + ", user_pw=" + user_pw + ", user_pw_old=" + user_pw_old
				+ ", user_name=" + user_name + ", user_gender=" + user_gender + ", user_birthday=" + user_birthday
				+ ", user_phone=" + user_phone + ", regdate=" + regdate + ", editdate=" + editdate + ", admin=" + admin
				+ "]";
	}
	
}
