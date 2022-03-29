package EmployeeDetails;
class Person{
	{
		System.out.println();
	}
}
class Employee{
	private int empid;
	private double annualSalary;
	private int nationalInsuranceNum;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public int getNationalInsuranceNum() {
		return nationalInsuranceNum;
	}
	public void setNationalInsuranceNum(int nationalInsuranceNum) {
		this.nationalInsuranceNum = nationalInsuranceNum;
	}
	
}
public class EmployeeDet {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpid(10);
		e.setAnnualSalary(20000);
		e.setNationalInsuranceNum(586);
		System.out.println(e.getAnnualSalary()+" "+e.getNationalInsuranceNum()+" "+e.getEmpid());

		// TODO Auto-generated method stub

	}

}
