package week12_review;

import static java.lang.Math.*;


public class Circle extends Shape{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public void setRadius(double radius) {
        setRadius(radius);
    }

    @Override
    public double calc_area() {
        return pow(radius,2);
    }

    @Override
    public double calc_perimeter() {
        return radius*2*PI;
    }
}
