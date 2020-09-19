package communityuni.com.model;

public class Circle extends Point {
    private double radius;

    // constructor
    public Circle() {
        super();
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(int x,int y,double radius){
        super(x, y);
        this.radius = radius;
    }


    // getter setter
    public double getRadius() {
        return radius;
    }

    public double setRadius(double radius) {
        this.radius = radius;
        return radius;
    }

    // method
    // tinh duong kinh hinh tron
    public double getDiameter(){
        return (this.getRadius())*2;
    }

    // tinh chu vi hinh tron
    public double getCircumference(){
        return Math.PI*this.radius*2;
    }

    // tinh dien tich hinh tron
    public double getArea(){
        return Math.PI*Math.pow(this.getRadius(),2);
    }

    @Override
    public String toString() {
        return this.getDiameter() + "-" + this.getCircumference() + "-" + this.getArea();
    }
}
