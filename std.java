class student
{
     int usn;
     String name;
     void getdata(int u,String N)//local variable
     {
        this.usn=u;
        this.name=N;
     }
     void printdata()
     {
        System.out.println(name+"\t"+usn);
     }

}

public class std {public static void main(String[] args) {
    student s=new student();// object creation
    s.getdata(10,"smith");
    s.printdata();
}
    
}
