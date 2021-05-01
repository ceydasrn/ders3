package odev3;

public class Student extends User{
	private int studentNumber;
	private String takenCourses;
	private String homework;
	
	public int getStudentId() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getTakenCourses() {
		return takenCourses;
	}
	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}
	public String getHomework() {
		return homework;
	}
	public void setHomework(String homework) {
		this.homework = homework;
	}
	
	
}
