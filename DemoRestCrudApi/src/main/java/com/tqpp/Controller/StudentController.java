package com.tqpp.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tqpp.Model.Student;
import com.tqpp.service.StudentService;


@Controller
public class StudentController {
	
	@Autowired
	private StudentService studservice;
	
	@ResponseBody
	@GetMapping(value="/Students",produces="application/json")
	public List<Student> getAllStudents()
	{
		
		return studservice.getAllStudents();
		
	}
	@ResponseBody
	@GetMapping(value="/Students/{rollno}")
	public ResponseEntity<Student> getStudentById(@PathVariable("rollno")int id)
	{
		
	 Student obj= studservice.getStudentById(id);
	   if(obj==null)
		   return new ResponseEntity<Student> (HttpStatus.NOT_FOUND);
	   else
		   return new ResponseEntity<Student> (obj,HttpStatus.OK);
	
	}
	
	
	
	//json
	@ResponseBody
	@PostMapping(value="/Students")                                 //add
	public boolean addStudent(@RequestBody Student s)
	{
		
		System.out.println("***"+s);
		studservice.insertStudent(s);
		return true;
	}
	@ResponseBody
	@PutMapping(value="/Students/{sid}")                                //update
	public boolean updateStudent(@PathVariable("sid")  int sid, @RequestBody Student s)
	{
		
		studservice.updateStudent(s);
		return true;
	}
	
	
	
	
	/*@ResponseBody
	@DeleteMapping(value="/Students/{id}")                                //delete
	public boolean deleteStudent(@PathVariable("id")int sid)
	{
		Student s1=studservice.getStudentById(sid);
		studservice.deleteStudent(s1);
		return true;
	}*/
	
	
	
}	
	
	
	
	/*@ResponseBody
     @GetMapping(value="/", produces="application/json")
	
	public ArrayList<Student> getStudent()
	{
		ArrayList<Student> al=new ArrayList<Student>();
		
		Student s1=new Student(1,"Kunal",90,"Pune");
		al.add(s1);
		al.add(new Student(2,"Sham",55,"Nagar"));
		al.add(new Student(3,"Ganesh",75,"Goa"));
		al.add(new Student(4,"Gopal",46,"Delhi"));
		return al;
	}
	@ResponseBody
	 @GetMapping(value="/gatall", produces="application/json")
		
		public HashMap<String,Student> m2()
		{
			HashMap<String,Student> hm=new HashMap<>();
			
			//Student s1=new Student(1,"Kunal",90,"Pune");
			
			hm.put("Sham",new Student(2,"Sham",55,"Nagar"));
			hm.put("Ganesh",new Student(3,"Ganesh",75,"Goa"));
			hm.put("Gopal",new Student(4,"Gopal",46,"Delhi"));
			return hm;
		}*/
	
	
	

