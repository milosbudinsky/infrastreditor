package eu.modesim.trade.infrastreditor.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lines")
public class Line {
    private Integer from;
    private Integer to;
    public String toString() {
    	return "from=" + from + "to=" + to; 	
    }
    // Getters and Setters
	public Integer getFrom() {
		return from;
	}
	public void setFrom(Integer from) {
		this.from = from;
	}
	public Integer getTo() {
		return to;
	}
	public void setTo(Integer to) {
		this.to = to;
	}
}