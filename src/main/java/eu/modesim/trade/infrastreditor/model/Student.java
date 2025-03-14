package eu.modesim.trade.infrastreditor.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Student {

	@Id
	@EqualsAndHashCode.Include
	private Integer student;
	
	private String firstName;
	
	private String lastName;
	
}
