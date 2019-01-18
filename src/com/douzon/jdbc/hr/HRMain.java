package com.douzon.jdbc.hr;

import java.util.List;
import java.util.Scanner;

import com.douzon.jdbc.hr.dao.EmployeeDao;
import com.douzon.jdbc.hr.vo.EmployeeVo;

public class HRMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("검색어>>");
		String keyword = scanner.nextLine();
		
		List<EmployeeVo> list = new EmployeeDao().getList(keyword);
		for(EmployeeVo vo : list) {
			System.out.println("[" + vo.getEmpNo() + "]" + vo.getFirstName() + " " + vo.getLastName() + " " + vo.getHireDate());
		}
		
		scanner.close();
	}
}
