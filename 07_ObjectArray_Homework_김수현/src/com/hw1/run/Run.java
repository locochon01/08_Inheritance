package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {
		
	public static void main(String[] args) {
	
		Employee[] eArr = new Employee[3];
		
		eArr[0] = new Employee();
		eArr[1] = new Employee(1, "홍길동", 19, 'M', "010-1234-5678", "서울 잠실");
		eArr[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "010-9876-5432", "서울 마포");
	
		for(int i = 0; i < eArr.length; i++) {
			System.out.println("eArr["+i+"] : " + eArr[i].Information());
		}
	
		System.out.println("===================================");
		
		eArr[0].setEmpName("김말똥");
		eArr[0].setDept("영업부");
		eArr[0].setJob("팀장");
		eArr[0].setAge(35);
		eArr[0].setGender('M');
		eArr[0].setSalary(3000000);
		eArr[0].setBonusPoint(0.2);
		eArr[0].setPhone("010-1234-5678");
		eArr[0].setAddress("서울시 마포구");
		
		eArr[1].setDept("기획부");
		eArr[1].setJob("부장");
		eArr[1].setSalary(4000000);
		eArr[1].setBonusPoint(0.3);
		
		for(int i = 0; i < eArr.length -1; i++) {
			System.out.println("eArr["+i+"] : " + eArr[i].Information());
		}
		
		System.out.println("=================");
		
		int aver = 0;
		
		for (int i = 0; i<eArr.length; i++) {
		
			int salary = 0; 
			
			salary = (int)(eArr[i].getSalary() + (eArr[i].getSalary() * eArr[i].getBonusPoint())) * 12;
			
			System.out.printf("%s의 연봉 : %d원\n", eArr[i].getEmpName(), salary);
			
			aver += salary;
		}
		
		System.out.println("===============================");
		
		System.out.printf("직원들의 연봉의 평균 : %d원", aver/eArr.length);
		
	}

}
