package eu.modesim.trade.infrastreditor.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import eu.modesim.trade.infrastreditor.model.Line;

@Repository
public interface LineRepository extends MongoRepository<Line, Integer> {
}