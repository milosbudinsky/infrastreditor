package eu.modesim.trade.infrastreditor.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lines")
public class Line {
    private Integer from;
    private Integer to;

    // Getters and Setters
}