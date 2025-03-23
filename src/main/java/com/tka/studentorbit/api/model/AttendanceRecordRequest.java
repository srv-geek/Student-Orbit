package com.tka.studentorbit.api.model;

import java.util.List;

public class AttendanceRecordRequest {
	private String username;
	private Long subjectId;
	private String date;
	private String time;
	private int numberOfStudents;
	private Set<Student> students;

	public AttendanceRecordRequest() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	@Override
	public String toString() {
		return "AttendanceRecordRequest [username=" + username + ", subjectId=" + subjectId + ", date=" + date
				+ ", time=" + time + ", numberOfStudents=" + numberOfStudents + ", students=" + students + "]";
	}

}

