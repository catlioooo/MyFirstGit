interface Shape {
    double PI = 3.14;    //考點public static final

    double area();       //考點public abstract
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return PI * r * r;
    }
}

class Rectangle implements Shape {
    double height, width;

    Rectangle(double height, double width) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {  //考點
        return height * width;
    }
}

public class Ch14_1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 10);
        System.out.println("圓形面積:" + circle.area());
        System.out.println("矩形面積:" + rectangle.area());
        System.out.println("Shape PI:" + Shape.PI); //考點
        System.out.println("Circle PI:" + Circle.PI); //考點
        System.out.println("Rectangle PI:" + Rectangle.PI); //考點
    }
}
