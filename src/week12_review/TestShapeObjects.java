package week12_review;

public class TestShapeObjects {

    public static void main(String[] args) {

        Cube cube = new Cube(10);

        System.out.println();
        cube.method1();
        cube.calc_volume();
        Volume.shapesWithVolume();
        cube.calc_area();
        cube.calc_perimeter();

        System.out.println(cube);

    }
}
