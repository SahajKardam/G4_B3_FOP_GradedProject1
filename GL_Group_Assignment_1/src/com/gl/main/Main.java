package com.gl.main;

import com.gl.department.AdminDepartment;
import com.gl.department.HrDepartment;
import com.gl.department.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment adminDept = new AdminDepartment();
		 System.out.println("Welcome to "+ adminDept.departmentName());
		 System.out.println(adminDept.getTodaysWork());
		 System.out.println(adminDept.getWorkDeadline());
         System.out.println(adminDept.isTodayAHoliday()+"\n\n");
		 
		HrDepartment hrDept = new HrDepartment();
		 System.out.println("Welcome to "+ hrDept.departmentName());
		 System.out.println(hrDept.doActivity());
		 System.out.println(hrDept.getTodaysWork());
		 System.out.println(hrDept.getWorkDeadline());
		 System.out.println(hrDept.isTodayAHoliday()+"\n\n");
		 
		 
		TechDepartment techDept = new TechDepartment();
		 System.out.println("Welcome to "+ techDept.departmentName());
		 System.out.println(techDept.getTodaysWork());
		 System.out.println(techDept.getWorkDeadline());
		 System.out.println(techDept.getTechStackInformation());
		 System.out.println(techDept.isTodayAHoliday());
	}
}
