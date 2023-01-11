package com.cg.placement.client;
import com.cg.placement.entity.Student;
import com.cg.placement.service.IStudentService;
import com.cg.placement.service.StudentServiceImpl;

public class Client 
{
	public static void main(String[] args) 
	{
		// CRUD operation calling activity
		Student student = new Student();
		
		IStudentService service = new StudentServiceImpl();
		
		/* Create
		student.setId(103);
		student.setName("priya");
		student.setRoll(49);
		student.setQualification("M.Tech");
		student.setCourse("cs");
		student.setYear(2023);
		student.setCertificate("ST");
		student.setHallTicketNo(222);
		student.setCollege("VTU");
		service.addStudent(student);
		*/
		// Retrieve
		/*
		student	= service.searchStudentById(103);
		System.out.println("ID is:"+student.getId());
		System.out.println("Roll is:"+student.getRoll());
		System.out.println("College is:"+student.getCollege());
		
		*/
		
		  
		
		
		//Update
		student	= service.searchStudentById(103);
		student.setCollege("Reva University");
		service.updateStudent(student);
		System.out.println("Update is successful");
		
		/*
		
		student	= service.searchStudentById(101);
		service.deleteStudent(student);
		System.out.println("Delete is successful");
		
		
		student	= service.searchStudentByHallTicket(111);
		service.deleteStudent(student);
		System.out.println("Delete is successful");
		
		*/
		
	}

}
