package com;

public class Test {

	public static void main(String[] args) {

		System.out.println("First Project convert in Github");
		
		Student s = new Student();
		
		s.setId(11);
		s.setSname("Mauli");
		s.setAddress("Pune");

		
		System.out.println("Check Student Data :- "+ s);
		
		
		Employee e = new Employee();
		
		e.setId(22);
		e.setEname("Sumit");
		e.setAddress("nigdi");
		
		System.out.println("Employee data Set :-"+e);
	}

}
