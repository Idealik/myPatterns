package StructuralPatterns;

import java.awt.*;
import java.util.ArrayList;

public class Composite implements ShapeComposite {

    private ArrayList<ShapeComposite> components = new ArrayList<>();

    public void addComponent(ShapeComposite component) {
        components.add(component);
    }

    public void removeComponent(ShapeComposite component) {
        components.remove(component);
    }

    @Override
    public void draw() {
        for (ShapeComposite component: components){
            component.draw();
        }
    }
}
