package com.student_management.student_registration;

public class Student {

	private String studentId;
    private String firstname;	
    private String lastname;	
    private String email;	
    private String city;	
    private String mobileNumber;	
    private String dateOfBirth;	
    private String gender;	
    private String department;	
    private String yearOfJoining;	
    private String passoutYear;
    
    
    
	public Student(String studentId, String firstname, String lastname, String email, String city, String mobileNumber,
			String dateOfBirth, String gender, String department, String yearOfJoining, String passoutYear) {
		super();
		this.studentId = studentId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.city = city;
		this.mobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.passoutYear = passoutYear;
	}



	public String getStudentId() {
		return studentId;
	}



	public void setStudentId(String studentId) {
		this.studentId = studentId;
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



	public void setdateOfBirth(String dateOfBirth) {
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
		this.yearOfJoining = yearOfJoining;
	}



	public String getPassoutYear() {
		return passoutYear;
	}



	public void setPassoutYear(String passoutYear) {
		this.passoutYear = passoutYear;
	}
	
	@Override
	public String toString() {

		return "studentId" +studentId +" firstname" + firstname +" lastname" + lastname + " email" + email +  " city" + city +" mobileNumber" + mobileNumber + " dateOfBirth" + dateOfBirth + " gender" + gender + " department" + department + " yearOfJoining" + yearOfJoining + " passoutYear" + passoutYear;
	
	}
	
    
    
    
}
