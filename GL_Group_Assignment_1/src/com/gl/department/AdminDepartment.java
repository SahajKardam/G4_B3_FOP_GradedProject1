package com.gl.department;

public class AdminDepartment extends SuperDepartment {
	public String  departmentName() {
		return "Admin department";
	}
	public String getTodaysWork() {
		return "Complete your Documents Submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
