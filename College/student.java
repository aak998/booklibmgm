package College;

import java.util.Scanner;

public class student {
    String studentName;
    String regNum;

book borrowBooks[]=new book[3];
public int booksCount=0;
Scanner input=new Scanner(System.in);

public student(){
    System.out.println("enter student name ");
    this.studentName=input.nextLine();
    System.out.println("enter registration number");
    this.regNum=input.nextLine();
}
}
