package com.system.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Employee extends Person{
	
//	Attributes
	@Id
	private String empID;
	@Column(nullable = false)
	
	private double salary;
	
	@ManyToOne
	private Department department;
	
	@ManyToMany(mappedBy = "employees")
	private List<Project>projects;
	
	@OneToOne
	private Insurance insurance;
	
//	Getters & Setters
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
//	Constructor
	public Employee(String empID, String name, int age, double salary, String address) {
		super(name, age, address);
		this.empID = empID;
		this.salary = salary;
	}
	

}