use testing_system_assignment_1;
-- c1
select * from account left join department on account.DepartmentID = department.DepartmentID;
-- c2
select * from account where CreateDate	>'2010-12-20';
-- c3
select * from account inner join positions on account.PositionID = positions.PositionID and positions.PositionName = 'Dev';
-- c4
select department.DepartmentName, count(*) as soLuongNV
from account inner join department 
on account.DepartmentID = department.DepartmentID 
group by department.DepartmentName  having count(*)>3;

-- C5
select question.Content, count(examquestion.ExamID) as soluong from exam inner join examquestion inner join question 
on exam.ExamID = examquestion.ExamID and question.QuestionID = examquestion.QuestionID
group by question.Content order by soluong desc limit 1;


-- c6
select categoryquestion.CategoryName, count(*) as soluongcau
from categoryquestion inner join question 
on categoryquestion.CategoryID = question.CategoryID 
group by categoryquestion.CategoryName;

-- c7
select question.Content, count(*) as SoluongExam from exam inner join examquestion inner join question 
on exam.ExamID = examquestion.ExamID and question.QuestionID = examquestion.QuestionID
group by question.Content;

