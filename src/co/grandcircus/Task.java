package co.grandcircus;

import java.time.LocalDate;

public class Task {

	private String name;
	private String description;
	private LocalDate dueDate;
	private String completed;
	
	public Task() {
		completed = "false";
	}
	public Task(String name, String description, LocalDate dueDate) {
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		completed = "false";
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public void setCompleted(String completed) {
		this.completed = completed;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public String getCompleted() {
		return completed;
	}
	@Override
	public String toString() {
		return "Name=" + name + ", Description=" + description + ", DueDate=" + dueDate + ", Completed="
				+ completed;
	}
	

}
