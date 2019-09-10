import GenerativePatterns.BuilderPatternCar;
import GenerativePatterns.Singleton;
import GenerativePatterns.factoryPattern.MyFactoryPattern;
import StructuralPatterns.*;
import StructuralPatterns.Composite;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        /*
        Этот паттерн необходим для динамической замены одного продукта другим.
        Т. е. код уже скомпилирован, но у тебя все же есть возможность выбора любого другого продукта.
        Так же он позволят сократить время на добавление другого продукта.
         */
        System.out.println("Factory");
        MyFactoryPattern myFactoryPattern = new MyFactoryPattern("digital");

        //Позволяет не создавать множество конструкторов, чтобы реализовать гибкий объект
        System.out.println("Builder");
        BuilderPatternCar builderPatternCar = new BuilderPatternCar.Builder()
                .setName("BMW")
                .setColor("Black")
                .setMaxSpeed(500)
                .build();
        System.out.println(builderPatternCar.getName()
                + " " + builderPatternCar.getColor()
                + " " + builderPatternCar.getMaxSpeed());

        System.out.println("GenerativePatterns.Singleton");
        Object singletone = Singleton.getInstance();

        IVectorGraphics vectorGraphics = new VectorAdapterFromRaster();
        vectorGraphics.drawCircle();
        vectorGraphics.drawLine();

        //composite
        //Компоновщик — это структурный паттерн проектирования,
        //который позволяет сгруппировать множество объектов в древовидную структуру,
        //а затем работать с ней так, как будто это единичный объект.
        System.out.println("GenerativePatterns.COMPOSITE");
        ShapeComposite rec = new RectangleComposite();
        ShapeComposite rec1 = new RectangleComposite();
        ShapeComposite rec2 = new RectangleComposite();

        ShapeComposite circle = new CircleComposite();
        ShapeComposite circle1 = new CircleComposite();
        ShapeComposite circle2 = new CircleComposite();
        ShapeComposite circle3 = new CircleComposite();

        Composite composite = new Composite();
        Composite composite2 = new Composite();
        Composite composite3 = new Composite();
        composite.addComponent(rec);
        composite.addComponent(rec2);

        composite2.addComponent(circle1);
        composite2.addComponent(rec1);
        composite.addComponent(composite2);
        composite3.addComponent(circle);
        composite3.addComponent(circle2);
        composite3.addComponent(circle3);
        composite.addComponent(composite3);
        composite.draw();
    }
}
