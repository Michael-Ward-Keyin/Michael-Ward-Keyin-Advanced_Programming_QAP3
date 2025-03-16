public class Demo {
    public static void main(String[] args) {
        Scalable[] shapes = new Scalable[4];

        shapes[0] = new Ellipse("Ellipse1", 6, 4);
        shapes[1] = new Circle("Circle1", 5);
        shapes[2] = new Triangle("Triangle1", 3, 4, 5);
        shapes[3] = new EquilateralTriangle("EquilateralTriangle1", 6);

        System.out.println("Before Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        double scaleFactor = 1.5;
        scaleAll(shapes, scaleFactor);

        System.out.println("\nAfter Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleAll(Scalable[] arr, double factor) {
        for (Scalable s : arr) {
            s.scale(factor);
        }
    }
}