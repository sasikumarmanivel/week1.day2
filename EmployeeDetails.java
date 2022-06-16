package myfirstjava;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId)
	{
		System.out.println(empName +empId);
		
	}

	
	private void getEmployeeAddress(String empAddress)
	{
		System.out.println(empAddress);
	}
	
	private String printEmployeeSalary(double empSalary)
	{
		System.out.println(empSalary);
		return"0";
		
	}
	
	public String printEmployeeMobileNumber(long mobNum)
	{
		System.out.println(mobNum);
		return"";
	}
	public static void main(String[] args) 
	{
	EmployeeDetails obj = new EmployeeDetails();
	obj.printEmployeeName("Employee name is " +"Sasi ", +370285);
	obj.getEmployeeAddress("coimbatore");
	obj.printEmployeeSalary(85000);
	obj.printEmployeeMobileNumber(9878765678L);
	
			
	}
	
} 
