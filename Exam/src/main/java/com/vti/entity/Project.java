package com.vti.entity;

public class Project {
	
		private int projectId;
		private int teamSize;
		private Manager idManager;
		private Employee idEmployees[];

		public Project(int projectId, int teamSize, Manager idManager, Employee idEmployees[]) {
			super();
			this.projectId = projectId;
			this.teamSize = teamSize;
			this.idManager = idManager;
			this.idEmployees = idEmployees;
		}

		public Project() {
		}

		public int getProjectId() {
			return projectId;
		}

		public void setProjectId(int projectId) {
			this.projectId = projectId;
		}

		public int getTeamSize() {
			return teamSize;
		}

		public void setTeamSize(int teamSize) {
			this.teamSize = teamSize;
		}

		public Manager getIdManager() {
			return idManager;
		}

		public void setIdManager(Manager idManager) {
			this.idManager = idManager;
		}

		public Employee[] getIdEmployees() {
			return idEmployees;
		}

		public void setIdEmployees(Employee[] idEmployees) {
			this.idEmployees = idEmployees;
		}

	}

