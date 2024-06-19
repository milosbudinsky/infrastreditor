package eu.modesim.trade.infrastreditor.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import eu.modesim.trade.infrastreditor.model.Line;

public interface LineRepository extends MongoRepository<Line, Integer> {
}