package test;

public class Person{
	private String name;
	private int phoneNo;
	private String address;
	
	
	public Person(String name, int phoneNo, String address) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phoneNo=" + phoneNo + ", address=" + address + "]";
	}
	
	
}