package com.system.model;

import jakarta.persistence.*;

@Entity
public class Insurance {
//	Attributes
	@Id
	private String insID;
	private String pkgType;
	private int noOfYears;
	@OneToOne(mappedBy = "insurence")
	private Employee employee;
}
