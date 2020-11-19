create database UsersManager;
use UsersManager;
create table User
(
	ID 		INT(11) NOT NULL PRIMARY KEY,
	FullName 	VARCHAR(50) UNIQUE KEY NOT NULL,
    Email 		VARCHAR(50) UNIQUE KEY NOT NULL,
    `Password`	VARCHAR(50) NOT NULL CHECK(length(`Password`) >= 6),
    `Role`		ENUM('Employee','Manager')
);
CREATE TABLE Manager(
	ID 	int(11) not null primary key ,	
    ExpInYear INT(11),
    FOREIGN KEY (ID) REFERENCES User(ID)
);
CREATE TABLE Employee(
	ID 	int(11) not null primary key,
    Proskill varchar(10),
    FOREIGN KEY (ID) REFERENCES User(ID)
);
CREATE TABLE Project(
	ID 		INT(11) NOT NULL PRIMARY KEY,
    Teamsize int(11),
    ManagerID int(11),
    FOREIGN KEY (ManagerID) REFERENCES Manager(ID)

);
CREATE TABLE EmployeeProject(
	ProjectID int(11),	
    EmployeeID  int(11),
    primary key (EmployeeID, ProjectID),
    FOREIGN KEY (ProjectID) REFERENCES Project(ID),
    FOREIGN KEY (EmployeeID) REFERENCES Employee(ID)
);
