use Testing_System_Assignment_1;
-- --cau2
 select * from Department;
-- cau3
 select DepartmentId from Department where DepartmentName = 'Sale';
-- cau4
 select * from Account where char_length(FullName)=(select max(char_length(FullName)) from Account);
-- cau5
 select * from Account where char_length(FullName)=(select max(char_length(FullName)) from Account where DepartmentID=3) and DepartmentID=3;
-- cau6
select Groupname from GroupTable where day(CreateDate)<20 and month(CreateDate)<12 and year(CreateDate)<2019 ;
-- cau7
SELECT QuestionID
FROM	Question
WHERE	(SELECT COUNT(AnswerID)
        FROM	Answer
        WHERE	Question.QuestionID = Answer.QuestionID) >= 4;
-- cau 8
select Code from Exam where day(CreateDate)<20 and month(CreateDate)<12 and year(CreateDate)<2019 and Duration >='01:00:00';
-- cau9
select * from GroupTable order by (abs(2020-10-06)-CreateDate) asc limit 5;
-- cau10
select count(DepartmentId) from Account where DepartmentId=2;
-- cau11
SELECT     FuLLName
FROM    Account
WHERE    FullName LIKE CONCAT('D', '%', 'o');
-- cau14
UPDATE Account 
SET 
    FuLLName = 'Nguyen Ba Loc',
    Email = 'loc.nguyenba@vti.com.vn'
WHERE
    AccountID = 5;
-- cau 15
UPDATE GroupAccount 
SET 
    GroupID = 4
WHERE
    AccountID = 5;

