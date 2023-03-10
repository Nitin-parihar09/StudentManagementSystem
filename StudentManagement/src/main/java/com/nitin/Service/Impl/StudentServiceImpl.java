package com.nitin.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nitin.Entity.Students;
import com.nitin.Repository.StudentRepository;
import com.nitin.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepo;
	
	public StudentServiceImpl(StudentRepository studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Students> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Students saveStudent(Students student) {
		
		return studentRepo.save(student);
	}

}
