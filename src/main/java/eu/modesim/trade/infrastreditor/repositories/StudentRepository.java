package eu.modesim.trade.infrastreditor.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import eu.modesim.trade.infrastreditor.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer>{

}
