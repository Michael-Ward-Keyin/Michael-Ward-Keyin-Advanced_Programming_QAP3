class Ellipse extends Shape {
    private double a, b;

    public Ellipse(String name, double x, double y) {
        super(name);
        if (x >= y) {
            this.a = x;
            this.b = y;
        } else {
            this.a = y;
            this.b = x;
        }
    }

    @Override
    public double computePerimeter() {
        return Math.PI * 2 * (a * a + b * b) - Math.pow(a - b, 2) / 2;
    }

    @Override
    public double computeArea() {
        return Math.PI * a * b;
    }
}