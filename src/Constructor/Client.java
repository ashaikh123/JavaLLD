package Constructor;

public class Client {
    public static void main(String[] args)
    {
        Student s=new Student(41);
        s.Name="Vinay";
        s.rollno=20;
       // s.pass=Boolean.TRUE

        System.out.println("Name="+s.Name);
        System.out.println("marks="+s.marks);
        s.getresult();

        Student s1=new Student();


        s1.Name="AAkash";
        s1.rollno=21;
        s1.marks=54;

//      deep copy constructor
//      Student s2=new Student(s1);

//      shallow copy constructor
        Student s2=s1;
        s2.marks=5;

        System.out.println("Name="+s1.Name);
        System.out.println("marks="+s1.marks);
        s1.getresult();


        System.out.println("Name="+s2.Name);
        System.out.println("marks="+s2.marks);
        s2.getresult();

    }
}
