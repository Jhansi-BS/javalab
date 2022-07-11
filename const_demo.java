package mca018;
class const_over{
    double l,b,h;
    const_over(double l,double b,double h)
    {
        this.l=l;
        this.b=b;
        this.h=h;

    }
    const_over(double l){
        l=b=h=l;
    }
    double volume()
    {
        return l*b*h;
    }
    void print()
    {
        System.out.println("method overloading");
    }
    void print(double v)
    {
      System.out.println("volume of box="+v);
    }
}

public class const_demo {
    public static void main(String[] args)
    {
    const_over cuboid=new const_over(10,20,10);
    const_over cube=new const_over(10);
    double v1=cuboid.volume();
    double v2=cube.volume();
    cuboid.print();
    cube.print();
    cuboid.print(v1);
    cube.print(v2);
}

}
    
