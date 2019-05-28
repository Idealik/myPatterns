import factoryPattern.MyFactoryPattern;

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
    }
}
