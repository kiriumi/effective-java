package jp.example.class_interface.interface_than_abstruct.class_hierarchy.ok;

class Circle implements Figure {

    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }

}
