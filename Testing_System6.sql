use Testing_System_Assignment_1;
-- cau 1
DELIMITER $$
create procedure acc_dept (DeptName varchar(20))
begin
select Account.*,Department.DepartmentName from Department,Account where Account.DepartmentID=Department.DepartmentID and DepartmentName=DeptName;
end $$
DELIMITER;
-- cau  2
DELIMITER $$
create procedure count_acc(grname varchar(20))
begin
select GroupAccount.GroupID,GroupAccount.AccountID,Grouptable.GroupName,COUNT(*) AS number_of_account 
from GroupAccount,Grouptable 
where GroupAccount.GroupID=Grouptable.GroupID and GroupName=grname;
end $$
DELIMITER;

DELIMITER $$
DROP procedure type_ques_create;
-- cau 3
DELIMITER $$
 create procedure type_ques_create(IN type_name varchar(20))
 begin
 select TypeQuestion.*,count(TypeQuestion.TypeName) as Soluong
 from TypeQuestion,Question 
 where TypeQuestion.TypeID=Question.TypeID  and TypeName=type_name and month(CreateDate)=month(curdate()); 
 end $$
 DELIMITER;
DELIMITER $$ 
-- cau 4
DELIMITER $$
 create procedure type_ques_max()
 begin
	select typequestion.TypeId,count(*) from typequestion, question where typequestion.TypeId=question.TypeID
    group by typequestion.TypeId order by count(*) desc limit 1;
end $$
DELIMITER;
DELIMITER $$ 
-- cau 5
DELIMITER $$
 create procedure type_name_ques_max()
 begin
	select typequestion.TypeId,typequestion.TypeName,count(*) from typequestion, question where typequestion.TypeId=question.TypeID
    group by typequestion.TypeId order by count(*) desc limit 1;
end $$
DELIMITER;
DELIMITER $$ 

-- cau 9
DELIMITER $$
 create procedure delete_exam(exam_id int)
 begin
	delete from examquestion where ExamID=exam_id;
	delete from exam where ExamID=exam_id;
end $$
DELIMITER;
DELIMITER $$ 





