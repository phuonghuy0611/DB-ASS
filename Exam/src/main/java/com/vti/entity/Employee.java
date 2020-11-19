package com.vti.entity;

public class Employee extends User {
	private Project projectId;
	private String ProSkill;

	public Employee(int id, String fullName, String email, String password, Project projectId, String ProSkill) {
		super(id, fullName, email, password, Role.Employee);
		this.projectId = projectId;
		this.ProSkill = ProSkill;

	}

	public void setProSkill(String proSkill) {
		ProSkill = proSkill;
	}

	public Project getProjectId() {
		return projectId;
	}

	public void setProjectId(Project projectId) {
		this.projectId = projectId;
	}

	@Override
	public String toString() {
		return "Employee [ProjectId=" + projectId + ",ProSkill=" + ProSkill + ", getId()=" + getId()
				+ ", getFullName()=" + getFullName() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getRole()=" + getRole() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}