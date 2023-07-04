package College;

import java.util.Scanner;

public class book {


        public int sNo;
        public  String bookName;
        public String authorName;
        public int bookQty;
        public int bookQtyCopy;
        Scanner input=new Scanner(System.in);

    public book(){
        System.out.println("enter serial no of book");
        this.sNo= input.nextInt();
        System.out.println("enter name of book");
        this.bookName= input.next();
        System.out.println("enter name of author");
        this.authorName= input.nextLine();
        System.out.println("enter quantity no of book");
        this.bookQty= input.nextInt();
        bookQtyCopy= this.bookQty;
    }


    }

