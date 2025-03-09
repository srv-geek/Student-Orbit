package com.tka.studentorbit.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String assignedFaculty;

    public Subject() {
		
	}

     public Subject(Long id, String name, String assignedFaculty) {
		super();
		this.id = id;
		this.name = name;
		this.assignedFaculty = assignedFaculty;
	}

      public Long getId() {
		return id;
	}

       public void setId(Long id) {
		this.id = id;
	}

       public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAssignedFaculty() {
		return assignedFaculty;
	}

	public void setAssignedFaculty(String assignedFaculty) {
		this.assignedFaculty = assignedFaculty;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", assignedFaculty=" + assignedFaculty + "]";
	}
    
}

