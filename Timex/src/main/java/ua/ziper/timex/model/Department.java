package ua.ziper.timex.model;

public class Department {
	
	private int   departmentId;
	private String name;
	
	public Department(){
		
	}
	
	public long getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
