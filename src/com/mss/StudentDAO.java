package com.mss;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDAO {
	private HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	public void saveStudent(Student s){  
	  template.save(s);  
	}  
	public void updateStudent(Student s)
	{
		template.update(s);
	}
	public void deleteStudent(Student s)
	{
		template.delete(s);
	}
	
	public List<Student> getStudent()
	{
	    List<Student> q = template.find("from Student");
	   System.out.println(q.size());
	    return (List<Student>) q;
	}
}
