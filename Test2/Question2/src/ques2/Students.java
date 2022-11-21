package ques2;

import java.util.Scanner;

public class Students 
{ 
	public String name;
	public int marks;
	public String subject;
	public String address;

	public Students(String name, int marks, String subject, String address) {
	super();
	this.name = name;
	this.marks = marks;
	this.subject = subject;
	this.address = address;
	}



	public String getName() {
	return name;
	}



	public void setName(String name) {
	this.name = name;
	}



	public int getMarks() {
	return marks;
	}



	public void setMarks(int marks) {
	this.marks = marks;
	}



	public String getSubject() {
	return subject;
	}



	public void setSubject(String subject) {
	this.subject = subject;
	}



	public String getAddress() {
	return address;
	}



	public void setAddress(String address) {
	this.address = address;
	}



	@Override
	public String toString() {
	return "Student [name=" + name + ", marks=" + marks + ", subject=" + subject + ", address=" + address + "]";
	}



	}