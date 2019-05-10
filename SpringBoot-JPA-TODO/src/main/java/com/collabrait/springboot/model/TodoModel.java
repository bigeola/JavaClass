package com.collabrait.springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="todo")
public class TodoModel {
	
	@Column(name ="task_id")
	@Id
	@GeneratedValue
	private int taskId;
	
	@Column(name="task")
	private String task;
	
	@Column(name="day")
	private String day;
	
	@Column(name="category")
	private String Category;

	public TodoModel(int taskId, String task, String day, String category) {
		super();
		this.taskId = taskId;
		this.task = task;
		this.day = day;
		Category = category;
	}

	public TodoModel(String task, String day, String category) {
		super();
		this.task = task;
		this.day = day;
		Category = category;
	}

	public TodoModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	@Override
	public String toString() {
		return "TodoModel [taskId=" + taskId + ", task=" + task + ", day=" + day + ", Category=" + Category + "]";
	}
	
	

}
