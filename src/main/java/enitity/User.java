package enitity;

import java.util.List;

public class User {

	private String userName;
	private String userPwd;
	private int userAge;
	private boolean sex;
	private List<String> hoby;
	private String birthday;
	public User(String userName, String userPwd, int userAge, boolean isMan, List<String> hoby, String birthday) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.userAge = userAge;
		this.sex = isMan;
		this.hoby = hoby;
		this.birthday = birthday;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public boolean isMan() {
		return sex;
	}
	public void setMan(boolean isMan) {
		this.sex = isMan;
	}
	public List<String> getHoby() {
		return hoby;
	}
	public void setHoby(List<String> hoby) {
		this.hoby = hoby;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPwd=" + userPwd + ", userAge=" + userAge + ", sex=" + sex
				+ ", hoby=" + hoby + ", birthday=" + birthday + "]";
	}
	
	
}
