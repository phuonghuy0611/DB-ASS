package testing1;

import java.util.*;
import java.lang.*;
import java.sql.Time;
public class Application {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);		
//		int soluong;
//		
//		System.out.println("nhap so luong phong ban= ");
//		soluong=sc.nextInt();sc.nextLine();
//		Department[] depart	= new Department[soluong];
//		
//		for (int i = 0; i < soluong; i++) {
//			System.out.println("nhap phong ban thu "+(i+1));
//			depart[i] = new Department();
//			depart[i].input();
//		}
//		
//		for (int i = 0; i < depart.length; i++) {
//			depart[i].output();
//
//		}
      //Department
      Department department1= new Department();
      department1.departmentID = 1;
      department1.departmentName = "Sale";
      
      Department department2= new Department();
      department2.departmentID = 2;
      department2.departmentName = "Marketing";
      
      Department department3= new Department();
      department3.departmentID = 3;
      department3.departmentName = "IT";
      //Position
      Position position1=new Position();
      position1.positionID=1;
      position1.positionName="Dev";
      
      Position position2=new Position();
      position2.positionID=2;
      position2.positionName="Test";
      
      Position position3=new Position();
      position3.positionID=3;
      position3.positionName="PM";
      //Account
      Account account1=new Account();
      account1.accountID=1;
      account1.email="phuonghuy@gmail.com";
      account1.username="nnphuy";
      account1.fullname="Nguyen Ngoc Phuong Huy";
      account1.departmentID=1;
      account1.positionID=1;
      account1.createdate=new Date ("2020/2/2");
      
      Account account2=new Account();
      account2.accountID=2;
      account2.email="nguyenkhanh@gmail.com";
      account2.username="nvkhanh";
      account2.fullname="Nguyen Van Khanh";
      account2.departmentID=2;
      account2.positionID=2;
      account2.createdate=new Date ("2020/8/20");
      
      Account account3=new Account();
      account3.accountID=2;
      account3.email="tuankhai@gmail.com";
      account3.username="ltkhai";
      account3.fullname="Lam Tuan Khai";
      account3.departmentID=2;
      account3.positionID=2;
      account3.createdate= new Date ("2020/5/1");
      //Group
      Group group1=new Group();
      group1.groupID=1;
      group1.groupname="Java Fresher";
      group1.creatorID=1;
      group1.createdate=new Date ("2020/1/1");
      
      Group group2=new Group();
      group2.groupID=2;
      group2.groupname="C# Fresher";
      group2.creatorID=2;
      group2.createdate=new Date ("2020/4/10");
      
      Group group3=new Group();
      group3.groupID=3;
      group3.groupname="Python Fresher";
      group3.creatorID=3;
      group3.createdate=new Date ("2020/3/5");
      //GroupAccount
      GroupAccount groupaccount1=new GroupAccount();
      groupaccount1.groupID=1;
      groupaccount1.accountID=1;
      groupaccount1.joindate=new Date ("2020/3/3");
    		  
      GroupAccount groupaccount2=new GroupAccount();
      groupaccount2.groupID=2;
      groupaccount2.accountID=2;
      groupaccount2.joindate=new Date("2020/9/10");
    		  
      GroupAccount groupaccount3=new GroupAccount();
      groupaccount3.groupID=3;
      groupaccount3.accountID=3;
      groupaccount3.joindate=new Date("2020/6/8");
      //TypeQuestion
      TypeQuestion typequestion1=new TypeQuestion();
      typequestion1.typeID=1;
      typequestion1.typename="Essay";
      
      TypeQuestion typequestion2=new TypeQuestion();
      typequestion2.typeID=1;
      typequestion2.typename="Multiple-Choice";
      
      TypeQuestion typequestion3=new TypeQuestion();
      typequestion3.typeID=3;
      typequestion3.typename="Essay";
      //CategoryQuestion
      CategoryQuestion categoryquestion1=new CategoryQuestion();
      categoryquestion1.categoryID=1;
      categoryquestion1.categoryname="Java";
      
      CategoryQuestion categoryquestion2=new CategoryQuestion();
      categoryquestion2.categoryID=2;
      categoryquestion1.categoryname=".NET";
      
      CategoryQuestion categoryquestion3=new CategoryQuestion();
      categoryquestion3.categoryID=3;
      categoryquestion3.categoryname="SQL";
      //Question
      Question question1=new Question();
      question1.questionID=1;
      question1.content="Cau hoi ve Java";
      question1.categoryID=1;
      question1.typeID=1;
      question1.creatorID=1;
      question1.createdate=new Date ("2020/5/5");
      
      Question question3=new Question();
      question3.questionID=3;
      question3.content="Cau hoi ve Python";
      question3.categoryID=3;
      question3.typeID=3;
      question3.creatorID=3;
      question3.createdate=new Date ("2020/9/22");
      
      Question question2=new Question();
      question2.questionID=2;
      question2.content="Cau hoi ve .NET";
      question2.categoryID=2;
      question2.typeID=2;
      question2.creatorID=2;
      question2.createdate=new Date ("2020/4/4");
      //Answer
      Answer answer1=new Answer();
      answer1.answerID=1;
      answer1.content="";
      answer1.questionID=1;
      answer1.iscorrect=true;
      
      Answer answer2=new Answer();
      answer2.answerID=2;
      answer2.content="";
      answer2.questionID=2;
      answer2.iscorrect=true;
      
      Answer answer3=new Answer();
      answer3.answerID=3;
      answer3.content="";
      answer3.questionID=3;
      answer3.iscorrect=false;
      //Exam
      Exam exam1=new Exam();
      exam1.examID=1;
      exam1.code="A1";
      exam1.title="kiem tra kien thuc Java";
      exam1.categoryID=1;
      exam1.duration= new Time(00,45,0);
      exam1.creatorID=1;
      exam1.createdate=new Date ("2020/8/31");
      
      Exam exam2=new Exam();
      exam2.examID=2;
      exam2.code="B2";
      exam2.title="kiem tra kien thuc .NET";
      exam2.categoryID=2;
      exam2.duration=new Time(01,00,0);
      exam2.creatorID=2;
      exam2.createdate=new Date ("2020/7/20");
      
      Exam exam3=new Exam();
      exam3.examID=3;
      exam3.code="C3";
      exam3.title="kiem tra kien thuc Java";
      exam3.categoryID=3;
      exam3.duration=new Time(01,30,0);
      exam3.creatorID=3;
      exam3.createdate=new Date ("2020/6/22");
      //ExamQuestion
      ExamQuestion examquestion1=new ExamQuestion();
      examquestion1.examID=1;
      examquestion1.questionID=1;
      
      ExamQuestion examquestion2=new ExamQuestion();
      examquestion2.examID=2;
      examquestion2.questionID=2;
      
      ExamQuestion examquestion3=new ExamQuestion();
      examquestion3.examID=3;
      examquestion3.questionID=3;
    //In ra phong ban
     System.out.println("Thong tin phong ban 1:");
     System.out.println("id:" +department1.departmentID);
     System.out.println("name:" +department1.departmentName);
     System.out.println("\n");
    //In ra chuc vu
     System.out.println("Thong tin chuc vu 1:");
     System.out.println("id:" +position1.positionID);
     System.out.println("name:" +position1.positionName);
     System.out.println("\n");
     //In ra Account
     System.out.println("Thong tin account 1:");
     System.out.println("id:" +account1.accountID);
     System.out.println("email:" +account1.email);
     System.out.println("username:" +account1.username);
     System.out.println("fullname:" +account1.fullname);
     System.out.println("departmentID:" +account1.departmentID);
     System.out.println("positionID:" +account1.positionID);
     System.out.println("ngay tao:" +account1.createdate);
     System.out.println("\n");
     //In ra Group
     System.out.println("Thong tin Group 1:");
     System.out.println("id:" +group1.groupID);
     System.out.println("name:" +group1.groupname);
     System.out.println("id nguoi tao:" +group1.creatorID);
     System.out.println("ngay tao:" +group1.createdate);
     System.out.println("\n");
     //In ra GroupAccount
     System.out.println("Thong tin GroupAccount 1:");
     System.out.println("id:" +groupaccount1.accountID);
     System.out.println("dinh danh user:" +groupaccount1.accountID);
     System.out.println("ngay tham gia:" +groupaccount1.joindate);
     System.out.println("\n");
     //In ra TypeQuestion
     System.out.println("Thong tin TypeQuestion 1:");
     System.out.println("id:" +typequestion1.typeID);
     System.out.println("ten loai cau hoi:" +typequestion1.typename);
     System.out.println("\n");
     //In ra CategoryQuestion
     System.out.println("Thong tin CategoryQuestion 1:");
     System.out.println("id:" +categoryquestion1.categoryID);
     System.out.println("ten chu de:" +categoryquestion1.categoryname);
     System.out.println("\n");
     //In ra Question
     System.out.println("Thong tin Question 1:");
     System.out.println("id:" +question1.questionID);
     System.out.println("noi dung:" +question1.content);
     System.out.println("dinh danh chu de:" +question1.categoryID);
     System.out.println("dinh danh loai cau hoi:" +question1.typeID);
     System.out.println("id nguoi tao cau hoi:" +question1.creatorID);
     System.out.println("ngay tao:" +question1.createdate);
     System.out.println("\n");
     //In ra Answer
     System.out.println("Thong tin Answer 1:");
     System.out.println("id:" +answer1.answerID);
     System.out.println("noi dung:" +answer1.content);
     System.out.println("dinh danh cau hoi:" +answer1.questionID);
     System.out.println("T or F:" +answer1.iscorrect);
     System.out.println("\n");
     //In ra Exam
     System.out.println("Thong tin Exam 1:");
     System.out.println("examid:" +exam1.examID);
     System.out.println("ma de:" +exam1.code);
     System.out.println("tieu de:" +exam1.title);
     System.out.println("dinh danh chu de thi:" +exam1.categoryID);
     System.out.println("thoi gian:" +exam1.duration);
     System.out.println("id nguoi tao:" +exam1.creatorID);
     System.out.println("ngay tao:" +exam1.createdate);
     System.out.println("\n");
     //In ra ExamQuestion
     System.out.println("Thong tin ExamQuestion 1:");
     System.out.println("examid:" +examquestion1.examID);
     System.out.println("question:" +examquestion1.questionID);     
     System.out.println("\n");
     
    //cau 1
     
     if (departmentID==null) {
    	 System.out.println("Nhan vien nay chua co phong ban");
  
     }else {
    	 System.out.println("Phong ban cua nhan vien nay la:" +account2.departmentID);
     }
  
     
      
      
      
      
      
    		  
}
}
