create database IF NOT exists Testing_System_Assignment_1;
create schema IF NOT exists Testing_System_Assignment_1;
use Testing_System_Assignment_1;
create table Department
(
DepartmentId int auto_increment primary key not null,
DepartmentName varchar(50)
);
create table Position
(
PositionID int auto_increment primary key not null,
PositionName varchar(20)
);
create table Account
(
AccountID int auto_increment primary key not null,
Email varchar(50),
Username varchar(50),
FullName varchar(50),
DepartmentID int,
PositionID int,
CreateDate timestamp,
constraint fk_acc_dep foreign key (DepartmentId) references Department(DepartmentId),
constraint fk_acc_pos foreign key (PositionID) references Position (PositionID)
);
create table Grouptable
(
GroupId int auto_increment primary key not null,
GroupName varchar(50),
CreatorID int,
CreateDate timestamp
);
create table GroupAccount
(
GroupID int,
AccountID int,
JoinDate timestamp,
primary key (GroupID, AccountID),
constraint fk_groupAcc_groupTable foreign key (GroupID) references Grouptable (GroupID),
constraint fk_groupAcc_Acc foreign key (AccountID) references Account (AccountID)
);
create table TypeQuestion
(
TypeId int auto_increment primary key not null,
TypeName varchar(10)
);
create table CategoryQuestion
(
CategoryID int auto_increment primary key not null,
CategoryName varchar(20)
);
create table Question
(
QuestionID int auto_increment primary key not null,
Content varchar(100),
CategoryID int,
TypeID int,
CreatorID int,
CreateDate timestamp,
constraint fk_ques_cate foreign key (CategoryID) references CategoryQuestion (CategoryID),
constraint fk_ques_cypeQues foreign key (TypeID) references TypeQuestion (TypeID)
);
create table Answer
(
AnswerID int auto_increment primary key not null,
Content varchar(100),
QuestionID int,
isCorrect varchar (10),
constraint fk_ans_ques foreign key (QuestionID ) references Question (QuestionID)
);
create table Exam
(
ExamID int auto_increment primary key not null,
Code varchar(10),
Title varchar(50),
CategoryID int,
Duration time,
CreatorID int,
CreateDate date,
constraint fk_exam_cate foreign key (CategoryID) references CategoryQuestion(CategoryID)
);
create table ExamQuestion
(
ExamID int,
QuestionID int,
primary key(ExamID, QuestionID),
constraint fk_examQues_exam foreign key (QuestionID ) references Question (QuestionID),
constraint fk_examQues_ques foreign key (ExamID ) references Exam (ExamID)
);




