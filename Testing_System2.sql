use Testing_System_Assignment_1;
insert into Department(DepartmentName) value ('sale');
insert into Department(DepartmentName) value ('marketing');
insert into Department(DepartmentName) value ('IT');
insert into Department(DepartmentName) value ('HR');
insert into Department(DepartmentName) value ('Audit');

insert into Positions(PositionName) value ('Dev');
insert into Positions(PositionName) value ('Test');
insert into Positions(PositionName) value ('Scrum Master');
insert into Positions(PositionName) value ('PM');
insert into Positions(PositionName) value ('Director');

insert into Account(Email,Username,FullName,DepartmentID,PositionID,CreateDate) value ('phuonghuy@gmail.com','phuonghuy123','Nguyễn Ngọc Phương Huy','1','1','2020-1-1 12:12:12');
insert into Account(Email,Username,FullName,DepartmentID,PositionID,CreateDate) value ('nguyenkhanh@gmail.com','nguyenkhanh123','Nguyễn Văn Khánh','2','2','2020-3-4 09:15:25');
insert into Account(Email,Username,FullName,DepartmentID,PositionID,CreateDate) value ('tuankhai@gmail.com','tuankhai123','Lâm Tuấn Khải','3','3','2020-5-8 15:00:00');
insert into Account(Email,Username,FullName,DepartmentID,PositionID,CreateDate) value ('minhhuy@gmail.com','minhhuy123','Đỗ Minh Huy','4','4','2020-8-8 17:26:54');
insert into Account(Email,Username,FullName,DepartmentID,PositionID,CreateDate) value ('phamnhat@gmail.com','phamnhat123','Phạm Văn Nhật','5','5','2020-9-7 21:22:23');

insert into Grouptable(GroupName,CreatorID,CreateDate) value ('Dragon','1','2020-2-2 13:00:00');
insert into Grouptable(GroupName,CreatorID,CreateDate) value ('Phoniex','2','2020-3-4 15:00:00');
insert into Grouptable(GroupName,CreatorID,CreateDate) value ('Tech','3','2020-4-6 18:00:00');
insert into Grouptable(GroupName,CreatorID,CreateDate) value ('Star','4','2020-5-8 20:00:00');
insert into Grouptable(GroupName,CreatorID,CreateDate) value ('Tiger','5','2020-6-10 10:00:00');

insert into GroupAccount(GroupID,AccountID,JoinDate) value ('1','10','2020-3-3');
insert into GroupAccount(GroupID,AccountID,JoinDate) value ('2','11','2020-4-5');
insert into GroupAccount(GroupID,AccountID,JoinDate) value ('3','12','2020-5-6');
insert into GroupAccount(GroupID,AccountID,JoinDate) value ('4','13','2020-6-7');
insert into GroupAccount(GroupID,AccountID,JoinDate) value ('5','14','2020-7-8');

insert into TypeQuestion(TypeName) value ('Easy');
insert into TypeQuestion(TypeName) value ('Hard');
insert into TypeQuestion(TypeName) value ('Medium');
insert into TypeQuestion(TypeName) value ('Easy');
insert into TypeQuestion(TypeName) value ('Hard');

insert into CategoryQuestion(CategoryName) value ('Java');
insert into CategoryQuestion(CategoryName) value ('.Net');
insert into CategoryQuestion(CategoryName) value ('SQL');
insert into CategoryQuestion(CategoryName) value ('Postman');
insert into CategoryQuestion(CategoryName) value ('Ruby');

insert into Question(Content,CategoryID,TypeID,CreatorID,CreateDate) value ('Constructor là gì','1','1','1','2020-5-5');
insert into Question(Content,CategoryID,TypeID,CreatorID,CreateDate) value ('Mục đích của constructor là gì','2','2','2','2020-5-5');
insert into Question(Content,CategoryID,TypeID,CreatorID,CreateDate) value ('Constructor trả về kiểu giá trị gì','3','3','3','2020-6-5');
insert into Question(Content,CategoryID,TypeID,CreatorID,CreateDate) value ('Constructor được kế thừa không','4','4','4','2020-7-6');
insert into Question(Content,CategoryID,TypeID,CreatorID,CreateDate) value ('Có thể tạo constructor final không','5','5','5','2020-8-7');

insert into Answer(Content,QuestionID,isCorrect) value ('Constructor được sử dụng để khởi tạo trạng thái của một đối tượng','1','yes');
insert into Answer(Content,QuestionID,isCorrect) value ('Constructor mặc định cung cấp các giá trị mặc định cho các đối tượng','2','yes');
insert into Answer(Content,QuestionID,isCorrect) value ('Constructor trả về thể hiện của lớp hiện tại','3','yes');
insert into Answer(Content,QuestionID,isCorrect) value ('Có','4','no');
insert into Answer(Content,QuestionID,isCorrect) value ('không,constructor không thể là final','5','yes');

insert into Exam(Code,Title,CategoryID,Duration,CreatorID,CreateDate) value ('A12','ex1','1','1:00:00','1','2020-2-2');
insert into Exam(Code,Title,CategoryID,Duration,CreatorID,CreateDate) value ('B22','ex2','1','1:00:00','1','2020-3-3');
insert into Exam(Code,Title,CategoryID,Duration,CreatorID,CreateDate) value ('C32','ex3','1','1:00:00','1','2020-4-4');
insert into Exam(Code,Title,CategoryID,Duration,CreatorID,CreateDate) value ('D42','ex4','1','1:00:00','1','2020-5-5');
insert into Exam(Code,Title,CategoryID,Duration,CreatorID,CreateDate) value ('E52','ex5','1','1:00:00','1','2020-6-6');

insert into ExamQuestion(ExamID,QuestionID) value ('1','1');
insert into ExamQuestion(ExamID,QuestionID) value ('2','2');
insert into ExamQuestion(ExamID,QuestionID) value ('3','3');
insert into ExamQuestion(ExamID,QuestionID) value ('4','4');
insert into ExamQuestion(ExamID,QuestionID) value ('5','5');

 
 




