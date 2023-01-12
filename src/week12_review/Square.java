package week12_review;

public class Square extends Shape {


    public Square(double side) {
        super("Square");
        setSide(side);
    }

    @Override
    public double calc_area() {
        return side*side;
    }

    @Override
    public double calc_perimeter() {
        return 4*side;
    }

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0) {

        }
        this.side = side;
    }
}
