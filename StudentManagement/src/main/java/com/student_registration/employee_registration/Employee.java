package com.student_registration.employee_registration;

public class Employee {

	private String employeeId;
	private String firstname;
	private String lastname;
	private String email;
	private String city;
	private String mobileNumber;
	private String dateOfBirth;
	private String gender;
	private String department;
	private String yearOfJoining;
	private String retirementYear;
	private String password;
	
	
	
	public Employee(String employeeId, String firstname, String lastname, String email, String city,
			String mobileNumber, String dateOfBirth, String gender, String department, String yearOfJoining,
			String retirementYear, String password) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.city = city;
		this.mobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.retirementYear = retirementYear;
		this.password = password;
	}



	public String getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getYearOfJoining() {
		return yearOfJoining;
	}



	public void setYearOfJoining(String yearOfJoining) {
		this.yearOfJoining= yearOfJoining;
	}



	public String getRetirementYear() {
		return retirementYear;
	}



	public void setRetirementYear(String retirementYear) {
		this.retirementYear = retirementYear;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {

		return "studentId" + employeeId +" firstname" + firstname +" lastname" + lastname + " email" + email +  
				" city" + city +" mobileNumber" + mobileNumber + " dateOfBirth" + dateOfBirth + " gender" + gender + 
				" department" + department + " yearOfJoining" + yearOfJoining + " passoutYear" + passoutYear + 
				" passwourd" + password;
	
	}
	
	
}
