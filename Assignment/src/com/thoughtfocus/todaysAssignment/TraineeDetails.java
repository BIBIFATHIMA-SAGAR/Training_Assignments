package com.thoughtfocus.todaysAssignment;

public class TraineeDetails {
	private int id;
	private String name;
	private long number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "TraineeDetails [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	
	

}
