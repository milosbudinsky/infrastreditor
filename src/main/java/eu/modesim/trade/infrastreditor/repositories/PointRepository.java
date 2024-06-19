package eu.modesim.trade.infrastreditor.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import eu.modesim.trade.infrastreditor.model.Point;

public interface PointRepository extends MongoRepository<Point, Integer> {
}