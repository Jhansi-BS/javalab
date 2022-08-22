package shape;

public class CST {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.getData(5.5);   
        System.out.println("Area of Circle is" +circle.area());
        Square square=new Square();
        square.getData(5);
        System.out.println("Area of Square is" +square.area());
        Triangle triangle=new Triangle();
        triangle.getData(5, 4);
        System.out.println("Area of triangle is" +triangle.area());
    }
    
}
