package mca018;
class outer
{
    int outer_x=100;
    class Inner
    {
     int inner_y=200;
     void imethod(){
        System.out.println("Accessing from inner class");
        System.out.println(outer_x);
        System.out.println(inner_y+outer_x);
     }
    }
    void display()
    {
        Inner ob1=new Inner();
        System.out.println("the value of inner class variable"+ob1.inner_y);
        System.out.println("the value of outer class variable"+outer_x);
    }
    }

public class acces {public static void main(String[] args) {
    outer obname=new outer();
    obname.display();
    outer.Inner obj2=obname.new Inner();
    obj2.imethod();
}
    
}
