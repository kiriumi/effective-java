package jp.example.class_interface.interface_than_abstruct.class_hierarchy.ok;

class Rectangle implements Figure {

    final double length;
    final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

}
