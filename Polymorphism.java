class Areas{
    double area(double radius){
        return Math.PI*radius*radius;
    }

    double area(double length, double breadth){
        return length*breadth;
    }

    double area(double base, double height, boolean isTriangle){
        return 0.5*base*height;
    }
}

class Shape{
    void draw(){
        System.out.println("Drawing...");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a Circle...");

    }
}

class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a Rectangle...");
    
    }
}

class Polymorphism{
    public void main(String args[]){
        System.out.println("Compile time polymorphism");
        Areas a = new Areas();
        System.out.println("Area of Circle: "+a.area(2.5));
        System.out.println("Area of Rectangke: "+a.area(5.2,10.4));
        System.out.println("Area of Triangle: "+a.area(6.4,5.7,true));
        
        System.out.println("Run time polymorphism");

        Shape s;
        s=new Shape();
        s.draw();

        s=new Circle();
        s.draw();

        s=new Rectangle();
        s.draw();
    }
}