package com.gl.department;

public class HrDepartment extends SuperDepartment {
	public String  departmentName() {
		return "HR department";
	}
	public String getTodaysWork() {
		return "Fill today's timesheet and marks your attendence";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "team Lunch";
	}
}
