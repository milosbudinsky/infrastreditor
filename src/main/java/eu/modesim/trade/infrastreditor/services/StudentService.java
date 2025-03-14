package eu.modesim.trade.infrastreditor.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

import eu.modesim.trade.infrastreditor.model.Student;
import eu.modesim.trade.infrastreditor.repositories.StudentRepository;

@Service
public class StudentService implements CrudListener<Student>{
	private final StudentRepository repository;
	
	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Student> findAll(){
		return this.repository.findAll();
	}
	
	@Override
	public Student add(Student student) {
		return repository.save(student);
	}
	
	@Override
	public Student update(Student student) {
		return this.repository.save(student);
	}

	@Override
	public void delete(Student student) {
		this.repository.delete(student);
	}
}
