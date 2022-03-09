package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.stdrepo;
import com.example.demo.entity.Student;

@Service
public class stdservice {

	@Autowired
	private stdrepo repo;
	
	public List<Student> getAllStudents(){
		return repo.findAll();
		
	}
	public Student addNewStd(Student student) {
		return repo.save(student);
	}
	public Student updateStd(Student student,int stdId)throws Exception{
		if(repo.findById(stdId).isPresent()) {
			student.setStdId(stdId);
			return repo.save(student);		
	}
	else {
		throw new Exception("Invalid Id");
	}
}
	public void delete(int stdId) {
		repo.deleteById(stdId);
	}
}