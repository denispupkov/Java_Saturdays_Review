package week12_review;

public interface Volume {

    public static final boolean HAS_VOLUME = true;

    double calc_volume ();

    public static void shapesWithVolume () {
        System.out.println("ONLY the three dimensional shapes has volume");
    }

    public default void method1 () {
        System.out.println("instance method of the child classes");
    }

    }

