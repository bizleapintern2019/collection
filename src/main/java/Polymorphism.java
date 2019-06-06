abstract class Shape {

    protected int x;
    protected int y;

    public abstract int area();
}

class Rectangle extends Shape {

    public Rectangle(int x, int y) {
        
        this.x = x;
        this.y = y;
    }

    @Override
    public int area() {
        
        return this.x * this.y;
    }
}

class Square extends Shape {

    public Square(int x) {
        
        this.x = x;
    }

    @Override
    public int area() {

        return this.x * this.x;
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Shape[] shapes = { new Square(5),
            new Rectangle(9, 4), new Square(12) };

        for (Shape shape : shapes) {
            
            System.out.println(shape.area());
        }
    }
}