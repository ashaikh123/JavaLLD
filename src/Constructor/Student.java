package Constructor;

import javax.naming.Name;

public class Student {
    protected String Name;
    public int marks;
    int rollno;
    private boolean pass;
    public Student(){
    }
    public Student(int marks){
        this.marks=marks;
    }
    public Student(Student s){
        this.Name=s.Name;
        this.rollno=s.rollno;
        this.marks=s.marks;
        this.pass=s.pass;
    }

    public void getresult()
    {
        if (marks>40)
        {
            pass=true;
            System.out.println("Pass="+pass);
        }
        else{
            pass=false;
            System.out.println("Pass="+pass);
        }

    }
}
