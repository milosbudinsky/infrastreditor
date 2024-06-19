package eu.modesim.trade.infrastreditor.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Points")
public class Point {
    @Id
    private Integer id;
    private String name;
    private double[] coordinates;

    // Getters and Setters
}