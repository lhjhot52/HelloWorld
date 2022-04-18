package co.edu.friend;

public class ComFriend extends Friend{
	
	private String company;
	private String department;
	
	public ComFriend() {
		super();
	}
	public ComFriend(String company, String department, String name, String phone) {
		super(name, phone);
		this.company = company;
		this.department = department;
		
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
//	@Override
//	public void setPhone(String phone) {
//	super.setPhone("연락처는" + phone);
//	}
	
//	public void setName(String name) {
//		super.setName("이름은" + name);
//	}
	@Override
	public String toString() {
		return "ComFriend [name=" + this.getName() + ", phone=" + getPhone() + ", company= " + company + ", department=" + department + "]";
	}
	
	
}
