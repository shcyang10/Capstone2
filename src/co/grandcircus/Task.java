package co.grandcircus;

import java.time.LocalDate;

public class Task {

	private String name;
	private String description;
	private String dueDate;
	private String completed;
	
	

	public Task() {
		completed = "false";
		
	}

	public Task(String name, String description, String dueDate) {
		super();
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		completed = "false";
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDueDate() {
		return dueDate;
	}


	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}


	public String isCompleted() {
		return completed;
	}


	public void setCompleted(String completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		String myFormat = "Name: %30-s Description %30-s Due Date %15-s Done? %10-s";
		return String.format(myFormat, name, description, dueDate, completed);
	}
	
}
