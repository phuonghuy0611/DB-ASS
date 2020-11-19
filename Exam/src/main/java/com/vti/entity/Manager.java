package com.vti.entity;

public class Manager extends User {
	private int ExpInYear;
	private Role role;

	public Manager(int id, String fullName, String email, String password, int ExpInYear, Role role) {
		super(id, fullName, email, password, Role.Manager);
		this.ExpInYear = ExpInYear;
		this.role = role;
	}

	public int getExpInYear() {
		return ExpInYear;
	}

	public Role getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "Admin [ExpInYear=" + ExpInYear + ", getId()=" + getId() + ", getFullName()=" + getFullName()
				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getRole()=" + getRole()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
