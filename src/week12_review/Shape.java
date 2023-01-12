package week12_review;

import java.text.DecimalFormat;

public abstract class Shape {

    private final String name;


    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calc_area ();

    public abstract double calc_perimeter ();

    //public abstract void eat (String food);

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return name+"{" +
                "name='" + name + '\'' +
                "perimeter='" + df.format(calc_perimeter()) + '\'' +
                "area='" + df.format(calc_area()) + '\'' +
                '}';
    }
}
