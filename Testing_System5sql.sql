use Testing_System_Assignment_1;
-- cau 1
create view nvien AS select Account .* , Department.DepartmentName  from Department, Account where Account .DepartmentID =Department .DepartmentID  and DepartmentName  ='sale';
-- cau 2
CREATE VIEW Most_Group_join AS
SELECT ac.*
FROM Account ac
INNER JOIN	(
SELECT AccountID,count(GroupID)
	FROM GroupAccount a1
	GROUP BY AccountID
	HAVING count(GroupID)= (SELECT MAX(mycount)
	FROM ( SELECT AccountID, count(GroupID) mycount
				FROM GroupAccount a2
			GROUP BY AccountID	)a3)) gpa ON gpa.AccountID=ac.AccountID;
select * from Most_Group_join;
-- cau3
CREATE VIEW Long_question AS
SELECT *
FROM Question
WHERE char_length(content)>300;
DROP VIEW Long_question;
-- cau4
CREATE VIEW most_employees AS
	SELECT MAX(total_employees) AS total_employees FROM (
		SELECT d.DepartmentName, COUNT(a.AccountID) as total_employees FROM Department d
		INNER JOIN Account a ON d.DepartmentID = a.DepartmentID
		GROUP BY d.DepartmentName
	) as departmentname_n_total_employees;
    select * from most_employees;
-- cau 5

