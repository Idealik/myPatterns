package StructuralPatterns;

public class RectangleComposite implements ShapeComposite {
    @Override
    public void draw() {
        System.out.println("I am rectangle");
    }
}
