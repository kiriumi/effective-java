package jp.example.class_interface.interface_than_abstruct.class_hierarchy.anti;

class Figure {

    enum Shape {
        RECTANGLE, CIRCLE
    }

    final Shape shape;

    // shapeがRECTANGLEの時だけ使われる
    double length;
    double width;

    // 長方形のコンストラクタ
    Figure(double length, double width) {
        this.shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    // shapeがCIRCLEの時だけ使われる
    double radius;

    // 円のコンストラクタ
    Figure(double radius) {
        this.shape = Shape.CIRCLE;
        this.radius = radius;
    }

    double area() {
        switch (shape) {

        case RECTANGLE:
            return length * width;
        case CIRCLE:
            return Math.PI * (radius * radius);
        default:
            throw new AssertionError(shape);
        }
    }
}
