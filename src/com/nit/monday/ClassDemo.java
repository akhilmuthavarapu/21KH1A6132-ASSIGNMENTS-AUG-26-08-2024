package com.nit.monday;

class employee
{
	 String name;
	 String org;
	 double salary;
	 String dept;
	public employee(String name,String org,double salary,String dept)
	{
		this.name=name;
		this.org=org;
		this.salary=salary;
		this.dept=dept;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", org=" + org + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
}
public class ClassDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1=new employee("akhil","google",1234567955.5,"development");
		System.out.println(e1);
		
		
		
	}

}
