package com.cega.miniclonpastebin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 2 , max = 30, message = "Name must be min 2 char and max 30")
	private String name;
	
	private Double salary;
	
	private int age;
	
	private String profilePicture;
	
	
}
